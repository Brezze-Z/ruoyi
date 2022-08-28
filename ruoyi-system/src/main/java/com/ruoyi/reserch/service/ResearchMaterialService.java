package com.ruoyi.reserch.service;

import com.ruoyi.reserch.domain.ResearchMaterial;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface ResearchMaterialService {

    List<ResearchMaterial> selectAll();

    List<ResearchMaterial> selectAllPam(ResearchMaterial researchMaterial);

    int insResearchMaterial(ResearchMaterial researchMaterial);

    ResearchMaterial getResearchMaterialById(@Param(value = "materialId") BigInteger integer);

}
