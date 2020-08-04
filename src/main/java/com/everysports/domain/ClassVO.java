package com.everysports.domain;

import lombok.Data;

@Data
public class ClassVO {
    private Long class_ID;
    private String class_Name;
    private Long class_Num;
    private Long class_Price;
    private String uploadPath;
    private String fileName;
}
