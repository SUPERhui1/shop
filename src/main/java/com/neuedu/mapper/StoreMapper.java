package com.neuedu.mapper;

import com.neuedu.entity.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Long storeid);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Long storeid);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}