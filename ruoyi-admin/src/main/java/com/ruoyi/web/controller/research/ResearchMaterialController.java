package com.ruoyi.web.controller.research;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.reserch.domain.ResearchMaterial;
import com.ruoyi.reserch.service.ResearchMaterialService;
import com.ruoyi.reserch.service.impl.ResearchMaterialImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reserch/basic/Reserchmaterials")
public class ResearchMaterialController extends BaseController {

    @Autowired
    private ResearchMaterialImpl researchMaterial;

    /*查询全部：传数据对象*/
    @GetMapping(value = "/list")
    public TableDataInfo getList(ResearchMaterial material){

        startPage();
        List<ResearchMaterial> list = researchMaterial.selectAllPam(material);
        System.out.println(list.size());
        return getDataTable(list);

    }

    /*保存方法*/
    @PostMapping(value = "/save")
    public AjaxResult save(@RequestBody ResearchMaterial material){
        if (material != null){
            try {
                material.setMaterialCreatername("系统管理员");
                material.setMaterialCreatetime(new Date());
                researchMaterial.insResearchMaterial(material);
                return AjaxResult.success();
            }catch (Exception e){
                e.printStackTrace();
                return AjaxResult.error("添加失败，请联系管理员");
            }
        }else {
            return AjaxResult.error("请检查输入参数，是否为空,或者联系系统管理员");
        }
    }

    @GetMapping("/{id}")
    public AjaxResult getResearchMaterialById(@PathVariable(value = "id")BigInteger integer){

            return AjaxResult.success(researchMaterial.getResearchMaterialById(integer));

    }



}
