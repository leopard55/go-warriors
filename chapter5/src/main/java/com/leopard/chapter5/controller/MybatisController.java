package com.leopard.chapter5.controller;

import com.leopard.chapter5.pojo.User;
import com.leopard.chapter5.service.MybatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 14:33
 */
@Controller
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired
    private MybatisUserService mybatisUserService = null;

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        return mybatisUserService.getUser(id);
    }
}
