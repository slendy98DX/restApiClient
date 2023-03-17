package co.develhope.restApiClient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientAndMeasure {

    private String ingredients;
    private String measures;
}
