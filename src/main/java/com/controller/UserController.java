package com.controller;
import com.domian.User;
import com.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wq
 * @since 2022-05-02 上午9:33
 */
@RestController
@Api
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部用户接口",httpMethod = "GET")
    public List<User> findAll(){

        return userService.findAll();
    }


    //根据id查询
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    @ApiOperation(value = "根据id查询接口",httpMethod = "POST")
    public User findById(Integer id){
        return userService.findById(id);
    }
}
