//package com.gmiqbal.pos.entities;
//
//import com.gmiqbal.pos.constants.BrandNames;
//import com.gmiqbal.pos.constants.CategoryType;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Date;
//
//@Entity
//@Data
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name="email")
//    private String email;
//
//    @Column(name="address")
//    private  String address;
//
//    @Column(name="phone")
//    private  String phone;
//
//    @Column(name = "is_deleted")
//    private boolean isDeleted;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="created_at")
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name="modified_at")
//    private Date modifiedAt;
//
//    @PrePersist
//    protected void onCreate(){
//        createdAt = new Date();
//        modifiedAt = new Date();
//    }
//
//    @PreUpdate
//    protected void onUpdate(){
//        modifiedAt = new Date();
//    }
//}
//}
