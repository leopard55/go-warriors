package com.leopard.chapter5.pojo;

import com.leopard.chapter5.enumeration.SexEnum;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-30 11:21
 */
@Alias(value = "user")
@Data
public class User {
    private Long id = null;
    private String userName = null;
    private String note = null;
    private SexEnum sex = null;
    public User() {}
}
