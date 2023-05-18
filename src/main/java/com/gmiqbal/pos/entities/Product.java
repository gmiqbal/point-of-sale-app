package com.gmiqbal.pos.entities;

import com.gmiqbal.pos.constants.BrandNames;
import com.gmiqbal.pos.constants.CategoryType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name="code")
    private  int code;

    @Column(name="price")
    private int price;

    @Column(name="category")
    private CategoryType category;

    @Column (name="brand")
    private BrandNames brand;

    @Column(name="details")
    private String details;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modified_at")
    private Date modifiedAt;
}
