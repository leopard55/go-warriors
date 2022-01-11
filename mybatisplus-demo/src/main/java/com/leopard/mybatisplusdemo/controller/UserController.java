package com.leopard.mybatisplusdemo.controller;

import com.leopard.mybatisplusdemo.entity.User;
import com.leopard.mybatisplusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-01-06 17:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    UserMapper userMapper;

    @GetMapping // 返回表中所有用户
    public List<User> getUsers() {
        return userMapper.selectList(null);
    }

    @PostMapping
    public boolean saveUser(@RequestBody User user) {
        int i = userMapper.insert(user);
        return i == 1;
    }

    @PutMapping
    public Boolean updateUser(@RequestBody User user) {
        int u = userMapper.updateById(user);
        return u == 1;
    }

    @DeleteMapping
    public Boolean deleteUser(int id) { // 通过用户id删除用户
        int d = userMapper.deleteById(id);
        return d == 1;
    }


}
