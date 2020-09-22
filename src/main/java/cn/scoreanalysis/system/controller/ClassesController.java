package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Classes;
import cn.scoreanalysis.system.service.ClassesService;
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
@RequestMapping("/classes")
public class ClassesController {

    @Resource
    private ClassesService classesService;

    /**
     * 新增班级
     * @param classes
     * @return
     */
    @ResponseBody
    @RequestMapping("/insertClass")
    public Map<String,Integer> insertClass(Classes classes){
        return ResultMessageUtil.resultMessage(classesService.insertClass(classes));
    }

    /**
     * 删除班级
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteClassByPrimaryKey")
    public Map<String,Integer> deleteClassByPrimaryKey(Integer id){
        return ResultMessageUtil.resultMessage(classesService.deleteClassByPrimaryKey(id));
    }

    /**
     * 修改班级信息
     * @param classes
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateClassByPrimaryKey")
    public Map<String,Integer> updateClassByPrimaryKey(Classes classes){
        return ResultMessageUtil.resultMessage(classesService.updateClassByPrimaryKey(classes));
    }

    /**
     * 按条件查询
     * @param dataTableUtil
     * @param classes
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectClassByElective")
    public DataTableUtil selectClassByElective(DataTableUtil dataTableUtil,Classes classes){
        if (classes.getClassname()==null){
            PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
            List<Classes> classesList = classesService.getClassList(classes);
            PageInfo pageInfo = new PageInfo(classesList,dataTableUtil.getLimit());
            dataTableUtil = new DataTableUtil("",0, (int) pageInfo.getTotal(),pageInfo.getList());
        }else {
            List<Classes> classesList = classesService.getClassList(classes);
            dataTableUtil = new DataTableUtil("",0, (int) classesList.size(),classesList);
        }
        return dataTableUtil;
    }
}
