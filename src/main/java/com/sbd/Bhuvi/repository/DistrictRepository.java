package com.sbd.Bhuvi.repository;

import com.sbd.Bhuvi.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {
}
