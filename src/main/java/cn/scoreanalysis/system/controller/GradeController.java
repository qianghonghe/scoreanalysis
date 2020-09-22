package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Grade;
import cn.scoreanalysis.system.model.Role;
import cn.scoreanalysis.system.service.GradeService;
import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.util.ResultMessageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/grade")
public class GradeController {
    @Resource
    private GradeService gradeService;

    /**
     * 新建班级
     * @param grade
     * @return
     */
    @RequestMapping("/insertGrade")
    @ResponseBody
    public Map<String,Integer> insertGrade(Grade grade){
        return ResultMessageUtil.resultMessage(gradeService.insertGrade(grade));
    }

    /**
     * 删除班级
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteGradeByPrimaryKey")
    public Map<String,Integer> deleteGradeByPrimary(Integer id){
        return ResultMessageUtil.resultMessage(gradeService.deleteGradeByPrimaryKey(id));
    }

    /**
     * 修改班级信息
     * @param grade
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateGradeByPrimaryKey")
    public Map<String,Integer> updateGradeByPrimaryKey(Grade grade){
        return ResultMessageUtil.resultMessage(gradeService.updateGradeByPrimaryKey(grade));
    }

    /**
     * 查询班级列表
     * 配合layUI分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/getGradeList")
    public DataTableUtil getGradeList(DataTableUtil dataTableUtil){
        PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
        List<Grade> gradeList = gradeService.getGradeList();
        PageInfo pageInfo = new PageInfo(gradeList,dataTableUtil.getLimit());
        dataTableUtil = new DataTableUtil("成功",0, (int) pageInfo.getTotal(),pageInfo.getList());
        return  dataTableUtil;
    }

    /**
     * 搜索功能
     * @param dataTableUtil
     * @param grade
     * @return
     */
    @RequestMapping("/selectGradeByName")
    @ResponseBody
    public DataTableUtil selectGradeByName(DataTableUtil dataTableUtil,String grade){
       List<Grade> gradeList = gradeService.selectGradeByName(grade);
       dataTableUtil = new DataTableUtil("成功",0,gradeList.size(),gradeList);
       return dataTableUtil;
    }
}
