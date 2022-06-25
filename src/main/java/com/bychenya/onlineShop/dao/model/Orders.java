package com.bychenya.onlineShop.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders extends BaseEntity{

    @Column(name = "status", nullable = false, length = 45)
    private String status;

    @Column(name = "quantity", precision = 7, scale = 2)
    private Double quantity;

    @Column(name = "date_order", nullable = false)
    private Date dateOrder;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user_order", referencedColumnName = "id")
    private User userOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_product_order", referencedColumnName = "id")
    private Product productOfOrder;

    @OneToOne(mappedBy = "orderSale")
    private Sales sale;
}