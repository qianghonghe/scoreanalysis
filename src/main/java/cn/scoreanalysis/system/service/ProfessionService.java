package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Profession;

import java.util.List;

public interface ProfessionService {

   int  insertProfession(Profession profession);

   int  deleteProfessionByPrimaryKey(Integer id);

   int  updateProfessionByPrimaryKey(Profession profession);

   List<Profession> getProfessionList();

   List<Profession> getProfessionListByName(String profession);

}
