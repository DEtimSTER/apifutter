package com.example.api.flutterapi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Integer> {
    List<Beer> findByNameContainingIgnoreCase(String name);
}
