package com.leopard.chapter5.dao;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 14:18
 */

import com.leopard.chapter5.pojo.User;
import org.springframework.stereotype.Repository;

/**** imports ****/
@Repository
public
//pulbic interface MyBatisUserDao {
interface MyBatisUserDao {
    public User getUser(Long id);
}
