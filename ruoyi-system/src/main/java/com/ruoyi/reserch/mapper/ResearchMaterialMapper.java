package com.ruoyi.reserch.mapper;

import com.ruoyi.reserch.domain.ResearchMaterial;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

/**
 * @Entity com.ruoyi.reserch.domain.ResearchMaterial
 */
public interface ResearchMaterialMapper {

    // 查询全部
    List<ResearchMaterial> selectAll();

    //条件查询
    List<ResearchMaterial> selectAllPam(ResearchMaterial researchMaterial);

    // 新增
    int insResearchMaterial(ResearchMaterial researchMaterial);

    // 根据ID查询
    ResearchMaterial getResearchMaterialById(@Param(value = "materialId")BigInteger integer);

}
