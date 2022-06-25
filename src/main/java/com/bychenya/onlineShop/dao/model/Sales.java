package com.bychenya.onlineShop.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sales")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sales extends BaseEntity{

    @Convert(disableConversion = true)
    @Column(name = "date_of_payment", nullable = false)
    private LocalDate dateOfPayment;

    @Column(name = "summa", nullable = false)
    private Double summa;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_order_sales", nullable = false)
    private Orders orderSale;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user_sales", nullable = false)
    private User userSale;

}