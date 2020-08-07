package com.everysports.domain;

import lombok.Data;

import java.util.List;

@Data
public class PaymentVO {
    private List<TeacherScheduleVO> teacherScheduleVOList;
    private List<UserScheduleVO> userScheduleVOList;
}
