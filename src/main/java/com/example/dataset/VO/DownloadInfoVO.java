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
public class DownloadInfoVO {
    Integer id;

    String title;

    String fileType;

    String fileSize;

    String LocalPath;

    LocalDateTime downloadTime;
}
