package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private Date date;

    @Column(name = "total_price")
    private BigDecimal totalPrice;


}
