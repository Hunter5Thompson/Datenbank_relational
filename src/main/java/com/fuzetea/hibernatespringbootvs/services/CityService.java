package com.fuzetea.hibernatespringbootvs.services;

import java.util.List;

import com.fuzetea.hibernatespringbootvs.entities.City;
import com.fuzetea.hibernatespringbootvs.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired CityRepository cityresRepository;
    

    public CityService() {

    }

    public List<City> getCities() {
        return cityresRepository.findAll();
        
    }

    public City saveCity(City city) {

        return cityresRepository.save(city);
    }

    public City getCity(String cityName) {
        return cityresRepository.findByCityName(cityName);
    }
}
