package com.everysports.service;

import com.everysports.domain.HotClassVO;
import com.everysports.mapper.HotClassMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotClassServiceImpl implements HotClassService{
    @Setter(onMethod_ = @Autowired)
    private HotClassMapper hotClassMapper;

    @Override
    public List<HotClassVO> selectHotClass() {
        return hotClassMapper.selectHotClass();
    }
}
