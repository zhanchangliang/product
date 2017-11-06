package com.zhancl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/5.
 */
@Entity
public class ProductDetail {
    /**
     * 商品ID
     */
    @Id
    @GeneratedValue
    private Integer pId;
    /**
     * 商品名称
     */
    private String pName;

    /**
     * 商品编码
     */
    private String pCode;

    /**
     *商品说明
     */
    private String pContent;

    /**
     * 上架时间
     */
    private Date shelfTime;

    /**
     * 浏览次数
     */
    private Integer viewCount;

    /**
     * 扩展字段
     */
    private String extendParam;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam;
    }
}
