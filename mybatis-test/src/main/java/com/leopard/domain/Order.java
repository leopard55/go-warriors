package com.leopard.domain;

import lombok.Data;

/**
 * @Author: leopard
 * @CreateDate: 2021-12-21 10:38
 */
@Data
public class Order {
    //Order实体类中属性名和orders表中的字段名是不一样的
    private int id;                //id===>order_id
    private String orderNo;        //orderNo===>order_no
    private float price;        //price===>order_price
}
