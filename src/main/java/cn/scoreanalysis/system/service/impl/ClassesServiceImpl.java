package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.ClassesMapper;
import cn.scoreanalysis.system.model.Classes;
import cn.scoreanalysis.system.model.ClassesExample;
import cn.scoreanalysis.system.service.ClassesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Resource
    private ClassesMapper classesMapper;

    @Override
    public int insertClass(Classes classes) {
        return classesMapper.insert(classes);
    }

    @Override
    public int deleteClassByPrimaryKey(Integer id) {
        return classesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateClassByPrimaryKey(Classes classes) {
        return classesMapper.updateByPrimaryKey(classes);
    }

    @Override
    public List<Classes> getClassList(Classes classes) {
        ClassesExample example = new ClassesExample();
        ClassesExample.Criteria criteria = example.createCriteria();
        if (classes!=null && classes.getClassname()!=null){
            criteria.andClassnameEqualTo(classes.getClassname());
        }
        return classesMapper.selectByExample(example);
    }
}
