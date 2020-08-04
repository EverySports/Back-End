package com.everysports.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ReviewVO {
    private Long user_ID;
    private String review_Title;
    private String review_Content;
    private Date review_CreatedAt;
}
