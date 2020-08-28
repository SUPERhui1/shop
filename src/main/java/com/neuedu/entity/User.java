package com.neuedu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long userid;

    private Integer loginphone;

    private String email;

    private String password;

    private String nickname;

    private String gender;

    private Integer status;

    private String userheadportrait;

    private Date createtime;


}