package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.ProfessionMapper;
import cn.scoreanalysis.system.model.Profession;
import cn.scoreanalysis.system.model.ProfessionExample;
import cn.scoreanalysis.system.service.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {

    @Resource
    private ProfessionMapper professionMapper;

    @Override
    public int insertProfession(Profession profession) {
        return professionMapper.insert(profession);
    }

    @Override
    public int deleteProfessionByPrimaryKey(Integer id) {
        return professionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateProfessionByPrimaryKey(Profession profession) {
        return professionMapper.updateByPrimaryKey(profession);
    }

    @Override
    public List<Profession> getProfessionList() {
        return professionMapper.selectAll();
    }

    @Override
    public List<Profession> getProfessionListByName(String profession) {
        return professionMapper.selectByName(profession);
    }
}
