package com.sbd.Bhuvi.controller;

import lombok.AllArgsConstructor;
import com.sbd.Bhuvi.dto.DistrictDto;
import com.sbd.Bhuvi.service.DistrictService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("District")
public class DistrictController {

    private DistrictService districtService;

    //add user REST API
    @PostMapping("adduser")
    public ResponseEntity<DistrictDto> createDistrict(@RequestBody DistrictDto districtDto){
        DistrictDto savedDistrict = districtService.createDistrict(districtDto);
        return new ResponseEntity<>(savedDistrict , HttpStatus.CREATED);
    }

    //Get user REST API
    @GetMapping("get/{id}")
    public ResponseEntity<DistrictDto> getDistrictById(@PathVariable("id") Long districtId){
        DistrictDto districtDto = districtService.getDistrictById(districtId);
        return ResponseEntity.ok(districtDto);
    }

    //Get all users REST API
    @GetMapping("AllDistricts")
    public ResponseEntity<List<DistrictDto>> getAllDistricts(){
        List<DistrictDto> districts = districtService.getAllDistricts();
        return ResponseEntity.ok(districts);
    }

    //update user REST API
    @PutMapping("putuers/{id}")
    public ResponseEntity<DistrictDto> updateDistrict(@PathVariable("id") Long districtId,
                                              @RequestBody DistrictDto updatedDistrict){
        DistrictDto districtDto = districtService.updateDistrict(districtId ,updatedDistrict);
        return ResponseEntity.ok(districtDto);
    }
    //Delete user REST API
    @DeleteMapping("Delete/{id}")
    public ResponseEntity<String> deleteDistrict(@PathVariable("id") Long districtId){
        districtService.deleteDistrict(districtId);
        return ResponseEntity.ok("District deleted successfully");
    }
}
