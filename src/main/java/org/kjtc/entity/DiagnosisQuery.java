package org.kjtc.entity;

import java.util.Date;

/**
 * @program:org.kjtc.entity
 * @description:定时任务统计每月信息query
 * @author: chenxu
 * @create:2018-05-14 13:50
 */


public class DiagnosisQuery {

    private Date dayTime;

    private Integer num;

    private String equipmentID;

    private Date queryDate;

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public Date getDayTime() {
        return dayTime;
    }

    public void setDayTime(Date dayTime) {
        this.dayTime = dayTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }
}
