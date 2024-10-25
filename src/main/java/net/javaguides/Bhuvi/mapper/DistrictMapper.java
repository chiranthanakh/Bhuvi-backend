package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.DistrictDto;
import net.javaguides.Bhuvi.model.District;

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
