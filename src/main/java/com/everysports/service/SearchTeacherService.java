package com.everysports.service;

import com.everysports.domain.SearchTeacherVO;

import java.util.List;

public interface SearchTeacherService {
    public List<SearchTeacherVO> selectSearchTeacher(Long class_Category);
}
