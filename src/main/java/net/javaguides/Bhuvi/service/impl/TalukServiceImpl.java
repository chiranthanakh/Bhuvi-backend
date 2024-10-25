package net.javaguides.Bhuvi.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.Bhuvi.dto.TalukDto;
import net.javaguides.Bhuvi.exception.ResourceNotFoundException;
import net.javaguides.Bhuvi.mapper.TalukMapper;
import net.javaguides.Bhuvi.model.Taluk;
import net.javaguides.Bhuvi.repository.TalukRepository;
import net.javaguides.Bhuvi.service.TalukService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TalukServiceImpl implements TalukService {

    private TalukRepository talukRepository;


    @Override
    public TalukDto createTaluk(TalukDto talukDto) {
        Taluk taluk = TalukMapper.mapToTaluk(talukDto);
        Taluk savedTaluk = talukRepository.save(taluk);
        return TalukMapper.mapToTalukDto(savedTaluk);
    }

    @Override
    public TalukDto getTalukById(Long TalukId) {
        Taluk taluk = talukRepository.findById(TalukId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exist with given id:" + TalukId));
        return TalukMapper.mapToTalukDto(taluk);
    }


    @Override
    public List<TalukDto> getAllTalukas() {
            List<Taluk> talukas = talukRepository.findAll();
            return talukas.stream().map((taluk) -> TalukMapper.mapToTalukDto(taluk))
                    .collect(Collectors.toList());    }

    @Override
    public TalukDto updateTaluk(Long TalukId, TalukDto updatedEmployee) {
            Taluk taluk = talukRepository.findById(TalukId).orElseThrow(
                    () -> new ResourceNotFoundException("User does not exist with given id: " + TalukId)
            );

            taluk.setDistrictId(updatedEmployee.getDistrictId());
            taluk.setName(updatedEmployee.getName());
            Taluk updatedTalukObj = talukRepository.save(taluk);
            return TalukMapper.mapToTalukDto(updatedTalukObj);
    }

    @Override
    public void deleteTaluk(Long TalukId) {
            Taluk taluk = talukRepository.findById(TalukId).orElseThrow(
                    () -> new ResourceNotFoundException("User does not exist with given id: " + TalukId)
            );
            talukRepository.deleteById(TalukId);
    }
}
