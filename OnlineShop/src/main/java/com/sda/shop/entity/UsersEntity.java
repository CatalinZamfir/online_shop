package com.sda.shop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="users_app")
public class UsersEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer userId;
    @OneToOne
    @JoinColumn(name = "usersTypeId")
    private UsersTypeEntity usersType;
    private String name;
    private String userName;
    private String password;
    private Date dateOfBirth;
    private String address;
    private Boolean enabled;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UsersTypeEntity getUsersType() {
        return usersType;
    }

    public void setUsersType(UsersTypeEntity usersType) {
        this.usersType = usersType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isEnable() {
        return enabled;
    }

    public void setEnable(boolean enable) {
        this.enabled = enabled;
    }
}
