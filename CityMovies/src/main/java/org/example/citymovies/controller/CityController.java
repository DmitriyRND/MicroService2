package org.example.citymovies.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.example.citymovies.service.CityService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cities")
@AllArgsConstructor
@Slf4j
public class CityController {
    //private CityService cityService;
    @GetMapping()
    public void receiveCity(@RequestParam String city) {

        log.info(city);
//        System.out.println("Received city: " + city);
//        System.out.println("Received city: ");
//
//
//        // Выполнить дополнительные действия (сохранение, обработка и т. д.)
//        return ResponseEntity.ok("City " + city + " received successfully");

//        System.out.println("Received city: " + cityRequest.getCityName());
//
//
//         Logger logger = LoggerFactory.getLogger(CityController.class);
//         logger.info("Received city: {}", cityRequest.getCityName());
//
//        return ResponseEntity.ok("City " + cityRequest.getCityName() + " received successfully");


    }


}
