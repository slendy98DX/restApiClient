package co.develhope.restApiClient.controllers;

import co.develhope.restApiClient.dto.OptimizedDrinkDTO;
import co.develhope.restApiClient.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/alcoholic")
    public List<OptimizedDrinkDTO> getAlcoholicCocktail(){
        return cocktailService.getAlcoholic(true);
    }

    @GetMapping("/not-alcoholic")
    public List<OptimizedDrinkDTO> getNotAlcoholicCocktail(){
        return cocktailService.getAlcoholic(false);
    }

    @GetMapping("/category-filter")
    public List<OptimizedDrinkDTO> getByCategory(@RequestParam String category){
        return cocktailService.getByCategory(category);
    }

    @GetMapping("/glass-filter")
    public List<OptimizedDrinkDTO> getByGlass(@RequestParam String glass){
        return cocktailService.getByGlass(glass);
    }
}
