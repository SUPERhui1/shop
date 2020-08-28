package com.neuedu.mapper;

import com.neuedu.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Long addressid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Long addressid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}