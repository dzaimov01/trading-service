package com.investingservice.investingservice.mapper;

import com.investingservice.investingservice.models.entity.Stock;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockMapper {
    com.investingservice.investingservice.models.service.Stock stockToStock(Stock stock);
}
