package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.RoleMapper;
import cn.scoreanalysis.system.model.Role;
import cn.scoreanalysis.system.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public int insertRole(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int deleteRoleByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateRoleByPrimaryKey(Role role) {
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public List<Role> selectRoleLists() {
        return roleMapper.selectRoleLists();
    }

    @Override
    public List<Role> getUserRoleByUserId(Integer id) {
        return roleMapper.getUserRoleByUserId(id);
    }
}
