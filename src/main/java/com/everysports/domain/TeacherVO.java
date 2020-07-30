package com.everysports.domain;

import lombok.Data;

import java.util.Date;

@Data
public class TeacherVO {
    private Long teacher_ID;
    private String teacher_Email;
    private String teacher_Name;
    private String teacher_Gender;
    private Date teacher_Birthday;
    private String teacher_Phone;
    private String teacher_Content;
    private Long teacher_Point;
}
