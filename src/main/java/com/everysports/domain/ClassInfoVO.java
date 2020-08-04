package com.everysports.domain;

import lombok.Data;

import java.util.List;

@Data
public class ClassInfoVO {
    private List<TeacherVO> teacherVOList;
    private List<ClassVO> classVOList;
    private List<ReviewVO> reviewVOList;
}
