package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserGoods {
    private Long id;

    private Long userid;

    private Long goodsid;

    private String imag0;

    private String goodsname;

    private Integer price;

    private Integer collectionnum;

    private Date createtime;


}