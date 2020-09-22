package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Classes;

import java.util.List;

public interface ClassesService {

    int insertClass(Classes classes);

    int deleteClassByPrimaryKey(Integer id);

    int updateClassByPrimaryKey(Classes classes);

    List<Classes> getClassList(Classes classes);
}
