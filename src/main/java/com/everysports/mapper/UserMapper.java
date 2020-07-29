package com.everysports.mapper;

import com.everysports.domain.UserVO;

import java.util.List;

public interface UserMapper {
    public List<UserVO> selectUser();
}
