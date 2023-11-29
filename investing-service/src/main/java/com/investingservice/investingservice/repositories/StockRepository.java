package com.investingservice.investingservice.repositories;

import com.investingservice.investingservice.models.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StockRepository extends CrudRepository<Stock, UUID> {
    Optional<Stock> findBySymbol(String symbol);
}
