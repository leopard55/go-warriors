package com.leopard.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leopard.mybatisplusdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Descriptoin: TODO(这里就是操作数据库的地方)
 * @Author: leopard
 * @CreateDate: 2022-01-06 13:31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
