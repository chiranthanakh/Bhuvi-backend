package com.sbd.Bhuvi.mapper;

import com.sbd.Bhuvi.dto.TalukDto;
import com.sbd.Bhuvi.entity.Taluk;

public class TalukMapper {

    public static TalukDto mapToTalukDto(Taluk taluk){
        return new TalukDto(
                taluk.getId(),
                taluk.getDistrictId(),
                taluk.getName()
        );
    }

    public static Taluk mapToTaluk(TalukDto talukDto){
        return new Taluk(
                talukDto.getDistrictId(),
                talukDto.getName()
        );
    }
}
