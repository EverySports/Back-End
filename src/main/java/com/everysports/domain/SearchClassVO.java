package com.everysports.domain;

import lombok.Data;

@Data
public class SearchClassVO {
    private Long class_ID;
    private String class_Name;
    private Long class_Num;
    private Long class_Price;
    private String teacher_Gender;
    private String uploadPath;
    private String fileName;
}
