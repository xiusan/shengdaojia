package org.kjtc.entity;

import java.util.Date;

public class EquipmentDiagnosis {

    private Integer id;

    private String chargingstationid;

    private String equipmentid;

    private String equipmenttypename;

    private String equipmentpowertypename;

    private Boolean communicationstatus;

    private Boolean faultstatus;

    private Date recentdiagnosistime;

    private String createuser;

    private Date createdttm;

    private String updateuser;

    private Date updatedttm;

    private String faultdescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEquipmenttypename() {
        return equipmenttypename;
    }

    public void setEquipmenttypename(String equipmenttypename) {
        this.equipmenttypename = equipmenttypename == null ? null : equipmenttypename.trim();
    }

    public String getEquipmentpowertypename() {
        return equipmentpowertypename;
    }

    public void setEquipmentpowertypename(String equipmentpowertypename) {
        this.equipmentpowertypename = equipmentpowertypename == null ? null : equipmentpowertypename.trim();
    }

    public Boolean getCommunicationstatus() {
        return communicationstatus;
    }

    public void setCommunicationstatus(Boolean communicationstatus) {
        this.communicationstatus = communicationstatus;
    }

    public Boolean getFaultstatus() {
        return faultstatus;
    }

    public void setFaultstatus(Boolean faultstatus) {
        this.faultstatus = faultstatus;
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

    public String getFaultdescription() {
        return faultdescription;
    }

    public void setFaultdescription(String faultdescription) {
        this.faultdescription = faultdescription == null ? null : faultdescription.trim();
    }
}