package com.gmiqbal.pos.entities;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
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

    @Enumerated(EnumType.STRING)
    @Column (name="brand")
    private BrandNames brand;

    @Column(name="details")
    private String details;

    @Column(name="barcode")
    @NotNull(message = "Barcode can not be null")
    @NotEmpty(message = "Barcode can not be empty")
    private String bracode;

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
