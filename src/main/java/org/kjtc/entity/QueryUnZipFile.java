package org.kjtc.entity;

import java.util.Date;

/**
 * @program:org.kjtc.entity
 * @description:查询解压文件bean
 * @author: chenxu
 * @create:2018-05-24 20:07
 */


public class QueryUnZipFile {

    private String fileName;

    private String filePath;

    private String equipmentName;

    private String chargingstationName;

    private Date diagnosistime;

    private String fileType;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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

    public Date getDiagnosistime() {
        return diagnosistime;
    }

    public void setDiagnosistime(Date diagnosistime) {
        this.diagnosistime = diagnosistime;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
