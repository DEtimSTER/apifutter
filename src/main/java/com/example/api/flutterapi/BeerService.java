package com.example.api.flutterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    public Optional<Beer> getBeerById(int id) {
        return beerRepository.findById(id);
    }

    public Beer addBeer(Beer beer) {
        return beerRepository.save(beer);
    }

    public List<Beer> searchBeersByName(String name) {
        return beerRepository.findByNameContainingIgnoreCase(name);
    }
}
