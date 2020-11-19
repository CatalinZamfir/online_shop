package com.sda.shop.repository;

import com.sda.shop.entity.UsersTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UsersTypeEntity, Integer> {
}
