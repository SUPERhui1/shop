package com.neuedu.mapper;

import com.neuedu.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}