package com.bychenya.onlineShop.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "surname", nullable = false, length = 45)
    private String surname;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "telefon", nullable = false, length = 13)
    private String telefon;

    @Column(name = "login", nullable = false, length = 20)
    private String login;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Cart> carts;

    @OneToOne(mappedBy = "userBlackList")
    private BlackList blackList;

    @OneToMany(mappedBy = "userOrder")
    private List<Orders> orders;

    @OneToMany(mappedBy = "userSale")
    private List<Sales> sales;

}