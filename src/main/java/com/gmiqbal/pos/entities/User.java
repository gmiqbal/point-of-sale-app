package com.gmiqbal.pos.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

//@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    @NotEmpty(message = "*Please provide your name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "*Please provide your last name")
    private String lastName;

    @Column(name="username")
    private String username;

    @Column(name= "email", unique = true)
    @Email(message = "*Please, provide a vaild email.")
    @NotNull(message = "*Please, provide an email")
    private String email;

    @Column(name = "password")
    @Length(min =6, message = "*Your password must have at least 6 characters")
    @NotEmpty(message = "*Please provide your password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Invoice> invoice;

//    private int active;

//    @ManyToMany(cascade = CascadeType.ALL)
//    private List<UserRole> roles;

//    @Override
//    public String toString(){
//        return "User{" +
//                "id=" + id +
//                ", email=" + email +
//                ", password=" + password +
//                ", firstName=" + firstName +
//                ", lastName=" + lastName +
//                ", acrive=" + active;
//    }
}
