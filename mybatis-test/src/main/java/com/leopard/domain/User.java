package com.leopard.domain;

import lombok.Data;

@Data
public class User {
    //实体类的属性和表的字段名称一一对应
    private int id;
    private String name;
    private int age;
}
