package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class InvoiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_id")
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "discount_amount")
    private BigDecimal discount_amount;

    @Column(name = "product_rate")
    private BigDecimal product_rate;

    @Column(name="product_quantity")
    private int productQuantity;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "note")
    private String note;

    //fk_invoice_id


}