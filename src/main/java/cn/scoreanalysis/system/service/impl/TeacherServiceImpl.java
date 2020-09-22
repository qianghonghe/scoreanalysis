package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.TeacherMapper;
import cn.scoreanalysis.system.model.Teacher;
import cn.scoreanalysis.system.model.TeacherExample;
import cn.scoreanalysis.system.model.TeacherExample.Criteria;
import cn.scoreanalysis.system.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;


    @Override
    public int insertTeacher(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int deleteTeacherByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTeacherByPrimaryKey(Teacher teacher) {
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    @Override
    public List<Teacher> selectByExample(Teacher teacher) {
        TeacherExample teacherExample = new TeacherExample();
        Criteria criteria = teacherExample.createCriteria();
        if (teacher !=null){
            criteria.andTeachernameEqualTo(teacher.getTeachername());
        }
        return teacherMapper.selectByExample(teacherExample);
    }
}
