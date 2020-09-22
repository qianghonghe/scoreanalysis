package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Users;
import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.vo.UserRoleVo;

import java.util.List;

public interface UserService {

     int insert(Users user);

     List<Users> selectAll();

     int deleteByPrimaryKey(Integer id);

     int updateByPrimaryKey(Users user);

    List<Users> selectUserByUserName(String username);

    List<UserRoleVo> getUserRoleByUserId(Integer userid);
}
