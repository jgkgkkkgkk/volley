package com.volley.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hollyday")
public class Hollyday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first-name", nullable = false)
    private String firstname;

    @Column(name = "last-name", nullable = false)
    private String lastname;
    @Column(name = "height", nullable = false)
    private String height;

    @Column(name = "age", nullable = false)
    private String age;

}

