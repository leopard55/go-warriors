package com.leopardtest;

import com.leopard.dao.UserDao;
import com.leopard.domain.User;
import com.leopard.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-20 14:21
 */
public class TestCRUDByAnnotationMapper {
    @Test
    public void testAdd(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserDao接口的实现类对象，UserDao接口的实现类对象由sqlSession.getMapper(UserDao.class)动态构建出来
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setName("用户xdp");
        user.setAge(20);
        int add = mapper.add(user);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(add);
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserDao接口的实现类对象，UserDao接口的实现类对象由sqlSession.getMapper(UserDao.class)动态构建出来
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(3);
        user.setName("孤傲苍狼_xdp");
        user.setAge(26);
        //执行修改操作
        int retResult = mapper.update(user);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserDao接口的实现类对象，UserDao接口的实现类对象由sqlSession.getMapper(UserDao.class)动态构建出来
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //执行删除操作
        int retResult = mapper.deleteById(7);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }

    @Test
    public void testGetUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //得到UserDao接口的实现类对象，UserDao接口的实现类对象由sqlSession.getMapper(UserDao.class)动态构建出来
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //执行查询操作，将查询结果自动封装成User返回
        User user = mapper.getById(8);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void testGetAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //得到UserDao接口的实现类对象，UserDao接口的实现类对象由sqlSession.getMapper(UserDao.class)动态构建出来
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //执行查询操作，将查询结果自动封装成List<User>返回
        List<User> lstUsers = mapper.getAll();
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(lstUsers);
    }
}
