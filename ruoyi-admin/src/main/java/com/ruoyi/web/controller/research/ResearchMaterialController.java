package com.ruoyi.web.controller.research;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.reserch.domain.ResearchMaterial;
import com.ruoyi.reserch.service.ResearchMaterialService;
import com.ruoyi.reserch.service.impl.ResearchMaterialImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reserch/basic/Reserchmaterials")
public class ResearchMaterialController extends BaseController {

    @Autowired
    private ResearchMaterialImpl researchMaterial;

    /*查询全部：不传参*/
    @GetMapping(value = "/list")
    public TableDataInfo getList(){

        startPage();
        List<ResearchMaterial> list = researchMaterial.selectAll();
        System.out.println(list.size());
        return getDataTable(list);

    }




}
