package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.grammars.ordering.OrderingParser;

@Entity
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="quantity")
    private int quantity;


    private Product product;
}
