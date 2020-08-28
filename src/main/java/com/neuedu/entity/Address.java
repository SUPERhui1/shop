package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Address {
    private Long addressid;

    private String consigneename;

    private Integer userid;

    private Integer addressphone;

    private String province;

    private String city;

    private String area;

    private String detailaddress;

    private String postcode;

    private String label;

    private Integer status;

    private Date createtime;

}