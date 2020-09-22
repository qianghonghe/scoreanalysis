package cn.scoreanalysis.system.mapper;

import cn.scoreanalysis.system.model.Users;
import cn.scoreanalysis.system.model.UsersExample;
import java.util.List;

import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.vo.UserRoleVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

//@Component
public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectAll();

    List<Users> selectUserByUserName(String username);

    List<UserRoleVo> getUserRoleByUserId(Integer userid);
}