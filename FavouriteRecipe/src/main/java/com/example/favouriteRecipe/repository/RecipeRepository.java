package com.example.favouriteRecipe.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.favouriteRecipe.model.Recipe;


public interface RecipeRepository extends MongoRepository<Recipe, Long> {

}