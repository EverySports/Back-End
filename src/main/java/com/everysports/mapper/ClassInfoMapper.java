package com.everysports.mapper;

import com.everysports.domain.ClassInfoVO;
import com.everysports.domain.ClassVO;
import com.everysports.domain.ReviewVO;
import com.everysports.domain.TeacherVO;

import java.util.List;

public interface ClassInfoMapper {
    public List<TeacherVO> selectTeacher(Long class_ID);
    public List<ClassVO> selectClass(Long class_ID);
    public List<ReviewVO> selectReview(Long class_ID);
}
