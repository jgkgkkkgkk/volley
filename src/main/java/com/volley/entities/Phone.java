package com.volley.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "phone")

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="model",nullable = false)
    private String model;
    @Column(name="number",nullable = false)
    private String number;
    @Column(name="characteristics",nullable = false)
    private String characteristics;
    @Column(name="color",nullable = false)
    private String color;
}
