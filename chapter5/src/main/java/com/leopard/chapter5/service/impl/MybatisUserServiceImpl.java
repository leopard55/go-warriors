package com.leopard.chapter5.service.impl;

import com.leopard.chapter5.dao.MyBatisUserDao;
import com.leopard.chapter5.pojo.User;
import com.leopard.chapter5.service.MybatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 14:27
 */
@Service
public class MybatisUserServiceImpl implements MybatisUserService {
    @Autowired
    private MyBatisUserDao mybatisUserDao = null;

    @Override
    public User getUser(Long id) {
        return null;
    }
}
