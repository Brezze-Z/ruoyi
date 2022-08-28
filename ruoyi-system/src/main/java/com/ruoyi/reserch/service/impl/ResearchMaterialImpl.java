package com.ruoyi.reserch.service.impl;

import com.ruoyi.reserch.domain.ResearchMaterial;
import com.ruoyi.reserch.mapper.ResearchMaterialMapper;
import com.ruoyi.reserch.service.ResearchMaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@Service
public class ResearchMaterialImpl implements ResearchMaterialService {

    @Resource
    private ResearchMaterialMapper researchMaterialMapper;
    @Override
    public List<ResearchMaterial> selectAll() {
        return researchMaterialMapper.selectAll();
    }

    @Override
    public List<ResearchMaterial> selectAllPam(ResearchMaterial researchMaterial) {
       return researchMaterialMapper.selectAllPam(researchMaterial);
    }

    @Override
    public int insResearchMaterial(ResearchMaterial researchMaterial) {
        return researchMaterialMapper.insResearchMaterial(researchMaterial);
    }

    @Override
    public ResearchMaterial getResearchMaterialById(BigInteger integer) {
        return researchMaterialMapper.getResearchMaterialById(integer);
    }
}
