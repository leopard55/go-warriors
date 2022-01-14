package com.leopard.domain;

import lombok.Data;

import java.util.List;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-01-14 12:53
 */
@Data
public class Classes {
    //定义实体类的属性，与class表中的字段对应
    private int id;            //id===>c_id
    private String name;    //name===>c_name

    /**
     * class表中有一个teacher_id字段，所以在Classes类中定义一个teacher属性，
     * 用于维护teacher和class之间的一对一关系，通过这个teacher属性就可以知道这个班级是由哪个老师负责的
     */
    private Teacher teacher;

    //使用一个List<Student>集合属性表示班级拥有的学生
    private List<Student> students;
}
