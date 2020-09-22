package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.GradeMapper;
import cn.scoreanalysis.system.model.Grade;
import cn.scoreanalysis.system.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;

    @Override
    public int insertGrade(Grade grade) {
        return gradeMapper.insert(grade);
    }

    @Override
    public int deleteGradeByPrimaryKey(Integer id) {
        return gradeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateGradeByPrimaryKey(Grade grade) {
        return gradeMapper.updateByPrimaryKey(grade);
    }

    @Override
    public List<Grade> getGradeList() {
        return gradeMapper.getGradeList();
    }

    @Override
    public List<Grade> selectGradeByName(String grade) {
        return gradeMapper.selectGradeByName(grade);
    }
}
