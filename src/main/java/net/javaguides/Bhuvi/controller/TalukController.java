package net.javaguides.Bhuvi.controller;

import net.javaguides.Bhuvi.dto.TalukDto;
import net.javaguides.Bhuvi.service.TalukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Taluk")
public class TalukController {

    @Autowired
    private TalukService talukService;

    // Build Add Taluk Rest API
    @PostMapping("adduser")
    public ResponseEntity<TalukDto> createTaluk(@RequestBody TalukDto talukDto) {
        TalukDto savedTaluk = talukService.createTaluk(talukDto);
        return new ResponseEntity<>(savedTaluk, HttpStatus.CREATED);
    }

    //Get user REST API
    @GetMapping("get/{id}")
    public ResponseEntity<TalukDto> getTalukById(@PathVariable("id") Long talukId){
        TalukDto talukDto = talukService.getTalukById(talukId);
        return ResponseEntity.ok(talukDto);
    }

    //Get all users REST API
    @GetMapping
    public ResponseEntity<List<TalukDto>> getAllTalukas(){
        List<TalukDto> Talukas = talukService.getAllTalukas();
        return ResponseEntity.ok(Talukas);
    }

    //update user REST API
    @PutMapping("putuers/{id}")
    public ResponseEntity<TalukDto> updateTaluk(@PathVariable("id") Long talukId,
                                              @RequestBody TalukDto updatedTaluk){
        TalukDto talukDto = talukService.updateTaluk(talukId ,updatedTaluk);
        return ResponseEntity.ok(talukDto);
    }

    //Delete user REST API
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteTaluk(@PathVariable("id") Long talukId){
        talukService.deleteTaluk(talukId);
        return ResponseEntity.ok("user deleted successfully");
    }
}
