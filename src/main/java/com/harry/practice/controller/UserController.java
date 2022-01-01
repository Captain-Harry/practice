package com.harry.practice.controller;

import com.harry.practice.entity.User;
import com.harry.practice.service.UserSerivice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Api(tags = "用户controller")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserSerivice userSerivice;

    @ApiOperation(value = "首页", notes = "首页",httpMethod = "GET")
    @RequestMapping("index")
    public String index(){
        return "成功访问index";
    }

    @RequestMapping("findById")
    @ApiOperation(value = "查找用户",notes = "查找用户",httpMethod = "GET")
    @ApiImplicitParam(name = "id", value = "用户id",dataType = "Integer" ,required = true)
    public User findById(int id){
        return userSerivice.findById(id);
    }

    @RequestMapping("addUser")
    @ApiOperation(value = "添加用户",notes = "添加用户",httpMethod = "POST")
//    @ApiImplicitParams({
//    @ApiImplicitParam(name = "userName", value = "用户姓名",dataType = "String"),
//    @ApiImplicitParam(name = "userPassword", value = "用户密码",dataType = "String")
//    })
    public Boolean addUser(@RequestBody User user){
        return userSerivice.addUser(user);
    }

    @RequestMapping("updateUser")
    @ApiOperation(value="修改用户",notes = "修改用户",httpMethod = "POST")
    public Boolean updateUser(@RequestBody User user){
        return userSerivice.updateUser(user);
    }

    @RequestMapping("deleteUser")
    @ApiOperation(value="删除用户",notes = "删除用户",httpMethod = "DELETE")
    public Boolean deleteUser(int userId){
        return userSerivice.deleteUser(userId);
    }

    @RequestMapping("addUserBatch")
    @ApiOperation(value="批量新增用户",notes = "批量新增用户",httpMethod = "POST")
    public Integer addUserBatch(@RequestBody List<User> userList){

        return userSerivice.addUserBatch(userList);
    }

    @RequestMapping("deleteUserBatch")
    @ApiOperation(value="批量删除用户",notes = "批量删除用户",httpMethod = "POST")
    public Integer deleteUserBatch(@RequestBody List<Integer> idList){

        return userSerivice.deleteUserBatch(idList);
    }
}
