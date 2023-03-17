package co.develhope.restApiClient.dto;

import lombok.Data;

import java.util.List;

@Data
public class FilterDrinksPayloadDTO {

    private List<FilterDrinksDTO> drinks;
}
