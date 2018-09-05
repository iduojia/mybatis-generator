package com.qjyd.appraisal.points;

import com.alibaba.fastjson.JSON;
import com.qjyd.appraisal.points.bean.po.PointsFlow;
import com.qjyd.appraisal.points.service.PointsFlowService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import java.util.List;


@SpringBootApplication
@RestController
@MapperScan(basePackages = "com.qjyd.appraisal.points.dao")
public class ApplicationStart {
    @Resource
    PointsFlowService pointsFlowService;

    @RequestMapping(value = "testgenerator")
    public void testgenerator() {
        PointsFlow pf = new PointsFlow();
        pf.setPointsEmployeeId(Long.parseLong("5051"));
        int count = pointsFlowService.selectCount(pf);
        System.out.println("selectCount测试： 流水中5051的员工数量为："+count);

        List<PointsFlow> list = pointsFlowService.select(pf);
        System.out.println(JSON.toJSONString(list));
        System.out.println("select测试："+list);


        Example example=new Example(PointsFlow.class);
        example.createCriteria().andEqualTo("pointsEmployeeId",5051);
        List<PointsFlow> list1 =  pointsFlowService.selectByExample(example);
        System.out.println("selectbyExample查询："+JSON.toJSONString(list1));
    }





    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}


