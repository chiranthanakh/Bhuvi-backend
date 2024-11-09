package com.sbd.Bhuvi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImagesDto {
    private Long id;
    private String url;
    private String name;

    public ImagesDto(Long id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
