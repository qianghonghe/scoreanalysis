package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Course;

import java.util.List;

public interface CourseService {

    int insertCourse(Course course);

    int deleteCourseByPrimaryKey(Integer id);

    int updateCourseByPrimaryKey(Course course);

    List<Course> selectByExample(Course course);
}
