package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.DistrictDto;
import com.sbd.Bhuvi.entity.District;

public class DistrictMapper {
    public static DistrictDto mapToDistrictDto(District district) {
        return new DistrictDto(
                district.getId(),
                district.getName(),
                district.getState()
        );
    }

    public static District mapToDistrict(DistrictDto districtDto) {
        return new District(
                districtDto.getName(),
                districtDto.getState()
        );
    }
}
