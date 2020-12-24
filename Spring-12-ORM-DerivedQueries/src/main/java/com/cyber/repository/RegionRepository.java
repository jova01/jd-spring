package com.cyber.repository;

import com.cyber.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

    List<Region> findRegionByCountry(String country);

    List<Region> findDistinctByCountry(String country);

    List<Region> findRegionByCountryContains(String country);

    List<Region> findRegionByCountryContainsOrderByRegion(String country);

    List<Region> findTop2ByCountry(String country);
}
