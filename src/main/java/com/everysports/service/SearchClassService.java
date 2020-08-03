package com.everysports.service;

import com.everysports.domain.SearchClassVO;

import java.util.List;

public interface SearchClassService {
    public List<SearchClassVO> selectSearchClass(Long class_Category);
}
