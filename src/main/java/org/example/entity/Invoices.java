package org.example.entity;


import javax.persistence.*;

@Entity
@Table
public class Invoices {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private String description;
    private double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
