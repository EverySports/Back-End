package com.everysports.service;

import com.everysports.domain.ClassInfoVO;
import com.everysports.mapper.ClassInfoMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassInfoServiceImpl implements ClassInfoService{
    @Setter(onMethod_ = @Autowired)
    private ClassInfoMapper classInfoMapper;

    @Override
    public ClassInfoVO selectClassInfo(Long class_ID) {
        ClassInfoVO classInfoVO = new ClassInfoVO();
        classInfoVO.setTeacherVOList(classInfoMapper.selectTeacher(class_ID));
        classInfoVO.setClassVOList(classInfoMapper.selectClass(class_ID));
        classInfoVO.setReviewVOList(classInfoMapper.selectReview(class_ID));
        return classInfoVO;
    }
}
