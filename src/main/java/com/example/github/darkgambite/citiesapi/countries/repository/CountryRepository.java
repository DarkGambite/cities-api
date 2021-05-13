package com.example.github.darkgambite.citiesapi.countries.repository;

import com.example.github.darkgambite.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
