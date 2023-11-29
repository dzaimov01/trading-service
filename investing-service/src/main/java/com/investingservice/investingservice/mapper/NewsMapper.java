package com.investingservice.investingservice.mapper;

import com.investingservice.investingservice.models.entity.News;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    com.investingservice.investingservice.models.service.News newsToNews(News news);
}
