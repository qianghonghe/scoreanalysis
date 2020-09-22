package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Course;
import cn.scoreanalysis.system.model.Profession;
import cn.scoreanalysis.system.service.CourseService;
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
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    /**
     * 新增课程
     * @param course
     * @return
     */
    @RequestMapping("/insertCourse")
    @ResponseBody
    public Map<String,Integer> insertCourse(Course course){
        return ResultMessageUtil.resultMessage(courseService.insertCourse(course));
    }

    /**
     * 删除课程
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteCourseByPrimaryKey")
    public Map<String,Integer> deleteCourseByPrimaryKey(Integer id){
        return ResultMessageUtil.resultMessage(courseService.deleteCourseByPrimaryKey(id));
    }

    /**
     * 修改课程信息
     * @param course
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateCourseByPrimaryKey")
    public Map<String,Integer> updateCourseByPrimaryKey(Course course){
        return ResultMessageUtil.resultMessage(courseService.updateCourseByPrimaryKey(course));
    }

    /**
     * 查询课程列表
     * 搜索功能
     * 配合layUI分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/getCourseList")
    public DataTableUtil selectByExample(DataTableUtil dataTableUtil,Course course){
        if (course.getCourse() == null){
            //查询全部
            PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
            List<Course> courseList = courseService.selectByExample(course);
            PageInfo pageInfo = new PageInfo(courseList,dataTableUtil.getLimit());
            dataTableUtil = new DataTableUtil("成功",0, (int) pageInfo.getTotal(),pageInfo.getList());
            return  dataTableUtil;
        }else {
            //搜索功能
            List<Course> courseList = courseService.selectByExample(course);
            dataTableUtil = new DataTableUtil("成功",0, courseList.size(),courseList);
        }
        return dataTableUtil;
    }

}
