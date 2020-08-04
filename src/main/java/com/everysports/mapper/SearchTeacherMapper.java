package com.everysports.mapper;

import com.everysports.domain.SearchTeacherVO;

import java.util.List;

public interface SearchTeacherMapper {
    public List<SearchTeacherVO> selectSearchTeacher(Long class_Category);
}
