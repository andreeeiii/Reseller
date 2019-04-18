package com.reseller.shop.service;

import com.reseller.shop.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserService extends CrudRepository<UserEntity, Integer> {
}
