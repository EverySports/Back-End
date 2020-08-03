package com.everysports.mapper;

import com.everysports.domain.SearchClassVO;

import java.util.List;

public interface SearchClassMapper {
    public List<SearchClassVO> selectSearchClass(Long class_Category);
}
