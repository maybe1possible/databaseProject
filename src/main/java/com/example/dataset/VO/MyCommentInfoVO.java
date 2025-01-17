package com.example.dataset.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyCommentInfoVO {
    private Integer commentId;
    private Integer materialId;
    private String title;
    private String fileType;
    private String content;
    private LocalDateTime commentTime;
    private Integer state;
}
