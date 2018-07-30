package org.kjtc.entity;

import java.util.Date;

public class DiagnosisStrategy {

    private Integer id;

    private Integer equipmenttype;

    private String strategyname;

    private String diagnosismethod;

    private Integer diagnosistype;

    private String diagnosismethodobj;

    private Integer key;

    private String diagnosisversion;

    private String arithmetic;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmenttype() {
        return equipmenttype;
    }

    public void setEquipmenttype(Integer equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    public String getStrategyname() {
        return strategyname;
    }

    public void setStrategyname(String strategyname) {
        this.strategyname = strategyname == null ? null : strategyname.trim();
    }

    public String getDiagnosismethod() {
        return diagnosismethod;
    }

    public void setDiagnosismethod(String diagnosismethod) {
        this.diagnosismethod = diagnosismethod == null ? null : diagnosismethod.trim();
    }

    public Integer getDiagnosistype() {
        return diagnosistype;
    }

    public void setDiagnosistype(Integer diagnosistype) {
        this.diagnosistype = diagnosistype;
    }

    public String getDiagnosismethodobj() {
        return diagnosismethodobj;
    }

    public void setDiagnosismethodobj(String diagnosismethodobj) {
        this.diagnosismethodobj = diagnosismethodobj == null ? null : diagnosismethodobj.trim();
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getDiagnosisversion() {
        return diagnosisversion;
    }

    public void setDiagnosisversion(String diagnosisversion) {
        this.diagnosisversion = diagnosisversion == null ? null : diagnosisversion.trim();
    }

    public String getArithmetic() {
        return arithmetic;
    }

    public void setArithmetic(String arithmetic) {
        this.arithmetic = arithmetic == null ? null : arithmetic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }
}