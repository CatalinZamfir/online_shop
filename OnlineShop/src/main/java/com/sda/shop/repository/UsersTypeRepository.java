package com.sda.shop.repository;

import com.sda.shop.entity.UsersTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersTypeRepository extends JpaRepository<UsersTypeEntity, Integer> {
}
