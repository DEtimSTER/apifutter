package com.example.api.flutterapi;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private String recipetitel;
    private String category;
	private String image_url;

    public Recipe() {}

    public Recipe(String description, String recipetitel, String category, String image_url, String recipe) {
        this.description = description;
        this.recipetitel = recipetitel;
        this.category = category;
		this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

	public String getRecipetitel() {
		return recipetitel;
	}

	public void setRecipetitel(String recipetitel) {
		this.recipetitel = recipetitel;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
}
