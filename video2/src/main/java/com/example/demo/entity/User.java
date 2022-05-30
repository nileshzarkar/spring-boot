package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
// IF YOU DO NOT PROVIDE THIS ANNOTATION THE TABLE NAME WOULD BE THE CLASS NAME
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    // IF YOU DO NOT PROVIDE THIS ANNOTATION THE COLUMN NAME WOULD BE THE FIELD NAME
    private String lastName;
    @Column(name = "name")
    private String email;

}
