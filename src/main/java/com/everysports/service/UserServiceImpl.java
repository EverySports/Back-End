package com.everysports.service;

import com.everysports.domain.UserVO;
import com.everysports.mapper.UserMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Setter(onMethod_=@Autowired)
    private UserMapper userMapper;

    public List<UserVO> selectUser() {
        return userMapper.selectUser();
    }
}
