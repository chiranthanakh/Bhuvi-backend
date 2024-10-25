package net.javaguides.Bhuvi.service.impl;

import net.javaguides.Bhuvi.dto.DistrictDto;
import net.javaguides.Bhuvi.exception.ResourceNotFoundException;
import net.javaguides.Bhuvi.mapper.DistrictMapper;
import net.javaguides.Bhuvi.model.District;
import net.javaguides.Bhuvi.repository.DistrictRepository;
import net.javaguides.Bhuvi.service.DistrictService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public DistrictDto createDistrict(DistrictDto districtDto) {
        District district = DistrictMapper.mapToDistrict(districtDto);
        District savedDistrict = districtRepository.save(district);
        return DistrictMapper.mapToDistrictDto(savedDistrict);
    }

    @Override
    public DistrictDto getDistrictById(Long districtId) {
        District district = districtRepository.findById(districtId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exist with given id:" + districtId));
        return DistrictMapper.mapToDistrictDto(district);
    }

    @Override
    public List<DistrictDto> getAllDistricts() {
        List<District> districts = districtRepository.findAll();
        return districts.stream().map((district) -> DistrictMapper.mapToDistrictDto(district))
                .collect(Collectors.toList());
    }

    @Override
    public DistrictDto updateDistrict(Long districtId, DistrictDto updatedDistrict) {
        District district = districtRepository.findById(districtId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + districtId)
        );

        district.setName(updatedDistrict.getName());
        district.setState(updatedDistrict.getState());

        District updatedDistrictObj = districtRepository.save(district);
        return DistrictMapper.mapToDistrictDto(updatedDistrictObj);
    }

    @Override
    public void deleteDistrict(Long districtId) {
        District district = districtRepository.findById(districtId).orElseThrow(
                () -> new ResourceNotFoundException("User does not exist with given id: " + districtId)
        );
        districtRepository.deleteById(districtId);
    }
}
