package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Cart {
    private Long cartid;

    private Long userid;

    private Long goodsid;

    private Integer goodsnum;

    private Integer carprice;

    private String storename;

    private Long storeid;

    private Date createtime;

}