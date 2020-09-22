package cn.scoreanalysis.system.service.impl;

import cn.scoreanalysis.system.mapper.UsersMapper;
import cn.scoreanalysis.system.model.Users;
import cn.scoreanalysis.system.service.UserService;
import cn.scoreanalysis.system.util.DataTableUtil;
import cn.scoreanalysis.system.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public int insert(Users user) {
        return usersMapper.insert(user);
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Users user) {
        return usersMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<Users> selectUserByUserName(String username) {
        return usersMapper.selectUserByUserName(username);
    }

    @Override
    public List<UserRoleVo> getUserRoleByUserId(Integer userid) {
        return usersMapper.getUserRoleByUserId(userid);
    }


    /**
     * 批量删除
     * @param ids
     * @return

    @Override
    public int deleteByPrimaryKey(List<Integer> ids) {
        //set集合不重复，因此集合中只有0或1两个数，size<=2
        Set<Integer> results = new HashSet<>();
        for (int id:ids){
           int result =  usersMapper.deleteByPrimaryKey(id);
           results.add(result);
        }
        if (results.size()==2){
            //集合中有两个元素且为，删除一部分，未删除一部分，提示删除失败
            return 0;
        }
        if (results.size()==1&&results.contains(1)){
            //集合中只有一个元素且为1，删除成功
            return 1;
        }else {
            //集合中只有一个元素且为0，删除成功
            return 0;
        }
        //return usersMapper.deleteByPrimaryKey(id);
    }*/

}
