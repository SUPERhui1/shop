package com.neuedu.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private Long orderid;

    private Long userid;

    private Long storeid;

    private String storename;

    private BigDecimal oderprice;

    private Long addressid;

    private String courier;

    private Long couriergoodsid;

    private Integer status;

    private Date createtime;


}