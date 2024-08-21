package com.volley.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "age", nullable = false)
    private String age;
    @Column(name = "height", nullable = false)
    private int height;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false, insertable = false, updatable = false)
    private Team team;
}
