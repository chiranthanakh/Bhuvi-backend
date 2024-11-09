package com.sbd.Bhuvi.service;

import com.sbd.Bhuvi.dto.DistrictDto;

import java.util.List;

public interface DistrictService {
    DistrictDto createDistrict(DistrictDto districtDto);

    DistrictDto getDistrictById(Long districtId);

    List<DistrictDto> getAllDistricts();

    DistrictDto updateDistrict(Long districtId, DistrictDto updatedDistrict);

    void deleteDistrict(Long districtId);


}
