package com.neuedu.mapper;

import com.neuedu.entity.UserStore;

public interface UserStoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserStore record);

    int insertSelective(UserStore record);

    UserStore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserStore record);

    int updateByPrimaryKey(UserStore record);
}