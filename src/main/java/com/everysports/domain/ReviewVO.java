package com.everysports.domain.ReviewVO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReviewVO {
    private Long user_ID;
    private String review_Title;
    private String review_Content;
    private LocalDate review_CreatedAt;
}
