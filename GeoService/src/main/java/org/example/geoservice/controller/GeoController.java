package org.example.geoservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.geoservice.client.GeoRestTemplateClient;
import org.example.geoservice.client.MoveRestTemplateClient;
import org.example.geoservice.client.UserCityProcessor;
import org.example.geoservice.dto.GeoResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class GeoController {
        private GeoRestTemplateClient geoRestTemplateClient;
        private UserCityProcessor userCityProcessor;
        private MoveRestTemplateClient moveRestTemplateClient;

//    @GetMapping("/geo")
//    public GeoResponseDto getGeoLocation(@RequestParam String ip) {
//            return geoRestTemplateClient.getGeoInfo(ip);
//
//    }

    @GetMapping ("/process-city")
    public ResponseEntity<String> processCity(@RequestParam String ip){
        try {
            GeoResponseDto geoInfo = geoRestTemplateClient.getGeoInfo(ip);
            log.info("первый запрос ");
            moveRestTemplateClient.sendCityToAnotherService(geoInfo.getCity().getName_ru());
            log.info("второй запрос ");
            return ResponseEntity.ok("City processed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
