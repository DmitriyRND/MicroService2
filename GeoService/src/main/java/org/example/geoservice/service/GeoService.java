package org.example.geoservice.service;

import org.example.geoservice.client.GeoRestTemplateClient;
import org.example.geoservice.dto.GeoResponseDto;
import org.springframework.stereotype.Service;

@Service
public class GeoService {

    private GeoRestTemplateClient geoRestTemplateClient;

    public String getCityByIp(String ipAddress) {

        GeoResponseDto response = geoRestTemplateClient.getGeoInfo(ipAddress);
        return response != null ? response.getCity().getName_ru() : null;


    }

}
