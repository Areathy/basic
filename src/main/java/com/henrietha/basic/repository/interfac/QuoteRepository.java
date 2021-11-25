package com.henrietha.basic.repository.interfac;

import com.henrietha.basic.entities.Quote;

import java.util.List;
import java.util.Optional;

public interface QuoteRepository {
    String saveQuote(Quote quote) throws Exception;
    String updateQuote(Quote quote) throws Exception;
    Optional<List<Quote>> getAllQuote(Quote quote) throws Exception;
    Optional<Quote> getQuoteById(String Quote) throws Exception;
    Optional<Quote> deleteQuote(long id) throws Exception;
}
