package org.kjtc.entity;

/**
 * @program:org.kjtc.entity
 * @description:首页比例
 * @author: chenxu
 * @create:2018-05-09 09:40
 */


public class HomeRate {

    private Integer chargingstationCount;

    private String chargingstationid;

    private String chargingstationname;

    public Integer getChargingstationCount() {
        return chargingstationCount;
    }

    public void setChargingstationCount(Integer chargingstationCount) {
        this.chargingstationCount = chargingstationCount;
    }

    public String getChargingstationname() {
        return chargingstationname;
    }

    public void setChargingstationname(String chargingstationname) {
        this.chargingstationname = chargingstationname;
    }

    public String getChargingstationid() {
        return chargingstationid;
    }

    public void setChargingstationid(String chargingstationid) {
        this.chargingstationid = chargingstationid;
    }
}
