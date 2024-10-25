package net.javaguides.Bhuvi.mapper;

import net.javaguides.Bhuvi.dto.TalukDto;
import net.javaguides.Bhuvi.model.Taluk;

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
