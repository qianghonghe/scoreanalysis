package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.UsersRoleMapper;
import cn.scoreanalysis.system.model.UsersRole;
import cn.scoreanalysis.system.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UsersRoleMapper usersRoleMapper;


    @Override
    public int insert(UsersRole usersRole) {
        return usersRoleMapper.insert(usersRole);
    }

    @Override
    public int deleteByUserPrimaryKey(Integer id) {
        return usersRoleMapper.deleteByUserPrimaryKey(id);
    }
}
