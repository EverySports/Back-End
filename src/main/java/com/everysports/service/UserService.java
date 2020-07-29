package com.everysports.service;

import com.everysports.domain.UserVO;

import java.util.List;

public interface UserService {
    public List<UserVO> selectUser();
}
