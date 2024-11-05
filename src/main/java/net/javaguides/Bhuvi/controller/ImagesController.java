package net.javaguides.Bhuvi.controller;

import net.javaguides.Bhuvi.dto.ImagesDto;
import net.javaguides.Bhuvi.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("images")
public class ImagesController {

    @Autowired
    private ImagesService imagesService;


    //add images REST API
    @PostMapping("adduser")
    public ResponseEntity<ImagesDto> createImages(@RequestBody ImagesDto imagesDto){
        ImagesDto savedImages = imagesService.createImages(imagesDto);
        return new ResponseEntity<>(savedImages , HttpStatus.CREATED);
    }

}
