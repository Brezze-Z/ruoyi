package com.ruoyi.reserch.mapper;

import com.ruoyi.reserch.domain.ResearchMaterial;

import java.util.List;

/**
 * @Entity com.ruoyi.reserch.domain.ResearchMaterial
 */
public interface ResearchMaterialMapper {

    // 查询全部
    List<ResearchMaterial> selectAll();
}
