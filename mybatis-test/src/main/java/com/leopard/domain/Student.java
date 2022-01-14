package com.leopard.domain;

import lombok.Data;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-01-14 13:08
 */
@Data
public class Student {
    //定义属性，和student表中的字段对应
    private int id;            //id===>s_id
    private String name;    //name===>s_name
}
