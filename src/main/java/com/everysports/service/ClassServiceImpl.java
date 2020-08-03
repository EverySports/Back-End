package com.everysports.service;

import com.everysports.domain.ClassVO;
import com.everysports.mapper.ClassMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{
    @Setter(onMethod_ = @Autowired)
    private ClassMapper classMapper;

    @Override
    public List<ClassVO> selectClass() {
        return classMapper.selectClass();
    }
}
