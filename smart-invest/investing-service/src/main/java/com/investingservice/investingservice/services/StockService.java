package com.investingservice.investingservice.services;

import com.investingservice.investingservice.mapper.StockMapper;
import com.investingservice.investingservice.models.entity.Stock;
import com.investingservice.investingservice.repositories.StockRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class StockService {
    private final StockMapper stockMapper;
    private final StockRepository repository;

    public StockService(StockRepository stockRepository, StockMapper stockMapper) {
        this.repository = stockRepository;
        this.stockMapper = stockMapper;
    }

    public com.investingservice.investingservice.models.service.Stock getStock(String id) {
        UUID uuid = UUID.fromString(id);
        Optional<Stock> stockById = this.repository.findById(uuid);
        return stockById.map(this.stockMapper::stockToStock).orElse(null);
    }

    public Stock saveStock(String stockSymbol, Stock stock) {
        Optional<Stock> stockOptional = this.repository.findBySymbol(stockSymbol);
        return stockOptional.orElseGet(() -> this.repository.save(stock));
    }
}
