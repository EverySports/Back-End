package com.everysports.service;

import com.everysports.domain.NewClassVO;
import com.everysports.mapper.NewClassMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewClassServiceImpl implements NewClassService{
    @Setter(onMethod_ = @Autowired)
    private NewClassMapper newClassMapper;

    @Override
    public List<NewClassVO> selectNewClass() {
        return newClassMapper.selectNewClass();
    }
}
