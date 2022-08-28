package com.ruoyi.reserch.service.impl;

import com.ruoyi.reserch.domain.ResearchMaterial;
import com.ruoyi.reserch.mapper.ResearchMaterialMapper;
import com.ruoyi.reserch.service.ResearchMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResearchMaterialImpl implements ResearchMaterialService {

    @Resource
    private ResearchMaterialMapper researchMaterialMapper;
    @Override
    public List<ResearchMaterial> selectAll() {
        return researchMaterialMapper.selectAll();
    }

}
