package com.ruoyi.reserch.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_research_material
 */
public class ResearchMaterial{
    /**
     * 科研系统材料表主键ID
     */
    private Long materialId;

    /**
     * 材料名称
     */
    private String materialName;

    /**
     * 材料类别：金属材料；高分子材料；复合材料；其他
     */
    private String materialType;

    /**
     * 型号名称
     */
    private String materialModel;

    /**
     * 创建时间
     */
    private Date materialCreatetime;

    /**
     * 修改时间
     */
    private Date materialModifiytime;

    /**
     * 材料信息备注
     */
    private String materialComment;

    /**
     * 创建人姓名
     */
    private String materialCreatername;

    /**
     * 备注字段
     */
    private String materialBackupfield1;

    /**
     * 备注字段
     */
    private String materialBackupfield2;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "ResearchMaterial{" +
                "materialId=" + materialId +
                ", materialName='" + materialName + '\'' +
                ", materialType='" + materialType + '\'' +
                ", materialModel='" + materialModel + '\'' +
                ", materialCreatetime=" + materialCreatetime +
                ", materialModifiytime=" + materialModifiytime +
                ", materialComment='" + materialComment + '\'' +
                ", materialCreatername='" + materialCreatername + '\'' +
                ", materialBackupfield1='" + materialBackupfield1 + '\'' +
                ", materialBackupfield2='" + materialBackupfield2 + '\'' +
                '}';
    }

    public ResearchMaterial() {
    }


    public ResearchMaterial(Long materialId, String materialName, String materialType, String materialModel, Date materialCreatetime, Date materialModifiytime, String materialComment, String materialCreatername, String materialBackupfield1, String materialBackupfield2) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.materialType = materialType;
        this.materialModel = materialModel;
        this.materialCreatetime = materialCreatetime;
        this.materialModifiytime = materialModifiytime;
        this.materialComment = materialComment;
        this.materialCreatername = materialCreatername;
        this.materialBackupfield1 = materialBackupfield1;
        this.materialBackupfield2 = materialBackupfield2;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public Date getMaterialCreatetime() {
        return materialCreatetime;
    }

    public void setMaterialCreatetime(Date materialCreatetime) {
        this.materialCreatetime = materialCreatetime;
    }

    public Date getMaterialModifiytime() {
        return materialModifiytime;
    }

    public void setMaterialModifiytime(Date materialModifiytime) {
        this.materialModifiytime = materialModifiytime;
    }

    public String getMaterialComment() {
        return materialComment;
    }

    public void setMaterialComment(String materialComment) {
        this.materialComment = materialComment;
    }

    public String getMaterialCreatername() {
        return materialCreatername;
    }

    public void setMaterialCreatername(String materialCreatername) {
        this.materialCreatername = materialCreatername;
    }

    public String getMaterialBackupfield1() {
        return materialBackupfield1;
    }

    public void setMaterialBackupfield1(String materialBackupfield1) {
        this.materialBackupfield1 = materialBackupfield1;
    }

    public String getMaterialBackupfield2() {
        return materialBackupfield2;
    }

    public void setMaterialBackupfield2(String materialBackupfield2) {
        this.materialBackupfield2 = materialBackupfield2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}