package net.javaguides.Bhuvi.service;

import net.javaguides.Bhuvi.dto.TalukDto;

import java.util.List;

public interface TalukService {
    TalukDto createTaluk(TalukDto talukDto);

    TalukDto getTalukById(Long TalukId);

    List<TalukDto> getAllTalukas();

    TalukDto updateTaluk(Long TalukId, TalukDto updatedEmployee);

    void deleteTaluk(Long TalukId);
}
