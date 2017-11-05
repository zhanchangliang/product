package com.zhancl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/11/5.
 */
@Entity
public class ProductFile {
    @Id
    @GeneratedValue
    private Integer fileId;
    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件描述
     */
    private String desc;

    /**
     * 文件存放路径
     */
    private String filePath;

    /**
     * 文件大小
     */
    private Integer fileSize;

    /**
     * 文件所属板块类型：对应枚举 PlateType
     */
    private String plateType;

    /**
     *用于同一个类型多张图片，图片顺序从小到大展示
     */
    private Integer fileSort;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public Integer getFileSort() {
        return fileSort;
    }

    public void setFileSort(Integer fileSort) {
        this.fileSort = fileSort;
    }
}
