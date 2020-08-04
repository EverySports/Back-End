package com.everysports.service;

import com.everysports.domain.TeacherInfoVO;
import com.everysports.domain.TeacherVO;
import com.everysports.mapper.TeacherInfoMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherInfoServiceImpl implements TeacherInfoService{
    @Setter(onMethod_ = @Autowired)
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public TeacherInfoVO selectTeacher(Long teacher_ID) {
        TeacherInfoVO teacher = new TeacherInfoVO();
        teacher.setTeacherVOList(teacherInfoMapper.selectTeacher(teacher_ID));
        teacher.setClassVOList(teacherInfoMapper.selectClass(teacher_ID));
        teacher.setReviewVOList(teacherInfoMapper.selectReview(teacher_ID));
        return teacher;
    }
}
