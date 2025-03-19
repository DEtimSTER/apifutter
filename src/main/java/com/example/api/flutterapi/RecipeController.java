package com.example.api.flutterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;


    /*@CrossOrigin(origins = "http://localhost:5000")
    @GetMapping
    public Page<Recipe> getAllTransactions(Pageable pageable) {
        // De 'pageable' parameter wordt automatisch gevuld door Spring
        return transactionService.getAllPages(pageable);
    }*/

    @CrossOrigin(origins = "http://localhost:5000")
    @PostMapping
    public Recipe addTransaction(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }
    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping
    public List<Recipe> findAllRecipes() {
        return recipeService.getAllRecipes();
    }
}
