package com.everysports.domain;

import lombok.Data;

@Data
public class NewClassVO {
    private String class_Name;
    private Long class_Price;
    private Long class_Num;
    private String teacher_Name;
    private String uploadPath;
    private String fileName;
}
