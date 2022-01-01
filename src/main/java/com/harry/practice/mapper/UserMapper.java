package com.harry.practice.mapper;

import com.harry.practice.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

//    @Select("select user_id as userId,uuid as uuid,user_name as userName,user_password as userPassword from harry_user where user_id = #{id}")
    User findById(int id);

    Boolean addUser(User user);

    Boolean updateUser(User user);

    Boolean deleteUser(int userId);

    Integer addUserBatch(@Param("userList") List<User> userList);

    Integer deleteUserBatch(@Param("idList") List<Integer> idList);
}
