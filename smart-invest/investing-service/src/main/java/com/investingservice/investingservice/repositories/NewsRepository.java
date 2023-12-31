package com.investingservice.investingservice.repositories;

import com.investingservice.investingservice.models.entity.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NewsRepository extends CrudRepository<News, UUID> {
}
