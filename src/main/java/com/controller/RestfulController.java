package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.UserInfo;

import io.swagger.annotations.Api;




@Api(tags = { "Restful API demo" })
@RestController
public class RestfulController {

    @PostMapping(value = "/v1/user")
    public void addUser(@RequestBody UserInfo userInfo) {

    }

    @DeleteMapping(value = "/v1/user/{id}")
    public void deleteUser(@PathVariable String id) {

    }

    @PutMapping(value = "/v1/user")
    public void updateUser(@RequestBody UserInfo userInfo) {

    }

    @GetMapping(value = "/v1/user")
    public List<UserInfo> getUsers() {
        List<UserInfo> users = new ArrayList<UserInfo>();
        users.add(new UserInfo("zhangsan", "123456"));
        users.add(new UserInfo("lisw", "123456"));
        users.add(new UserInfo("wangwu", "123456"));
        return users;
    }

}