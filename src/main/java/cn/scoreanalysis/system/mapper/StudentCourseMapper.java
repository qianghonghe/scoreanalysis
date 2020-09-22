package cn.scoreanalysis.system.mapper;

import cn.scoreanalysis.system.model.StudentCourse;
import cn.scoreanalysis.system.model.StudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCourseMapper {
    long countByExample(StudentCourseExample example);

    int deleteByExample(StudentCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentCourse record);

    int insertSelective(StudentCourse record);

    List<StudentCourse> selectByExample(StudentCourseExample example);

    StudentCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentCourse record, @Param("example") StudentCourseExample example);

    int updateByExample(@Param("record") StudentCourse record, @Param("example") StudentCourseExample example);

    int updateByPrimaryKeySelective(StudentCourse record);

    int updateByPrimaryKey(StudentCourse record);
}