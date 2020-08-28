package com.neuedu.mapper;

import com.neuedu.entity.GoodsTag;

public interface GoodsTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GoodsTag record);

    int insertSelective(GoodsTag record);

    GoodsTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsTag record);

    int updateByPrimaryKey(GoodsTag record);
}