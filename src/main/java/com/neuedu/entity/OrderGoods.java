package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderGoods {
    private Long id;

    private Long orderid;

    private Long goodsid;

    private Integer num;

    private Date createtime;


}