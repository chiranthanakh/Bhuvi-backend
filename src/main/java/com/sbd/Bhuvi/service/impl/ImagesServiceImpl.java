package com.sbd.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import com.sbd.Bhuvi.dto.ImagesDto;
import com.sbd.Bhuvi.mapper.ImagesMapper;
import com.sbd.Bhuvi.entity.Images;
import com.sbd.Bhuvi.repository.ImagesRepository;
import com.sbd.Bhuvi.service.ImagesService;
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
