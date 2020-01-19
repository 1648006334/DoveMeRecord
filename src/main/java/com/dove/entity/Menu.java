package com.dove.entity;

import java.util.Date;

public class Menu {
    private Integer id;

    private Integer menuparent;

    private String menuname;

    private String menuurl;

    private Date xtlrsj;

    private String xtlrrxm;

    private String xtlrrid;

    private String xtlrrbm;

    private String xtlrrbmid;

    private String xtlrip;

    private Date xtzhxgsj;

    private String xtzhxgrxm;

    private String xtzhxgrid;

    private String xtzhxgrbm;

    private String xtzhxgrbmid;

    private String xtzhxgip;

    private Boolean xtzxbz;

    private String xtzxyy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuparent() {
        return menuparent;
    }

    public void setMenuparent(Integer menuparent) {
        this.menuparent = menuparent;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public Date getXtlrsj() {
        return xtlrsj;
    }

    public void setXtlrsj(Date xtlrsj) {
        this.xtlrsj = xtlrsj;
    }

    public String getXtlrrxm() {
        return xtlrrxm;
    }

    public void setXtlrrxm(String xtlrrxm) {
        this.xtlrrxm = xtlrrxm == null ? null : xtlrrxm.trim();
    }

    public String getXtlrrid() {
        return xtlrrid;
    }

    public void setXtlrrid(String xtlrrid) {
        this.xtlrrid = xtlrrid == null ? null : xtlrrid.trim();
    }

    public String getXtlrrbm() {
        return xtlrrbm;
    }

    public void setXtlrrbm(String xtlrrbm) {
        this.xtlrrbm = xtlrrbm == null ? null : xtlrrbm.trim();
    }

    public String getXtlrrbmid() {
        return xtlrrbmid;
    }

    public void setXtlrrbmid(String xtlrrbmid) {
        this.xtlrrbmid = xtlrrbmid == null ? null : xtlrrbmid.trim();
    }

    public String getXtlrip() {
        return xtlrip;
    }

    public void setXtlrip(String xtlrip) {
        this.xtlrip = xtlrip == null ? null : xtlrip.trim();
    }

    public Date getXtzhxgsj() {
        return xtzhxgsj;
    }

    public void setXtzhxgsj(Date xtzhxgsj) {
        this.xtzhxgsj = xtzhxgsj;
    }

    public String getXtzhxgrxm() {
        return xtzhxgrxm;
    }

    public void setXtzhxgrxm(String xtzhxgrxm) {
        this.xtzhxgrxm = xtzhxgrxm == null ? null : xtzhxgrxm.trim();
    }

    public String getXtzhxgrid() {
        return xtzhxgrid;
    }

    public void setXtzhxgrid(String xtzhxgrid) {
        this.xtzhxgrid = xtzhxgrid == null ? null : xtzhxgrid.trim();
    }

    public String getXtzhxgrbm() {
        return xtzhxgrbm;
    }

    public void setXtzhxgrbm(String xtzhxgrbm) {
        this.xtzhxgrbm = xtzhxgrbm == null ? null : xtzhxgrbm.trim();
    }

    public String getXtzhxgrbmid() {
        return xtzhxgrbmid;
    }

    public void setXtzhxgrbmid(String xtzhxgrbmid) {
        this.xtzhxgrbmid = xtzhxgrbmid == null ? null : xtzhxgrbmid.trim();
    }

    public String getXtzhxgip() {
        return xtzhxgip;
    }

    public void setXtzhxgip(String xtzhxgip) {
        this.xtzhxgip = xtzhxgip == null ? null : xtzhxgip.trim();
    }

    public Boolean getXtzxbz() {
        return xtzxbz;
    }

    public void setXtzxbz(Boolean xtzxbz) {
        this.xtzxbz = xtzxbz;
    }

    public String getXtzxyy() {
        return xtzxyy;
    }

    public void setXtzxyy(String xtzxyy) {
        this.xtzxyy = xtzxyy == null ? null : xtzxyy.trim();
    }
}