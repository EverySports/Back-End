package com.everysports.domain;

import lombok.Data;

import java.util.Date;

@Data
public class NewClassVO {
    private String class_Name;
    private Long class_Price;
    private Date class_OpenDate;
    private String teacher_Name;
    private String uploadPath;
    private String fileName;
}
