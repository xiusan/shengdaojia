package org.kjtc.entity;

import java.util.Date;

public class DiagnosisHistory {

    public String chargingstationid;

    public String equipmentid;

    public Boolean charginggun=false;

    public Boolean displayscreen=false;

    public Boolean diverter=false;

    public Boolean contactordc=false;

    public Boolean contactorac=false;

    public Boolean fuse=false;

    public Boolean mccb=false;

    public Boolean arrester=false;

    public Boolean maincontrolboard=false;

    public Boolean monitorboard=false;

    public Boolean switchpower1=false;

    public Boolean gunlockrelay=false;

    public Boolean bmsrelay=false;

    public Boolean meterdc=false;

    public Boolean dischargerelay=false;

    public Boolean dischargeresistance=false;

    public Boolean powermodule=false;

    public Boolean emergencystop=false;

    public Boolean fan=false;

    public String faultstatus;

    public Date recentdiagnosistime;

    public String createuser;

    public Date createdttm;

    public String updateuser;

    public Date updatedttm;

    public Boolean switchpower2=false;

    public Boolean switchpower3=false;

    public Boolean switchpower4=false;

    private Date startDate;

    private Date endDate;

    public String getFaultstatus() {
        return faultstatus;
    }

    public void setFaultstatus(String faultstatus) {
        this.faultstatus = faultstatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getSwitchpower2() {
        return switchpower2;
    }

    public void setSwitchpower2(Boolean switchpower2) {
        this.switchpower2 = switchpower2;
    }

    public Boolean getSwitchpower3() {
        return switchpower3;
    }

    public void setSwitchpower3(Boolean switchpower3) {
        this.switchpower3 = switchpower3;
    }

    public Boolean getSwitchpower4() {
        return switchpower4;
    }

    public void setSwitchpower4(Boolean switchpower4) {
        this.switchpower4 = switchpower4;
    }

    public Boolean getSwitchpower1() {
        return switchpower1;
    }

    public void setSwitchpower1(Boolean switchpower1) {
        this.switchpower1 = switchpower1;
    }

    public String getChargingstationid() {
        return chargingstationid;
    }

    public void setChargingstationid(String chargingstationid) {
        this.chargingstationid = chargingstationid == null ? null : chargingstationid.trim();
    }

    public String getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(String equipmentid) {
        this.equipmentid = equipmentid == null ? null : equipmentid.trim();
    }

    public Boolean getCharginggun() {
        return charginggun;
    }

    public void setCharginggun(Boolean charginggun) {
        this.charginggun = charginggun;
    }

    public Boolean getDisplayscreen() {
        return displayscreen;
    }

    public void setDisplayscreen(Boolean displayscreen) {
        this.displayscreen = displayscreen;
    }

    public Boolean getDiverter() {
        return diverter;
    }

    public void setDiverter(Boolean diverter) {
        this.diverter = diverter;
    }

    public Boolean getContactordc() {
        return contactordc;
    }

    public void setContactordc(Boolean contactordc) {
        this.contactordc = contactordc;
    }

    public Boolean getContactorac() {
        return contactorac;
    }

    public void setContactorac(Boolean contactorac) {
        this.contactorac = contactorac;
    }

    public Boolean getFuse() {
        return fuse;
    }

    public void setFuse(Boolean fuse) {
        this.fuse = fuse;
    }

    public Boolean getMccb() {
        return mccb;
    }

    public void setMccb(Boolean mccb) {
        this.mccb = mccb;
    }

    public Boolean getArrester() {
        return arrester;
    }

    public void setArrester(Boolean arrester) {
        this.arrester = arrester;
    }

    public Boolean getMaincontrolboard() {
        return maincontrolboard;
    }

    public void setMaincontrolboard(Boolean maincontrolboard) {
        this.maincontrolboard = maincontrolboard;
    }

    public Boolean getMonitorboard() {
        return monitorboard;
    }

    public void setMonitorboard(Boolean monitorboard) {
        this.monitorboard = monitorboard;
    }

    public Boolean getGunlockrelay() {
        return gunlockrelay;
    }

    public void setGunlockrelay(Boolean gunlockrelay) {
        this.gunlockrelay = gunlockrelay;
    }

    public Boolean getBmsrelay() {
        return bmsrelay;
    }

    public void setBmsrelay(Boolean bmsrelay) {
        this.bmsrelay = bmsrelay;
    }

    public Boolean getMeterdc() {
        return meterdc;
    }

    public void setMeterdc(Boolean meterdc) {
        this.meterdc = meterdc;
    }

    public Boolean getDischargerelay() {
        return dischargerelay;
    }

    public void setDischargerelay(Boolean dischargerelay) {
        this.dischargerelay = dischargerelay;
    }

    public Boolean getDischargeresistance() {
        return dischargeresistance;
    }

    public void setDischargeresistance(Boolean dischargeresistance) {
        this.dischargeresistance = dischargeresistance;
    }

    public Boolean getPowermodule() {
        return powermodule;
    }

    public void setPowermodule(Boolean powermodule) {
        this.powermodule = powermodule;
    }

    public Boolean getEmergencystop() {
        return emergencystop;
    }

    public void setEmergencystop(Boolean emergencystop) {
        this.emergencystop = emergencystop;
    }

    public Boolean getFan() {
        return fan;
    }

    public void setFan(Boolean fan) {
        this.fan = fan;
    }

    public Date getRecentdiagnosistime() {
        return recentdiagnosistime;
    }

    public void setRecentdiagnosistime(Date recentdiagnosistime) {
        this.recentdiagnosistime = recentdiagnosistime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatedttm() {
        return createdttm;
    }

    public void setCreatedttm(Date createdttm) {
        this.createdttm = createdttm;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public Date getUpdatedttm() {
        return updatedttm;
    }

    public void setUpdatedttm(Date updatedttm) {
        this.updatedttm = updatedttm;
    }


}