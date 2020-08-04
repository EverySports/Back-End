package com.everysports.service;

import com.everysports.domain.ClassVO;
import com.everysports.domain.ReviewVO;
import com.everysports.domain.TeacherVO;
import com.everysports.mapper.TeacherMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Setter(onMethod_=@Autowired)
    private TeacherMapper teacherMapper;

    @Override
    public List<TeacherVO> selectTeacher() {
        return teacherMapper.selectTeacher();
    }
}
