package com.qjyd.appraisal.points.service.impl;

import com.qjyd.appraisal.points.bean.po.PointsFlow;
import com.qjyd.appraisal.points.dao.PointsFlowMapper;
import com.qjyd.appraisal.points.service.PointsFlowService;
import com.qjyd.appraisal.points.util.XrxsMapper.XrxsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointFlowServiceImpl extends BaseServiceImpl<PointsFlow> implements PointsFlowService {

    @Autowired
    PointsFlowMapper pointsFlowMapper;
    public XrxsMapper<PointsFlow> dao() {
        return this.pointsFlowMapper;
    }


}
