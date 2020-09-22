package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.CourseMapper;
import cn.scoreanalysis.system.model.Course;
import cn.scoreanalysis.system.model.CourseExample;
import cn.scoreanalysis.system.model.CourseExample.Criteria;
import cn.scoreanalysis.system.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public int insertCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int deleteCourseByPrimaryKey(Integer id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCourseByPrimaryKey(Course course) {
        return courseMapper.updateByPrimaryKey(course);
    }

    @Override
    public List<Course> selectByExample(Course course) {
        CourseExample example = new CourseExample();
        Criteria criteria = example.createCriteria();
        if (course !=null && course.getCourse() != null){
            criteria.andCourseEqualTo(course.getCourse());
        }
        return courseMapper.selectByExample(example);
    }
}
