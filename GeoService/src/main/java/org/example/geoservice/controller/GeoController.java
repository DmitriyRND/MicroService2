package org.example.geoservice.controller;

import lombok.AllArgsConstructor;
import org.example.geoservice.client.GeoRestTemplateClient;
import org.example.geoservice.dto.GeoResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GeoController {
        private GeoRestTemplateClient geoRestTemplateClient;

    @GetMapping("/geo")
    public GeoResponseDto getGeoLocation(@RequestParam String ip) {
            return geoRestTemplateClient.getGeoInfo(ip);

    }

}
