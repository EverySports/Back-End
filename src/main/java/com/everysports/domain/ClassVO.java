package com.everysports.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ClassVO {
    private Long class_ID;
    private Long teacher_ID;
    private String class_Name;
    private Long class_Num;
    private Long class_Category;
    private String class_Curriculum;
    private String class_Policy;
    private Long class_LikeNum;
    private Long class_Price;
    private Long class_Lowerbound;
    private Date class_OpenDate;
}
