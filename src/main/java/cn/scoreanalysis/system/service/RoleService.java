package cn.scoreanalysis.system.service;

import cn.scoreanalysis.system.model.Role;

import java.util.List;

public interface RoleService {
    public int insertRole(Role role);

    public int deleteRoleByPrimaryKey(Integer id);

    public int updateRoleByPrimaryKey(Role role);

    public List<Role> selectRoleLists();

    List<Role> getUserRoleByUserId(Integer id);
}
