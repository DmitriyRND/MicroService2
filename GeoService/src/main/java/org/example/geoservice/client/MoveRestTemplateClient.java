package org.example.geoservice.client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class MoveRestTemplateClient {
    private RestTemplate restTemplate;

    public void sendCityToAnotherService(String city) {
        String anotherServiceUrl = "http://localhost:8081/api/cities";
        restTemplate.getForObject(anotherServiceUrl+ "?city=" + city, Void.class);
    }
}
