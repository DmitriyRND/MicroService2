package org.example.geoservice.dto;

import lombok.Data;

@Data
public class GeoResponseDto {


    private String ip;
    private CityDto city;
    private CountryDto country;
    private RegionDto region;


}
