package com.everysports.domain;

import lombok.Data;

import java.util.List;

@Data
public class TeacherInfoVO {

    private List<TeacherVO> TeacherVOList;
    private List<ClassVO> classVOList;
    private List<ReviewVO> reviewVOList;
}
