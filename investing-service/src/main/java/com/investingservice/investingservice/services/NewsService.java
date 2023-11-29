package com.investingservice.investingservice.services;

import com.investingservice.investingservice.mapper.NewsMapper;
import com.investingservice.investingservice.mapper.StockMapper;
import com.investingservice.investingservice.mapper.UserMapper;
import com.investingservice.investingservice.models.entity.News;
import com.investingservice.investingservice.models.entity.Stock;
import com.investingservice.investingservice.repositories.NewsRepository;
import com.investingservice.investingservice.repositories.StockRepository;
import com.investingservice.investingservice.repositories.UserRepository;

import java.util.Optional;
import java.util.UUID;

public class NewsService {
    private final NewsMapper newsMapper;
    private final NewsRepository repository;

    public NewsService(NewsRepository newsRepository, NewsMapper newsMapper) {
        this.repository = newsRepository;
        this.newsMapper = newsMapper;
    }

    public com.investingservice.investingservice.models.service.News getNews(String id) {
        UUID uuid = UUID.fromString(id);
        Optional<News> stockById = this.repository.findById(uuid);
        return stockById.map(this.newsMapper::newsToNews).orElse(null);
    }

    public News saveStock(UUID newsId, News news) {
        Optional<News> newsOptional = this.repository.findById(newsId);
        return newsOptional.orElseGet(() -> this.repository.save(news));
    }
}
