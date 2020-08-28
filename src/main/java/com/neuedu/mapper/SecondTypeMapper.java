package com.neuedu.mapper;

import com.neuedu.entity.SecondType;

public interface SecondTypeMapper {
    int deleteByPrimaryKey(Long secondtypeid);

    int insert(SecondType record);

    int insertSelective(SecondType record);

    SecondType selectByPrimaryKey(Long secondtypeid);

    int updateByPrimaryKeySelective(SecondType record);

    int updateByPrimaryKey(SecondType record);
}