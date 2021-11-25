package com.henrietha.basic.repository.implementation;

import com.henrietha.basic.entities.Quote;
import com.henrietha.basic.repository.interfac.QuoteRepository;

import java.util.List;
import java.util.Optional;

public class QuoteRepositoryImpl implements QuoteRepository {
    @Override
    public String saveQuote(Quote quote) throws Exception {
        return null;
    }

    @Override
    public String updateQuote(Quote quote) throws Exception {
        return null;
    }

    @Override
    public Optional<List<Quote>> getAllQuote(Quote quote) throws Exception {
        return Optional.empty();
    }

    @Override
    public Optional<Quote> getQuoteById(String Quote) throws Exception {
        return Optional.empty();
    }

    @Override
    public Optional<Quote> deleteQuote(long id) throws Exception {
        return Optional.empty();
    }
}
