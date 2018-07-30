package org.kjtc.entity;

import org.kjtc.util.StringUtils;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @program:org.kjtc.entity
 * @description: 定时任务专用 设置分析配置项
 * @author: chenxu
 * @create:2018-04-24 15:12
 */


public class OptionCreate {

    private List<String> fields;

    private String tableName;

    private DiagnosisHistory diagnosisHistoryAll;

    private String equipmentId;

    private Integer type;

    private Date diagnosisTime;

    private Boolean isFault=false;

    private List<String> FaultDescription;

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Boolean getFault() {
        return isFault;
    }

    public void setFault(Boolean fault) {
        isFault = fault;
    }

    public Date getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(Date diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public DiagnosisHistory getDiagnosisHistoryAll() {
        return diagnosisHistoryAll;
    }

    public void setDiagnosisHistoryAll(DiagnosisHistory diagnosisHistoryAll) {
        this.diagnosisHistoryAll = diagnosisHistoryAll;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public void setFaultDescriptionItem(String item){

        if (null==this.FaultDescription){

            FaultDescription=new LinkedList<String>();

        }

        if (StringUtils.isEmpty(item)){

            return;
        }

        FaultDescription.add(item);

    }

    public String getFaultDescriptionItem(){

        if(null == FaultDescription || FaultDescription.size()==0)
        {

            return null;

        }

        return ((LinkedList<String>) FaultDescription).pop();

    }

    public Integer getFaultDescriptionSize(){

        if(null == FaultDescription || FaultDescription.size()==0)
        {

            return 0;

        }

        return FaultDescription.size();
    }

}
