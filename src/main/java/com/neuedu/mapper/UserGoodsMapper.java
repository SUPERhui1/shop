package com.neuedu.mapper;

import com.neuedu.entity.UserGoods;

public interface UserGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserGoods record);

    int insertSelective(UserGoods record);

    UserGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserGoods record);

    int updateByPrimaryKey(UserGoods record);
}