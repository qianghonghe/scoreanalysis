package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.UsersRole;

public interface UserRoleService {

    int insert (UsersRole usersRole);

    int deleteByUserPrimaryKey(Integer id);
}
