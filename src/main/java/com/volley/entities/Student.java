package com.volley.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "age", nullable = false)
    private String age;
    @Column(name = "weight", nullable = false)
    private String weight;
    @Column(name = "height", nullable = false)
    private int height;
    @Column(name="composition",nullable = false)
    private String composition;
    @Column(name="email",nullable = false,unique = true)
    private String email;

}
