package com.leopard.mybatis.pojo;

import lombok.Data;

/**
 * @Descriptoin: User用户类
 * @Author: leopard
 * @CreateDate: 2022-03-01 14:58
 */
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String sex, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
