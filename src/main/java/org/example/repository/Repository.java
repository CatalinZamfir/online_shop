package org.example.repository;

import org.example.App;
import org.example.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Invoices, Integer> {


}
