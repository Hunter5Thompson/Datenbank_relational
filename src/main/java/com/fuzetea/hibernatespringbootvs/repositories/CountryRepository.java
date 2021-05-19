package com.fuzetea.hibernatespringbootvs.repositories;

import com.fuzetea.hibernatespringbootvs.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    Country findById(int id);
}
