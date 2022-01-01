package com.harry.practice.service.impl;

import com.harry.practice.entity.User;
import com.harry.practice.mapper.UserMapper;
import com.harry.practice.service.UserSerivice;
import com.harry.practice.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserSerivice {

    @Resource
    private UserMapper userMapper;

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public Boolean addUser(User user) {
        user.setUuid(UUID.randomUUID());
        return userMapper.addUser(user);
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @Override
    public Boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }


    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    @Override
    public Boolean deleteUser(int userId) {
        return userMapper.deleteUser(userId);
    }

    /**
     * 批量新增user
     * @param userList
     * @return
     */
    @Override
    public Integer addUserBatch(List<User> userList) {
        userList.stream().forEach(item->item.setUuid(UUID.randomUUID()));
        return userMapper.addUserBatch(userList);
    }

    @Override
    public Integer deleteUserBatch(List<Integer> idList) {
        return userMapper.deleteUserBatch(idList);
    }
}
