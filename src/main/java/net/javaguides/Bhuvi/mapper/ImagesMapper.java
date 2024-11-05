package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.ImagesDto;
import net.javaguides.Bhuvi.model.Images;

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
