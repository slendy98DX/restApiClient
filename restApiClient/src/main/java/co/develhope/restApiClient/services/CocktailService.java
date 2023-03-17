package co.develhope.restApiClient.services;

import co.develhope.restApiClient.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CocktailService {

    public static OptimizedDrinkDTO mapDrink(SingleDrinkDTO singleDrink){
        if(singleDrink == null){
            return null;
        }
        OptimizedDrinkDTO optimized = new OptimizedDrinkDTO();
        optimized.setIdDrink(singleDrink.getIdDrink());
        optimized.setStrDrink(singleDrink.getStrDrink());
        optimized.setStrDrinkAlternate(singleDrink.getStrDrinkAlternate());
        optimized.setStrVideo(singleDrink.getStrVideo());
        optimized.setStrCategory(singleDrink.getStrCategory());
        optimized.setStrIBA(singleDrink.getStrIBA());
        optimized.setStrAlcoholic(singleDrink.getStrAlcoholic());
        optimized.setStrGlass(singleDrink.getStrGlass());
        optimized.setStrDrinkThumb(singleDrink.getStrDrinkThumb());
        optimized.setStrImageSource(singleDrink.getStrImageSource());
        optimized.setStrImageAttribution(singleDrink.getStrImageAttribution());
        optimized.setStrCreativeCommonsConfirmed(singleDrink.getStrCreativeCommonsConfirmed());
        optimized.setDateModified(singleDrink.getDateModified());
        Map<String, String> instructions = new HashMap<>();
        List<IngredientAndMeasure> ingredientAndMeasures = new ArrayList<>();
        if (singleDrink.getStrInstructions() != null) {
            instructions.put("EN", singleDrink.getStrInstructions());
        }

        if (singleDrink.getStrInstructionsDE() != null) {
            instructions.put("DE", singleDrink.getStrInstructionsDE());
        }

        if (singleDrink.getStrInstructionsES() != null) {
            instructions.put("ES", singleDrink.getStrInstructionsES());
        }

        if (singleDrink.getStrInstructionsZH() != null) {
            instructions.put("ZH", singleDrink.getStrInstructionsZH());
        }

        if (singleDrink.getStrInstructionsIT() != null) {
            instructions.put("IT", singleDrink.getStrInstructionsIT());
        }

        if (singleDrink.getStrInstructionsFR() != null) {
            instructions.put("FR", singleDrink.getStrInstructionsFR());
        }
        if (singleDrink.getStrIngredient1() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient1(),singleDrink.getStrMeasure1()));
        }
        if (singleDrink.getStrIngredient2() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient2(),singleDrink.getStrMeasure2()));
        }
        if (singleDrink.getStrIngredient3() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient3(),singleDrink.getStrMeasure3()));
        }
        if (singleDrink.getStrIngredient4() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient4(),singleDrink.getStrMeasure4()));
        }
        if (singleDrink.getStrIngredient5() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient5(),singleDrink.getStrMeasure5()));
        }
        if (singleDrink.getStrIngredient6() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient6(),singleDrink.getStrMeasure6()));
        }
        if (singleDrink.getStrIngredient7() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient7(),singleDrink.getStrMeasure7()));
        }
        if (singleDrink.getStrIngredient8() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient8(),singleDrink.getStrMeasure8()));
        }
        if (singleDrink.getStrIngredient9() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient9(),singleDrink.getStrMeasure9()));
        }
        if (singleDrink.getStrIngredient10() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient10(),singleDrink.getStrMeasure10()));
        }
        if (singleDrink.getStrIngredient11() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient11(),singleDrink.getStrMeasure11()));
        }
        if (singleDrink.getStrIngredient12() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient12(),singleDrink.getStrMeasure12()));
        }
        if (singleDrink.getStrIngredient13() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient13(),singleDrink.getStrMeasure13()));
        }
        if (singleDrink.getStrIngredient14() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient14(),singleDrink.getStrMeasure14()));
        }
        if (singleDrink.getStrIngredient15() != null) {
            ingredientAndMeasures.add(new IngredientAndMeasure(singleDrink.getStrIngredient15(),singleDrink.getStrMeasure15()));
        }
        optimized.setStrIngredients(ingredientAndMeasures);
        optimized.setInstructions(instructions);
        return optimized;
    }

    private List<OptimizedDrinkDTO> getDetailedDrink(List<FilterDrinksDTO> drinksOld){
        int size = drinksOld.size();
        List<OptimizedDrinkDTO> output = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Working on cocktails: " + drinksOld.get(i).getIdDrink() + " - " + i + "/"+size);
            OptimizedDrinkDTO newDrink = getSingle(Long.parseLong(drinksOld.get(i).getIdDrink()));
            output.add(newDrink);
        }
        System.out.println("Finished");
        return output;
    }

    public List<OptimizedDrinkDTO> getByType() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response = template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita", DrinksDTO.class);
        List<SingleDrinkDTO> dto = response.getBody().getDrinks();
        List<OptimizedDrinkDTO> output = new ArrayList<>(dto.size());
        for (int i = 0; i < dto.size(); i++) {
            output.add(mapDrink(dto.get(i)));
        }
        return output;
    }

    public OptimizedDrinkDTO getSingle(Long drinkId){
        RestTemplate template = new RestTemplate();
        ResponseEntity<DrinksDTO> response = template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+drinkId, DrinksDTO.class);
        SingleDrinkDTO oldSingleDrink = response.getBody().getDrinks().get(0);
        return mapDrink(oldSingleDrink);
    }

    public List<OptimizedDrinkDTO> getBy(String value, String key){
        RestTemplate template = new RestTemplate();
        ResponseEntity<FilterDrinksPayloadDTO> response = template.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/filter.php?"+key+"="+value, FilterDrinksPayloadDTO.class);
        return getDetailedDrink(response.getBody().getDrinks());
    }

    public List<OptimizedDrinkDTO> getAlcoholic(boolean isAlcoholic){
        return getBy(isAlcoholic ? "Alcoholic" : "Non_Alcoholic","a");
    }

    public List<OptimizedDrinkDTO> getByCategory(String category){
        return getBy(category,"c");
    }

    public List<OptimizedDrinkDTO> getByGlass(String glass){
        return getBy(glass,"g");
    }
}
