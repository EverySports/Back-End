package com.everysports.domain;

import lombok.Data;

@Data
public class SearchTeacherVO {
    private Long teacher_ID;
    private String teacher_Name;
    private Long class_SumNum;
    private String uploadPath;
    private String fileName;
}
