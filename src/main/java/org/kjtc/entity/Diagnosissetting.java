package org.kjtc.entity;

import java.util.Date;

public class Diagnosissetting {
    private String chargingstationid;

    private String equipmenttypename;

    private String equipmentmanufacturer;

    private String terminaltype;

    private String terminalversion;

    private Integer sendcycle;

    private String createuser;

    private Date createdttm;

    private String updateuser;

    private Date updatedttm;

    public String getChargingstationid() {
        return chargingstationid;
    }

    public void setChargingstationid(String chargingstationid) {
        this.chargingstationid = chargingstationid == null ? null : chargingstationid.trim();
    }

    public String getEquipmenttypename() {
        return equipmenttypename;
    }

    public void setEquipmenttypename(String equipmenttypename) {
        this.equipmenttypename = equipmenttypename == null ? null : equipmenttypename.trim();
    }

    public String getEquipmentmanufacturer() {
        return equipmentmanufacturer;
    }

    public void setEquipmentmanufacturer(String equipmentmanufacturer) {
        this.equipmentmanufacturer = equipmentmanufacturer == null ? null : equipmentmanufacturer.trim();
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype == null ? null : terminaltype.trim();
    }

    public String getTerminalversion() {
        return terminalversion;
    }

    public void setTerminalversion(String terminalversion) {
        this.terminalversion = terminalversion == null ? null : terminalversion.trim();
    }

    public Integer getSendcycle() {
        return sendcycle;
    }

    public void setSendcycle(Integer sendcycle) {
        this.sendcycle = sendcycle;
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