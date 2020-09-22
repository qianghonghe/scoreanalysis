package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Student;

public interface StudentServic {
    int insertStudent(Student student);

    int deleteStudentByPrimaryKey(Integer id);

    int updateStudentByPrimaryKey(Student student);


}
