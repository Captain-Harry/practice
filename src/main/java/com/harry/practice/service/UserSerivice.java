package com.harry.practice.service;

import com.apple.eawt.UserSessionListener;
import com.harry.practice.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserSerivice {

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 新增用户
     * @param user
     * @return
     */
    Boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    Boolean updateUser(User user);

    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    Boolean deleteUser(int userId);


    /**
     * 批量新增user
     * @param userList
     * @return
     */
    Integer addUserBatch(List<User> userList);

    /**
     * 批量删除
     * @param idList
     * @return
     */
    Integer deleteUserBatch(List<Integer> idList);
}
