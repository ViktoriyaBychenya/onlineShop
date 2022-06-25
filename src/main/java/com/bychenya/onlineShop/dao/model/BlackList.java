package com.bychenya.onlineShop.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "black_list")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlackList extends BaseEntity{

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user_black_list", referencedColumnName = "id")
    private User userBlackList;

    @Column(name = "debt", precision = 7, scale = 2)
    private Double debt;
}