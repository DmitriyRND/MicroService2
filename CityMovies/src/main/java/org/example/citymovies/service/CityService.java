package org.example.citymovies.service;

import lombok.AllArgsConstructor;


import org.example.citymovies.repository.CityRepository;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class CityService {

    private CityRepository cityRepository;

//    public CityRequestDto addCity(String name) {
//        CityRequestDto city = new CityRequestDto();
//        city.setCityName(name);
//        return cityRepository.save(city);
//    }



}
