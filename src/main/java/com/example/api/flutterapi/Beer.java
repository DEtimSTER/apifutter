package com.example.api.flutterapi;

import jakarta.persistence.*;

@Entity
@Table(name = "beers")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private float abv;

    public Beer() {}

    public Beer(String name, float abv) {
        this.name = name;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }
}
