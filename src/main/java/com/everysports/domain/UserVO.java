package com.everysports.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO {
        private Long user_ID;
        private String user_Email;
        private String user_Name;
        private String user_Gender;
        private Date user_Birthday;
        private String user_Phone;
        private Long user_Point;
}
