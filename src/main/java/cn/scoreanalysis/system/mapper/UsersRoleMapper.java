package cn.scoreanalysis.system.mapper;

import cn.scoreanalysis.system.model.UsersRole;
import cn.scoreanalysis.system.model.UsersRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersRoleMapper {
    long countByExample(UsersRoleExample example);

    int deleteByExample(UsersRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersRole record);

    int insertSelective(UsersRole record);

    List<UsersRole> selectByExample(UsersRoleExample example);

    UsersRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersRole record, @Param("example") UsersRoleExample example);

    int updateByExample(@Param("record") UsersRole record, @Param("example") UsersRoleExample example);

    int updateByPrimaryKeySelective(UsersRole record);

    int updateByPrimaryKey(UsersRole record);

    int deleteByUserPrimaryKey(Integer id);
}