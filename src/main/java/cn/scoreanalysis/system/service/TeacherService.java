package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Teacher;

import java.util.List;

public interface TeacherService {

    int insertTeacher(Teacher teacher);

    int deleteTeacherByPrimaryKey(Integer id);

    int updateTeacherByPrimaryKey(Teacher teacher);

    List<Teacher> selectByExample(Teacher teacher);

}
