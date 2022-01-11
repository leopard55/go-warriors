package com.leopard.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Descriptoin: TODO(实体类，对应数据库中的表)
 * @Author: leopard
 * @CreateDate: 2022-01-06 13:28
 */
@AllArgsConstructor //全参构造器
@NoArgsConstructor //无参构造器
@Data
@TableName("user") //可以指定是数据库中哪张表
public class User {
    // 指定主键是自动自动的，不然会出现随机数
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;
}
