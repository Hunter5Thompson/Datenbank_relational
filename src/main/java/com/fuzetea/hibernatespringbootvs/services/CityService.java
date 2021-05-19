package com.fuzetea.hibernatespringbootvs.services;

import java.util.List;

import com.fuzetea.hibernatespringbootvs.Pojos.CityRequest;
import com.fuzetea.hibernatespringbootvs.entities.City;
import com.fuzetea.hibernatespringbootvs.entities.Country;
import com.fuzetea.hibernatespringbootvs.repositories.CityRepository;
import com.fuzetea.hibernatespringbootvs.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired CityRepository cityresRepository;
    @Autowired CountryRepository countryRepository;
    

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

    public City addCity(CityRequest cityrequest){
        Country country = countryRepository.findById(cityrequest.country_id);

        City city = new City();
        city.setCityName(cityrequest.cityName);
        city.setCityCode(cityrequest.cityCode);
        city.setCountry(country);


        return cityresRepository.save(city);
    }
}
