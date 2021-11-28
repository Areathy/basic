package com.henrietha.basic.repository.interfac;

import com.henrietha.basic.entities.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {
}

