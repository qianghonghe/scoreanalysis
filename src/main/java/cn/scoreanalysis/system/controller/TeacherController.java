package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Course;
import cn.scoreanalysis.system.model.Teacher;
import cn.scoreanalysis.system.model.Users;
import cn.scoreanalysis.system.service.TeacherService;
import cn.scoreanalysis.system.service.UserService;
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
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @Resource
    private UserService userService;

    /**
     * 新增教师
     * @param teacher
     * @return
     */
    @RequestMapping("/insertTeacher")
    @ResponseBody
    public Map<String,Integer> insertTeacher(Teacher teacher, Users user){
        //添加教师成功后需要向用户表保存教师账号，以教师工号为用户名，身份证号后8位为默认密码
        user.setUsername(teacher.getTeachernumber());
        user.setPassword(teacher.getTeacheridentitycard().substring(10));
        int result = teacherService.insertTeacher(teacher);
        if (teacher.getId()!=null){
            user.setTeacherid(teacher.getId());
            int rs = userService.insert(user);
            return ResultMessageUtil.resultMessage(rs);
        }
        return ResultMessageUtil.resultMessage(0);
    }

    /**
     * 删除教师
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteTeacherByPrimaryKey")
    public Map<String,Integer> deleteTeacherByPrimaryKey(Integer id){
        return ResultMessageUtil.resultMessage(teacherService.deleteTeacherByPrimaryKey(id));
    }

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateTeacherByPrimaryKey")
    public Map<String,Integer> updateTeacherByPrimaryKey(Teacher teacher){
        return ResultMessageUtil.resultMessage(teacherService.updateTeacherByPrimaryKey(teacher));
    }

    /**
     * 查询教师列表
     * 搜索功能
     * 配合layUI分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/getTeacherList")
    public DataTableUtil selectByExample(DataTableUtil dataTableUtil, Teacher teacher){
        if ( teacher.getTeachername() == null){
            //查询全部
            PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
            List<Teacher> teacherList = teacherService.selectByExample(teacher);
            PageInfo pageInfo = new PageInfo(teacherList,dataTableUtil.getLimit());
            dataTableUtil = new DataTableUtil("成功",0, (int) pageInfo.getTotal(),pageInfo.getList());
            return  dataTableUtil;
        }else {
            //搜索功能
            List<Teacher> teacherList = teacherService.selectByExample(teacher);
            dataTableUtil = new DataTableUtil("成功",0, teacherList.size(),teacherList);
        }
        return dataTableUtil;
    }
}
