package com.everysports.mapper;

import com.everysports.domain.PaymentVO;
import com.everysports.domain.TeacherScheduleVO;
import com.everysports.domain.UserScheduleVO;

import java.util.List;

public interface PaymentMapper {
    public List<TeacherScheduleVO> selectTeacherSchedule(Long teacher_ID);

    public List<UserScheduleVO> selectUserSchedule(Long class_ID);
}
