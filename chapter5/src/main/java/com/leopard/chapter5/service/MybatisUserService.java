package com.leopard.chapter5.service;

import com.leopard.chapter5.pojo.User;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 14:23
 */
public interface MybatisUserService {
    User getUser(Long id);
}
