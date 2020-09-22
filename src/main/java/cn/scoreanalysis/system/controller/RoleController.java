package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Role;
import cn.scoreanalysis.system.service.RoleService;
import cn.scoreanalysis.system.util.ResultMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    /**
     * 新建角色
     * @param role
     * @return
     */
    @RequestMapping("/insertRole")
    @ResponseBody
    public Map<String,Integer> insertRole(Role role){
        return ResultMessageUtil.resultMessage(roleService.insertRole(role));
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteRoleByPrimaryKey")
    public Map<String,Integer> deleteRoleByPrimary(Integer id){
        return ResultMessageUtil.resultMessage(roleService.deleteRoleByPrimaryKey(id));
    }

    /**
     * 修改角色信息
     * @param role
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateRoleByPrimaryKey")
    public Map<String,Integer> updateRoleByPrimaryKey(Role role){
        return ResultMessageUtil.resultMessage(roleService.updateRoleByPrimaryKey(role));
    }

    /**
     * 查询角色列表
     * 配合layUI分页查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectRoleLists")
    public Map<String,Object> selectRoleLists(){
        List<Role> roleList = roleService.selectRoleLists();
        //count 获取到总记录数，配合layUI分页查询
        int count = roleList.size();
        Map<String,Object> result = new HashMap<>();
        result.put("count",count);
        result.put("data",roleList);
        result.put("msg","");
        result.put("code",0);
        return  result;
    }

}
