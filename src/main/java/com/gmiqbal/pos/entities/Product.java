package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="code")
    private  String code;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name="details")
    private String details;

    @Column(name="barcode")
//    @NotNull(message = "Barcode can not be null")
//    @NotEmpty(message = "Barcode can not be empty")
    private String barcode;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modified_at")
    private Date modifiedAt;

    @ManyToOne
    @JoinColumn(name = "master_category_id")
    private MasterCategory masterCategory;


//    @ManyToOne
//    private

    @PrePersist
    protected void onCreate(){
        createdAt = new Date();
        modifiedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        modifiedAt = new Date();
    }
}
