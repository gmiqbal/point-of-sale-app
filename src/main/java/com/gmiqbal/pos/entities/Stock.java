package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "manufacturing_date")
    private Date manufacuringDate;
//    @DateTimeFormat(pattern = "dd/MM/yyyy")

    @Column(name="expiration_date")
    private Date expirationDate;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Column(name = "sale_price")
    private Double salePrice;
//
//    @ManyToOne
//    @Column(name = )
//    private Product product;

//    toString
}
