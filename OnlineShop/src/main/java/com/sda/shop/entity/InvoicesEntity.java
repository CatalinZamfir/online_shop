package com.sda.shop.entity;

import javax.persistence.*;

@Entity
@Table (name="invoices")
public class InvoicesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

}
