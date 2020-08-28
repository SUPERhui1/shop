package com.neuedu.mapper;

import com.neuedu.entity.FirstType;

public interface FirstTypeMapper {
    int deleteByPrimaryKey(Long firsttypeid);

    int insert(FirstType record);

    int insertSelective(FirstType record);

    FirstType selectByPrimaryKey(Long firsttypeid);

    int updateByPrimaryKeySelective(FirstType record);

    int updateByPrimaryKey(FirstType record);
}