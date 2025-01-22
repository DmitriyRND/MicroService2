package org.example.geoservice.client;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.geoservice.dto.GeoResponseDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class GeoRestTemplateClient {

    private final RestTemplate restTemplate;

    private String geoApi = "https://api.sypexgeo.net/json/";


    public GeoResponseDto getGeoInfo(String ipAddress) {
        return restTemplate.getForObject(geoApi + ipAddress, GeoResponseDto.class);
    }


}
