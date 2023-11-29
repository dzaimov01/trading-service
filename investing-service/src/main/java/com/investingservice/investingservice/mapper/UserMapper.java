package com.investingservice.investingservice.mapper;

import com.investingservice.investingservice.models.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    com.investingservice.investingservice.models.service.User userToUser(User user);
}
