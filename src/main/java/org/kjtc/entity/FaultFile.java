package org.kjtc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FaultFile {

    private Integer id;

    private String chargingstationid;

    private String equipmentid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date diagnosistime;

    private String diagnosistimeStr;

    private String diagnosisfilepath;

    private String diagnosisfilename;

    private String diagnosisfilemd5;

    private String diagnosisstatus;

    private String createuser;

    private Date createdttm;

    private String updateuser;

    private Date updatedttm;

    private String chargingstationName;

    private String equipmentName;

    private String diagnosisFileSize;

    private Date startDiagnosisDate;

    private Date endDiagnosisDate;

    public String getDiagnosistimeStr() {
        return diagnosistimeStr;
    }

    public void setDiagnosistimeStr(String diagnosistimeStr) {
        this.diagnosistimeStr = diagnosistimeStr;
    }

    public Date getStartDiagnosisDate() {
        return startDiagnosisDate;
    }

    public void setStartDiagnosisDate(Date startDiagnosisDate) {
        this.startDiagnosisDate = startDiagnosisDate;
    }

    public Date getEndDiagnosisDate() {
        return endDiagnosisDate;
    }

    public void setEndDiagnosisDate(Date endDiagnosisDate) {
        this.endDiagnosisDate = endDiagnosisDate;
    }

    public String getDiagnosisFileSize() {
        return diagnosisFileSize;
    }

    public void setDiagnosisFileSize(String diagnosisFileSize) {
        this.diagnosisFileSize = diagnosisFileSize;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getChargingstationName() {

        return chargingstationName;
    }

    public void setChargingstationName(String chargingstationName) {
        this.chargingstationName = chargingstationName;
    }

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

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getDiagnosisfilepath() {
        return diagnosisfilepath;
    }

    public void setDiagnosisfilepath(String diagnosisfilepath) {
        this.diagnosisfilepath = diagnosisfilepath == null ? null : diagnosisfilepath.trim();
    }

    public String getDiagnosisfilename() {
        return diagnosisfilename;
    }

    public void setDiagnosisfilename(String diagnosisfilename) {
        this.diagnosisfilename = diagnosisfilename == null ? null : diagnosisfilename.trim();
    }

    public String getDiagnosisfilemd5() {
        return diagnosisfilemd5;
    }

    public void setDiagnosisfilemd5(String diagnosisfilemd5) {
        this.diagnosisfilemd5 = diagnosisfilemd5 == null ? null : diagnosisfilemd5.trim();
    }

    public String getDiagnosisstatus() {
        return diagnosisstatus;
    }

    public void setDiagnosisstatus(String diagnosisstatus) {
        this.diagnosisstatus = diagnosisstatus == null ? null : diagnosisstatus.trim();
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