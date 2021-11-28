//package com.henrietha.basic.repository.implementation;
//
//import com.henrietha.basic.entities.Quote;
//import com.henrietha.basic.repository.interfac.QuoteRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class QuoteRepositoryImpl implements QuoteRepository {
//
//    private QuoteRepository quoteRepository;
//
//    private static final Logger logger = LoggerFactory.getLogger(QuoteRepositoryImpl.class);
//
//    @Override
//    public Quote saveQuote(Quote request) throws Exception {
//        Quote quote = new Quote();
//        quote.setAuthor(request.getAuthor());
//        quote.setText(request.getText());
//        Quote save = quoteRepository.saveQuote(quote);
//        request.setId(save.getId());
//        return request;
//    }
//
//    @Override
//    public Quote updateQuote(Quote quote) throws Exception {
//        return null;
//    }
//
//    @Override
//    public Optional<List<Quote>> getAllQuote(Quote quote) throws Exception {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Quote> getQuoteById(int id) throws Exception {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Quote> deleteQuote(int id) throws Exception {
//        return Optional.empty();
//    }
//}
