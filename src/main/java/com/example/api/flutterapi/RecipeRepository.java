package com.example.api.flutterapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    // Paginated transactions using Pageable
    //Page<Transaction> findAll(Pageable pageable);

    // If you need all transactions without pagination (use with caution)
    List<Recipe> findAll();
}

