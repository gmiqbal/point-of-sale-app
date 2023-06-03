package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "invoice_number")
    private int invoiceNumber;

    @Column(name = "invoice_date")
    private Date invoiceDate;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "seller_id")
    private int sellerId;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "note")
    private String note;


}
