package com.neuedu.mapper;

import com.neuedu.entity.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Long cartid);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Long cartid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}