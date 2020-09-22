package cn.scoreanalysis.system.vo;

import cn.scoreanalysis.system.model.Role;
import cn.scoreanalysis.system.model.Users;

import java.util.List;

public class UserRoleVo extends Users {

//    private List<Integer> roleId;
//
//    private  List<String> role;
//
//    public List<Integer> getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(List<Integer> roleId) {
//        this.roleId = roleId;
//    }
//
//    public List<String> getRole() {
//        return role;
//    }
//
//    public void setRole(List<String> role) {
//        this.role = role;
//    }

    //
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
