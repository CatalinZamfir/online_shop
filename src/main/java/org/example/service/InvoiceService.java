package org.example.service;

import org.example.entity.Invoices;
import org.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceService {
        @Autowired
        public Repository repository;

        public Invoices saveInvoice (Invoices invoices){
            return repository.save(invoices);
        }

}
