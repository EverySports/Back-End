package com.everysports.domain;

import lombok.Data;

@Data
public class HotClassVO {
    private String class_Name;
    private String teacher_Name;
    private Long class_Price;
    private String uploadPath;
    private String fileName;
    private Long class_Num;
}
