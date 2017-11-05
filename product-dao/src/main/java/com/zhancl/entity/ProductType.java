package com.zhancl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/5.
 */
@Entity
public class ProductType {
    @Id
    @GeneratedValue
    private Integer typeId;

    private String typeNmae;

    private Date createTime;

    private Date modifyTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeNmae() {
        return typeNmae;
    }

    public void setTypeNmae(String typeNmae) {
        this.typeNmae = typeNmae;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
