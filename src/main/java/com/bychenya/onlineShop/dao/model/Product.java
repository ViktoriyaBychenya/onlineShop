package com.bychenya.onlineShop.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity{

    @Column(name = "name_product", nullable = false)  // по умолчанию имя столбца, можно не указывать
    private String name_product;

    @Column(name = "description")
    private String description;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "price", precision = 7, scale = 2)
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<Cart> carts;

    @OneToMany(mappedBy = "productOfOrder")
    private List<Orders> orders;

}
