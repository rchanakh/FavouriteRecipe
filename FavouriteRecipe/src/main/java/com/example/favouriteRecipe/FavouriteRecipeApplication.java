package com.example.favouriteRecipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.favouriteRecipe" })
@EnableMongoRepositories(basePackages = { "com.example.favouriteRecipe" })
public class FavouriteRecipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavouriteRecipeApplication.class, args);
	}

}
