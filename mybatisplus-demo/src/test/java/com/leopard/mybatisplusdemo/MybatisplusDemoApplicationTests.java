package com.leopard.mybatisplusdemo;

import com.leopard.mybatisplusdemo.entity.User;
import com.leopard.mybatisplusdemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j //lombok的日志注解
@SpringBootTest
class MybatisplusDemoApplicationTests {

    @Autowired(required = false)
    UserMapper userMapper;

    @DisplayName("测试mybatis-plus操作")
    @Test
    void contextLoads() {
        //查,selectList获取所有的用户信息
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

        //更新
        User user = new User(1, "张三", "123");
        int update = userMapper.update(user, null);
        System.out.println(update);  // 返回1说明更新成功了

        //插入
        User user1 = new User();
        user1.setUsername("王五");
        user1.setPassword("123456");
        int insert = userMapper.insert(user1);
        log.warn("insert ==> {}", insert);

        //删除
        int delete = userMapper.deleteById(2);// 指定实体类或Id
        log.warn("delete ==> {}", delete);
    }

}
