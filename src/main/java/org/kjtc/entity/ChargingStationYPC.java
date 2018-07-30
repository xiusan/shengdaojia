package org.kjtc.entity;

import java.util.Date;

public class ChargingStationYPC {
    private String chargingStationId;//充电站Id
    private String chargingStationName; //充电站Name
    private int projectNo;//工程期数
    private String  chargingStationAdress;//充电站地址
    private double longitude;//经度
    private double latitude;//纬度
    private String createUser;//创建者
    private Date dateDTTM;//创建时间
    private String updateUser;//更新者
    private Date updateDTTM;//更新时间

    public String getChargingStationId() {
        return chargingStationId;
    }

    public void setChargingStationId(String chargingStationId) {
        this.chargingStationId = chargingStationId;
    }

    public String getChargingStationName() {
        return chargingStationName;
    }

    public void setChargingStationName(String chargingStationName) {
        this.chargingStationName = chargingStationName;
    }

    public Date getDateDTTM() {
        return dateDTTM;
    }

    public void setDateDTTM(Date dateDTTM) {
        this.dateDTTM = dateDTTM;
    }

    public void setUpdateDTTM(Date updateDTTM) {
        this.updateDTTM = updateDTTM;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getChargingStationAdress() {
        return chargingStationAdress;
    }

    public void setChargingStationAdress(String chargingStationAdress) {
        this.chargingStationAdress = chargingStationAdress;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }



    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


}
