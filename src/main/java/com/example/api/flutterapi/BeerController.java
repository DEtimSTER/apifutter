package com.example.api.flutterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beers")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<Beer> getAllBeers() {
        return beerService.getAllBeers();
    }

    @GetMapping("/{id}")
    public Optional<Beer> getBeerById(@PathVariable int id) {
        return beerService.getBeerById(id);
    }

    @PostMapping
    public Beer addBeer(@RequestBody Beer beer) {
        return beerService.addBeer(beer);
    }

    @GetMapping("/search")
    public List<Beer> searchBeers(@RequestParam String name) {
        return beerService.searchBeersByName(name);
    }
}
