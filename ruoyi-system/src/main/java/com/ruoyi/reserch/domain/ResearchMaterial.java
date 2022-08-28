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
    private Long MaterialId;

    /**
     * 材料名称
     */
    private String MaterialName;

    /**
     * 材料类别：金属材料；高分子材料；复合材料；其他




     */
    private String MaterialType;

    /**
     * 型号名称
     */
    private String MaterialModel;

    /**
     * 创建时间
     */
    private Date MaterialCreatetime;

    /**
     * 修改时间
     */
    private Date MaterialModifiytime;

    /**
     * 材料信息备注
     */
    private String MaterialComment;

    /**
     * 创建人姓名
     */
    private String MaterialCreatername;

    /**
     * 备注字段
     */
    private String MaterialBackupfield1;

    /**
     * 备注字段
     */
    private String MaterialBackupfield2;

    private static final long serialVersionUID = 1L;

    public ResearchMaterial(Long materialId, String materialName, String materialType, String materialModel, Date materialCreatetime, Date materialModifiytime, String materialComment, String materialCreatername, String materialBackupfield1, String materialBackupfield2) {
        MaterialId = materialId;
        MaterialName = materialName;
        MaterialType = materialType;
        MaterialModel = materialModel;
        MaterialCreatetime = materialCreatetime;
        MaterialModifiytime = materialModifiytime;
        MaterialComment = materialComment;
        MaterialCreatername = materialCreatername;
        MaterialBackupfield1 = materialBackupfield1;
        MaterialBackupfield2 = materialBackupfield2;
    }

    public ResearchMaterial() {
    }

    public Long getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(Long materialId) {
        MaterialId = materialId;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String materialName) {
        MaterialName = materialName;
    }

    public String getMaterialType() {
        return MaterialType;
    }

    public void setMaterialType(String materialType) {
        MaterialType = materialType;
    }

    public String getMaterialModel() {
        return MaterialModel;
    }

    public void setMaterialModel(String materialModel) {
        MaterialModel = materialModel;
    }

    public Date getMaterialCreatetime() {
        return MaterialCreatetime;
    }

    public void setMaterialCreatetime(Date materialCreatetime) {
        MaterialCreatetime = materialCreatetime;
    }

    public Date getMaterialModifiytime() {
        return MaterialModifiytime;
    }

    public void setMaterialModifiytime(Date materialModifiytime) {
        MaterialModifiytime = materialModifiytime;
    }

    public String getMaterialComment() {
        return MaterialComment;
    }

    public void setMaterialComment(String materialComment) {
        MaterialComment = materialComment;
    }

    public String getMaterialCreatername() {
        return MaterialCreatername;
    }

    public void setMaterialCreatername(String materialCreatername) {
        MaterialCreatername = materialCreatername;
    }

    public String getMaterialBackupfield1() {
        return MaterialBackupfield1;
    }

    public void setMaterialBackupfield1(String materialBackupfield1) {
        MaterialBackupfield1 = materialBackupfield1;
    }

    public String getMaterialBackupfield2() {
        return MaterialBackupfield2;
    }

    public void setMaterialBackupfield2(String materialBackupfield2) {
        MaterialBackupfield2 = materialBackupfield2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}