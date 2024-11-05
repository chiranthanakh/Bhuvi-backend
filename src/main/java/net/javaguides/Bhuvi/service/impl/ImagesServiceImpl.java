package net.javaguides.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.Bhuvi.dto.ImagesDto;
import net.javaguides.Bhuvi.mapper.ImagesMapper;
import net.javaguides.Bhuvi.mapper.UserMapper;
import net.javaguides.Bhuvi.model.Images;
import net.javaguides.Bhuvi.model.User;
import net.javaguides.Bhuvi.repository.ImagesRepository;
import net.javaguides.Bhuvi.service.ImagesService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImagesServiceImpl implements ImagesService {

    private ImagesRepository imagesRepository;

    @Override
    public ImagesDto createImages(ImagesDto imagesDto) {
        Images images = ImagesMapper.mapToImages(imagesDto);
        Images savedImages = imagesRepository.save(images);
        return ImagesMapper.mapToImagesDto(savedImages);
    }
}
