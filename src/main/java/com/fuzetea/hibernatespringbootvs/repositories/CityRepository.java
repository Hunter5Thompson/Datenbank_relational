package com.fuzetea.hibernatespringbootvs.repositories;

import com.fuzetea.hibernatespringbootvs.entities.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findByCityName(String cityName);
    
}
