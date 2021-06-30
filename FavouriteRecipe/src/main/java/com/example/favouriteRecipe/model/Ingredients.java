package com.example.favouriteRecipe.model;

public class Ingredients {

	private String name;

	public Ingredients() {
	}

	public Ingredients(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ingredients [name=" + name + "]";
	}

}
