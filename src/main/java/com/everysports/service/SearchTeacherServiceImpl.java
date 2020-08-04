package com.everysports.service;

import com.everysports.domain.SearchTeacherVO;
import com.everysports.mapper.SearchTeacherMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchTeacherServiceImpl implements SearchTeacherService{
    @Setter(onMethod_ = @Autowired)
    private SearchTeacherMapper searchTeacherMapper;

    @Override
    public List<SearchTeacherVO> selectSearchTeacher(Long class_Category) {
        return searchTeacherMapper.selectSearchTeacher(class_Category);
    }
}
