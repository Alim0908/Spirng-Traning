package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CarRepository extends JpaRepository<Car,Long> {// this Generic takes to parameter one is entity we are working with,second is Id




}
