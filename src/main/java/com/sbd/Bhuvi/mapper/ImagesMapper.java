package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.ImagesDto;
import com.sbd.Bhuvi.entity.Images;

public class ImagesMapper {
    public static ImagesDto mapToImagesDto(Images images) {
        return new ImagesDto(
                images.getId(),
                images.getUrl(),
                images.getName()
        );
    }

    public static Images mapToImages(ImagesDto imagesDto) {
        return new Images(
                imagesDto.getUrl(),
                imagesDto.getName()
        );
    }
}
