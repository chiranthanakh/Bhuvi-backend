package net.javaguides.Bhuvi.service;

import net.javaguides.Bhuvi.dto.DistrictDto;

import java.util.List;

public interface DistrictService {
    DistrictDto createDistrict(DistrictDto districtDto);

    DistrictDto getDistrictById(Long districtId);

    List<DistrictDto> getAllDistricts();

    DistrictDto updateDistrict(Long districtId, DistrictDto updatedDistrict);

    void deleteDistrict(Long districtId);


}
