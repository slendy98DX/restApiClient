package co.develhope.restApiClient.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OptimizedDrinkDTO {

    private long idDrink;
    private String strDrink;
    private String strDrinkAlternate;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcoholic;
    private String strGlass;
    private String strDrinkThumb;
    private Map<String,String> instructions;
    private List<IngredientAndMeasure> strIngredients;
    private String strImageSource;
    private String strImageAttribution;
    private String strCreativeCommonsConfirmed;
    private String dateModified;
}
