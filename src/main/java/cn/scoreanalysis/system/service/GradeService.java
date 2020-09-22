package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Grade;

import java.util.List;

public interface GradeService {
    int insertGrade(Grade grade);

    int deleteGradeByPrimaryKey(Integer id);

    int updateGradeByPrimaryKey(Grade grade);

    List<Grade> getGradeList();

    List<Grade> selectGradeByName(String grade);
}
