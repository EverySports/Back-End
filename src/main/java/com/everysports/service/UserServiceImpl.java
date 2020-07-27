package com.everysports.service;

import com.everysports.domain.UserVO;
import com.everysports.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Setter(onMethod_=@Autowired)
    private UserMapper userMapper;

    @Override
    public UserVO selectUser() {
        return userMapper.selectUser();
    }
}
