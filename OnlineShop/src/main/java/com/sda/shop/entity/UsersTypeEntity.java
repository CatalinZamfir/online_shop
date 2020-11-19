package com.sda.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_types")
public class UsersTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usersTypeId;
    private String description;

    public Integer getUsersTypeId() {
        return usersTypeId;
    }

    public void setUsersTypeId(Integer usersTypeId) {
        this.usersTypeId = usersTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
