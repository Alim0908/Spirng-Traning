package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {
    //display all the regions in canada
    List<Region> findByCountry(String country);

//display all regions with country name includes 'United'



}
