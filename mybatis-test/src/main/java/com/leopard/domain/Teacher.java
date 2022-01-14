package com.leopard.domain;

import lombok.Data;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-01-14 12:52
 */
@Data
public class Teacher {
    //定义实体类的属性，与teacher表中的字段对应
    private int id;            //id===>t_id
    private String name;    //name===>t_name
}
