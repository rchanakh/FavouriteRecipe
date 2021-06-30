package com.example.favouriteRecipe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.favouriteRecipe.controller.RecipeController;
import com.example.favouriteRecipe.model.Recipe;

@SpringBootTest
class FavouriteRecipeApplicationTests {

	@InjectMocks
	private RecipeController controller; 
	

	@Test
	public void getAllRecipe()
	{
		List<Recipe> allrecipe = new ArrayList<>();
		Recipe recipe = new Recipe();
		recipe.setId(100);
		recipe.setInstructions("SWeet dish");
		recipe.setName("paav Bhaji");
		allrecipe.add(recipe);
		
	}
	
	@Test
	public void getAllRecipe1()
	{
		List<Recipe> allrecipe = new ArrayList<>();
		Recipe recipe = new Recipe();
		recipe.setId(100000);
		recipe.setInstructions("It should be tasty");
		allrecipe.add(recipe);
	}
	
	@Test
	public void getAllRecipe2()
	{
		Date date = new Date();
		List<Recipe> allrecipe = new ArrayList<>();
		Recipe recipe = new Recipe();
		recipe.setDate(date);
		allrecipe.add(recipe);
	}
}
