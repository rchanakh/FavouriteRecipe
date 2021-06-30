package com.example.favouriteRecipe.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.favouriteRecipe.model.Ingredients;
import com.example.favouriteRecipe.model.Recipe;
//import com.example.favouriteRecipe.repository.IngredientsRepository;
import com.example.favouriteRecipe.repository.RecipeRepository;

@RestController
@RequestMapping("/api")
public class RecipeController {

	@Autowired
	RecipeRepository recipeRepository;


	// to fetch all recipes from database in list 
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes() {
		return (List<Recipe>) recipeRepository.findAll();
	}

	// find recipe by ID
	@GetMapping("/recipes/{id}")
	public Optional<Recipe> getRecipeById(@PathVariable(value = "id") long id) {
		return recipeRepository.findById(id);
	}

	// To create/add new recipe
	@PostMapping(value = "/recipes/create")
	public Recipe postRecipe(@RequestBody Recipe recipe) {
		Date date = new Date();
		Recipe _recipe = recipeRepository.save(new Recipe(recipe.getId(), recipe.getName(), date, recipe.isVeg(), recipe.getSuitable(),
				recipe.getIngredients(), recipe.getInstructions()));
		return _recipe;
	}

	// delete recipe
	@DeleteMapping("/recipes/{id}")
	public ResponseEntity<String> deleteRecipe(@PathVariable("id") long id) {
		recipeRepository.deleteById(id);
		return new ResponseEntity<>("Recipe has been deleted!", HttpStatus.OK);
	}

	// Update recipe
	@PutMapping("/recipes/{id}")
	public ResponseEntity<Recipe> updateRecipe(@PathVariable("id") long id, @RequestBody Recipe recipe) {
		Optional<Recipe> recipeData = recipeRepository.findById(id);

		if (recipeData.isPresent()) {
			Recipe _recipe = recipeData.get();
			_recipe.setName(recipe.getName());
			_recipe.setSuitable(recipe.getSuitable());

			_recipe.setIngredients(recipe.getIngredients());
			_recipe.setInstructions(recipe.getInstructions());
			return new ResponseEntity<>(recipeRepository.save(_recipe), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
