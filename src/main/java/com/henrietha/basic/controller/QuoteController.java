package com.henrietha.basic.controller;

import com.henrietha.basic.entities.Quote;
import com.henrietha.basic.exception.QuoteNotFoundException;
import com.henrietha.basic.repository.interfac.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    // get all users
    @GetMapping
    public List<Quote> getAllUsers() {
        return this.quoteRepository.findAll();
    }

    // get user by id
    @GetMapping("/{id}")
    public Quote getUserById(@PathVariable (value = "id") int id) {
        return this.quoteRepository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException("Quote not found with id :" + id));
    }

    // create user
    @PostMapping
    public Quote createUser(@RequestBody Quote quote) {
        return this.quoteRepository.save(quote);
    }

    // update user
    @PutMapping("/{id}")
    public Quote updateUser(@RequestBody Quote quote, @PathVariable ("id") int id) {
        Quote existingQuote = this.quoteRepository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException("Quote not found with id :" + id));
          existingQuote.setAuthor(quote.getAuthor());
          existingQuote.setText(quote.getText());
        return this.quoteRepository.save(existingQuote);
    }

    // delete user by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Quote> deleteUser(@PathVariable ("id") int id){
        Quote existingQuote = this.quoteRepository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException("Quote not found with id :" + id));
        this.quoteRepository.delete(existingQuote);
        return ResponseEntity.ok().build();
    }
}


