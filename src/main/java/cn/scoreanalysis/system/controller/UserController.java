package cn.scoreanalysis.system.controller;

import cn.scoreanalysis.system.model.Users;
import cn.scoreanalysis.system.model.UsersRole;
import cn.scoreanalysis.system.service.RoleService;
import cn.scoreanalysis.system.service.UserRoleService;
import cn.scoreanalysis.system.service.UserService;
import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.util.LayUITreeDataConvert;
import cn.scoreanalysis.system.util.ResultMessageUtil;
import cn.scoreanalysis.system.vo.UserRoleVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private UserRoleService userRoleService;

    @Resource
    private RoleService roleService;


    /**
     * 新增用户
     * 1.向用户表插入用户名和姓名
     * @param user
     * @return
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public Map<String,Integer> insertUser(Users user){
        int result = userService.insert(user);
        return ResultMessageUtil.resultMessage(result);
    }

    /**
     * 显示用户列表
     * 分页查询
     * @return usersList
     */
    @ResponseBody
    @RequestMapping("/selectAll")
    //layUI返回的json需要有msg信息,code：0正确code码,count总记录数,data实体数据集
    //创建工具类返回，
    public DataTableUtil selectAll(DataTableUtil dataTableUtil){
        //查询前传入页码和每页显示的条数
        PageHelper.startPage(dataTableUtil.getPage(),dataTableUtil.getLimit());
        //startPage（）后紧跟要分页的查询方法
        List<Users> userList = userService.selectAll();
        //使用pageInfo包装查询结果集，并传入连续显示的页数
        PageInfo pageInfo = new PageInfo(userList,dataTableUtil.getLimit());
        dataTableUtil = new DataTableUtil("成功",0, (int) pageInfo.getTotal(),pageInfo.getList());
        return dataTableUtil;
    }
    /*
    使用Map集合返回
    public MapMap<String,Object> selectAll(){
        Map<String,Object> data = new HashMap<>();
        List<Users> userList = userService.selectAll();
        int count = userList.size();
        data.put("count",count);
        data.put("msg","");
        data.put("code",0);
        data.put("data",userList);
        return data;
    }
     */

    /**
     * 批量删除用户
     * @param ids
     * @return map

    @ResponseBody
    @RequestMapping("/deleteByPrimaryKey")
    public Map<String,Integer> deleteByPrimaryKey(List<Integer> ids){
       //ids = new HashMap<Integer>();
        int result = userService.deleteByPrimaryKey(ids);
        return ResultMessageUtil.resultMessage(result);
    }*/

    /**
     * 删除
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteByPrimaryKey")
    public Map<String,Integer> deleteByPrimaryKey(Integer id) {
        //ids = new HashMap<Integer>();
        int result = userService.deleteByPrimaryKey(id);
        return ResultMessageUtil.resultMessage(result);
    }

    /**
     * 修改
     * 1.修改基础信息
     * 2.修改角色信息
     * @param user
     * @return result
     */
    @ResponseBody
    @RequestMapping("/updateByPrimaryKey")
    public Map<String,Integer> updateByPrimaryKey(Users user,UsersRole usersRole,Integer []roleIds){
        int result = 0;
        //修改用户信息
        userService.updateByPrimaryKey(user);
        //修改基础信息成功后，修改角色
        if (roleIds.length > 0 && roleIds[0] > 0 ){
            //删除用户角色
            result = userRoleService.deleteByUserPrimaryKey(user.getId());
            //删除成功后添加用户角色
            if(result>0){
                //set userId
                usersRole.setUserid(user.getId());
                for (int roleid:roleIds) {
                    //set roleId
                    usersRole.setRoleid(roleid);
                    result = userRoleService.insert(usersRole);
                }
            }
        }
        return ResultMessageUtil.resultMessage(result);
    }


    /**
     * 查看用户角色
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/getUserRoleByUserId")
    public List<LayUITreeDataConvert> getUserRoleByUserId(Integer userid, LayUITreeDataConvert pageUtil){
        Map<String,Object> map1  = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        Map [] maps = {map1,map2};
        List<LayUITreeDataConvert> list = new ArrayList<>();
        pageUtil = new LayUITreeDataConvert();
        List<UserRoleVo> userRoleVo = userService.getUserRoleByUserId(userid);
        pageUtil.setId(userRoleVo.get(0).getId());
        pageUtil.setTitle(userRoleVo.get(0).getUsername());
        pageUtil.setChildren(new ArrayList<>());
        for (int i=0;i<userRoleVo.get(0).getRoles().size();i++){
            maps[i].put("title",userRoleVo.get(0).getRoles().get(i).getDescription());
            pageUtil.getChildren().add(maps[i]);
        }
        list.add(pageUtil);
        return list;
    }

    /**
     * 查询用户
     * @param dataTableUtil
     * @param username
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectUserByUserName")
    public DataTableUtil selectUserByUserName(DataTableUtil dataTableUtil ,String username){
        System.out.println(username);
        List<Users> userList = userService.selectUserByUserName(username);
        dataTableUtil = new DataTableUtil("成功",0,userList.size(),userList);
        return dataTableUtil;
    }

    /**
     * 设置角色
     * @param usersRole
     * @return
     */
    @ResponseBody
    @RequestMapping("/setRoleForUser")
    public Map<String, Integer> setRoleForUser(UsersRole usersRole) {
       return ResultMessageUtil.resultMessage(userRoleService.insert(usersRole));
    }
}
