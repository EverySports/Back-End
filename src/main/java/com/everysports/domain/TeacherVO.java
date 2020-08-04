package com.everysports.domain;

import lombok.Data;

@Data
public class TeacherVO {
    private String teacher_Name;
    private String teacher_Email;
    private String teacher_Gender;
    private String teacher_Content;
    private Long class_SumNum;
    private String uploadPath;
    private String fileName;
}
