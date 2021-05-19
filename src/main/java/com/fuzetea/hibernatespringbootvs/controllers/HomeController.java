package com.fuzetea.hibernatespringbootvs.controllers;

import java.util.List;

import com.fuzetea.hibernatespringbootvs.Pojos.CityRequest;
import com.fuzetea.hibernatespringbootvs.entities.City;
import com.fuzetea.hibernatespringbootvs.services.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    CityService cityService;

    @GetMapping("home")
    public String sayHello(){
        return "Hello world";
    }


    @GetMapping("getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }
    
    @PostMapping("addcity")
    public City SaveCity(@RequestBody City city){

        return cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getCity(String cityName){
        return cityService.getCity(cityName);
    }

    @PostMapping("savecity")
    public City addCity(@RequestBody CityRequest cityrequest){
        return cityService.addCity(cityrequest);
    }
}
