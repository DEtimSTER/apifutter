package com.example.api.flutterapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;


    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping
    public Page<Transaction> getAllTransactions(Pageable pageable) {
        // De 'pageable' parameter wordt automatisch gevuld door Spring
        return transactionService.getAllPages(pageable);
    }

    @CrossOrigin(origins = "http://localhost:5000")
    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }
    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping("/recent")
    public List<Transaction> findAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
