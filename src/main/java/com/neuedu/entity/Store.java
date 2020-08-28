package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Store {
    private Long storeid;

    private String storename;

    private Integer fansnum;

    private Integer storelevel;

    private Long firsttypeid0;

    private Long firsttypeid1;

    private Long firsttypeid2;

    private Long firsttypeid3;

    private Long firsttypeid4;

    private Long userid;

    private String storeheadportrait;

    private Date createtime;


}