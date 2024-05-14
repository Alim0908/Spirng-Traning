package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    //display all the regions in canada
    List<Region> findByCountry(String country);

    List<Region> getByCountry(String country);

    //display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainsOrderByRegionDesc(String country);

//Display top 2 regions in United States
List<Region> findTopByCountry(String country);
List<Region> findTop2ByCountry(String country);

}
