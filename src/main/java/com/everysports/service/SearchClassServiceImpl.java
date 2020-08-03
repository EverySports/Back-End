package com.everysports.service;

import com.everysports.domain.SearchClassVO;
import com.everysports.mapper.SearchClassMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchClassServiceImpl implements SearchClassService{
    @Setter(onMethod_ = @Autowired)
    private SearchClassMapper searchClassMapper;

    @Override
    public List<SearchClassVO> selectSearchClass(Long class_Category) {
        return searchClassMapper.selectSearchClass(class_Category);
    }
}
