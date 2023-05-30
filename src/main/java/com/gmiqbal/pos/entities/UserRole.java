package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "role")
    private String role;

    @Override
    public String toString(){
        return "Role{" +
                "id=" + id +
                ", role='"+ role+
                "'}";
    }
}
