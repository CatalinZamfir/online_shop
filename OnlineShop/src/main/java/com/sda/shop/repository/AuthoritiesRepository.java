package com.sda.shop.repository;

import com.sda.shop.entity.AuthoritiesEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepository extends JpaRepository<AuthoritiesEntitiy, String> {
}
