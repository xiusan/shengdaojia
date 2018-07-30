package org.kjtc.entity;

import java.util.Date;

/**
 * @program:org.kjtc.entity
 * @description:闫鹏程的代码
 * @author: chenxu
 * @create:2018-04-23 14:35
 */


public class EquipmentDiagnosisYpc {
    private int id;//主键
    private String chargingStationID;//充电站id
    private String chargingStationName;//充电站名称
    private String equipmentName;//充电桩名称
    private String equipmentID;//充电桩id
    private String equipmentTypeName;//充电桩类型
    private String equipmentPowerTypeName;//充电桩型号
    private Integer communicationStatus;//通讯状态
    private Integer faultStatus;//故障状态
    private Date recentDiagnosisTime;//最近诊断时间
    private String faultDescription;//故障描述
    private String createUser;//创建者
    private Date createDTTM;//创建时间
    private String updateUser;//更新者
    private Date updateDTTM;//更新时间

    public String getChargingStationName() {
        return chargingStationName;
    }

    public void setChargingStationName(String chargingStationName) {
        this.chargingStationName = chargingStationName;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Date getRecentDiagnosisTime() {
        return recentDiagnosisTime;
    }

    public void setRecentDiagnosisTime(Date recentDiagnosisTime) {
        this.recentDiagnosisTime = recentDiagnosisTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }

    public String getChargingStationID() {
        return chargingStationID;
    }

    public void setChargingStationID(String chargingStationID) {
        this.chargingStationID = chargingStationID;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentPowerTypeName() {
        return equipmentPowerTypeName;
    }

    public void setEquipmentPowerTypeName(String equipmentPowerTypeName) {
        this.equipmentPowerTypeName = equipmentPowerTypeName;
    }

    public Integer getCommunicationStatus() {
        return communicationStatus;
    }

    public void setCommunicationStatus(Integer communicationStatus) {
        this.communicationStatus = communicationStatus;
    }

    public Integer getFaultStatus() {
        return faultStatus;
    }

    public void setFaultStatus(Integer faultStatus) {
        this.faultStatus = faultStatus;
    }

    public Date getEcentDiagnosisTime() {
        return recentDiagnosisTime;
    }

    public void setEcentDiagnosisTime(Date ecentDiagnosisTime) {
        this.recentDiagnosisTime = recentDiagnosisTime;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDTTM() {
        return createDTTM;
    }

    public void setCreateDTTM(Date createDTTM) {
        this.createDTTM = createDTTM;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateDTTM() {
        return updateDTTM;
    }

    public void setUpdateDTTM(Date updateDTTM) {
        this.updateDTTM = updateDTTM;
    }


}
