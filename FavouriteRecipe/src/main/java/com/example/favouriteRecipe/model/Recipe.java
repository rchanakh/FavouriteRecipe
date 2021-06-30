package com.example.favouriteRecipe.model;

import java.util.Date;
import java.util.List;

public class Recipe {

	private long id;

	private String name;

	private Date date;

	private boolean veg;

	private int suitable;

	private List<Ingredients> ingredients;

	private String instructions;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getSuitable() {
		return suitable;
	}

	public void setSuitable(int suitable) {
		this.suitable = suitable;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Recipe(long id, String name, Date date, boolean veg, int suitable, List<Ingredients> ingredients,
			String instructions) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.veg = veg;
		this.suitable = suitable;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", date=" + date + ", veg=" + veg + ", suitable=" + suitable
				+ ", ingredients=" + ingredients + ", instructions=" + instructions + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Recipe() {

	}

}