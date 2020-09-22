package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.StudentMapper;
import cn.scoreanalysis.system.model.Student;
import cn.scoreanalysis.system.service.StudentServic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentServic {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudentByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int updateStudentByPrimaryKey(Student student) {
        return 0;
    }
}
