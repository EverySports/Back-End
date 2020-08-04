package com.everysports.mapper;

import com.everysports.domain.ClassVO;
import com.everysports.domain.ReviewVO;
import com.everysports.domain.TeacherInfoVO;
import com.everysports.domain.TeacherVO;

import java.util.List;

public interface TeacherInfoMapper {
    public List<TeacherVO> selectTeacher(Long teacher_ID);

    public List<ClassVO> selectClass(Long teacher_ID);

    public List<ReviewVO> selectReview(Long teacher_ID);
}
