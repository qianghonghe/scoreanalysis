package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Grade;
import cn.scoreanalysis.system.model.Profession;
import cn.scoreanalysis.system.service.GradeService;
import cn.scoreanalysis.system.service.ProfessionService;
import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.util.ResultMessageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/profession")
public class ProfessionController {
    @Resource
    private ProfessionService professionService;

    /**
     * 新建专业
     * @param profession
     * @return
     */
    @RequestMapping("/insertProfession")
    @ResponseBody
    public Map<String,Integer> insertProfession(Profession profession){
        return ResultMessageUtil.resultMessage(professionService.insertProfession(profession));
    }

    /**
     * 删除专业
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteProfessionByPrimaryKey")
    public Map<String,Integer> deleteProfessionByPrimaryKey(Integer id){
        return ResultMessageUtil.resultMessage(professionService.deleteProfessionByPrimaryKey(id));
    }

    /**
     * 修改专业信息
     * @param profession
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateProfessionByPrimaryKey")
    public Map<String,Integer> updateProfessionByPrimaryKey(Profession profession){
        return ResultMessageUtil.resultMessage(professionService.updateProfessionByPrimaryKey(profession));
    }

    /**
     * 查询专业列表
     * 配合layUI分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/getProfessionList")
    public DataTableUtil getProfessionList(DataTableUtil dataTableUtil){
        PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
        List<Profession> professionList = professionService.getProfessionList();
        PageInfo pageInfo = new PageInfo(professionList,dataTableUtil.getLimit());
        dataTableUtil = new DataTableUtil("成功",0, (int) pageInfo.getTotal(),pageInfo.getList());
        return  dataTableUtil;
    }

    /**
     * 搜索功能
     * @param dataTableUtil
     * @param profession
     * @return
     */
    @RequestMapping("/selectProfessionByName")
    @ResponseBody
    public DataTableUtil selectProfessionByName(DataTableUtil dataTableUtil,String profession){
       List<Profession> professionList = professionService.getProfessionListByName(profession);
        dataTableUtil = new DataTableUtil("成功",0,professionList.size(),professionList);
       return dataTableUtil;
    }
}
