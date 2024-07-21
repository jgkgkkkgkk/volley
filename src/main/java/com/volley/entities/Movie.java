package com.volley.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "movie")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "time", nullable = false)
    private String time;
    @Column(name="genre",nullable = false)
    private String genre;
    @Column(name="assessment",nullable = false)
    private int assessment;
    @Column(name="actors",nullable = false)
    private String actors;




}
