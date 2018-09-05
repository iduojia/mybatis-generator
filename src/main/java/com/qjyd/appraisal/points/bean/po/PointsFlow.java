package com.qjyd.appraisal.points.bean.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "points_flow")
public class PointsFlow {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    private Date addtime;

    /**
     * 积分员工ID
     */
    @Column(name = "points_employee_id")
    private Long pointsEmployeeId;

    /**
     * 送出积分员工ID
     */
    @Column(name = "points_send_employee_id")
    private Long pointsSendEmployeeId;

    /**
     * 模型ID
     */
    @Column(name = "points_model_id")
    private Long pointsModelId;

    /**
     * 模型项目ID
     */
    @Column(name = "points_model_item_id")
    private Integer pointsModelItemId;

    /**
     * 积分数
     */
    private Integer points;

    /**
     * 积分是否自动（0=否/1=是）
     */
    private Integer way;

    /**
     * 是否有效（0=无效/1=有效）
     */
    private Integer effective;

    /**
     * 数据来源（0=考勤后台/1=app/…)
     */
    private Integer source;

    /**
     * 是否删除（0=否/1=是）
     */
    @Column(name = "is_del")
    private Byte isDel;

    private Date modtime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return addtime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取积分员工ID
     *
     * @return points_employee_id - 积分员工ID
     */
    public Long getPointsEmployeeId() {
        return pointsEmployeeId;
    }

    /**
     * 设置积分员工ID
     *
     * @param pointsEmployeeId 积分员工ID
     */
    public void setPointsEmployeeId(Long pointsEmployeeId) {
        this.pointsEmployeeId = pointsEmployeeId;
    }

    /**
     * 获取送出积分员工ID
     *
     * @return points_send_employee_id - 送出积分员工ID
     */
    public Long getPointsSendEmployeeId() {
        return pointsSendEmployeeId;
    }

    /**
     * 设置送出积分员工ID
     *
     * @param pointsSendEmployeeId 送出积分员工ID
     */
    public void setPointsSendEmployeeId(Long pointsSendEmployeeId) {
        this.pointsSendEmployeeId = pointsSendEmployeeId;
    }

    /**
     * 获取模型ID
     *
     * @return points_model_id - 模型ID
     */
    public Long getPointsModelId() {
        return pointsModelId;
    }

    /**
     * 设置模型ID
     *
     * @param pointsModelId 模型ID
     */
    public void setPointsModelId(Long pointsModelId) {
        this.pointsModelId = pointsModelId;
    }

    /**
     * 获取模型项目ID
     *
     * @return points_model_item_id - 模型项目ID
     */
    public Integer getPointsModelItemId() {
        return pointsModelItemId;
    }

    /**
     * 设置模型项目ID
     *
     * @param pointsModelItemId 模型项目ID
     */
    public void setPointsModelItemId(Integer pointsModelItemId) {
        this.pointsModelItemId = pointsModelItemId;
    }

    /**
     * 获取积分数
     *
     * @return points - 积分数
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 设置积分数
     *
     * @param points 积分数
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 获取积分是否自动（0=否/1=是）
     *
     * @return way - 积分是否自动（0=否/1=是）
     */
    public Integer getWay() {
        return way;
    }

    /**
     * 设置积分是否自动（0=否/1=是）
     *
     * @param way 积分是否自动（0=否/1=是）
     */
    public void setWay(Integer way) {
        this.way = way;
    }

    /**
     * 获取是否有效（0=无效/1=有效）
     *
     * @return effective - 是否有效（0=无效/1=有效）
     */
    public Integer getEffective() {
        return effective;
    }

    /**
     * 设置是否有效（0=无效/1=有效）
     *
     * @param effective 是否有效（0=无效/1=有效）
     */
    public void setEffective(Integer effective) {
        this.effective = effective;
    }

    /**
     * 获取数据来源（0=考勤后台/1=app/…)
     *
     * @return source - 数据来源（0=考勤后台/1=app/…)
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置数据来源（0=考勤后台/1=app/…)
     *
     * @param source 数据来源（0=考勤后台/1=app/…)
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取是否删除（0=否/1=是）
     *
     * @return is_del - 是否删除（0=否/1=是）
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除（0=否/1=是）
     *
     * @param isDel 是否删除（0=否/1=是）
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * @return modtime
     */
    public Date getModtime() {
        return modtime;
    }

    /**
     * @param modtime
     */
    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }
}