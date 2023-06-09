package com.example.technozure.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
// Speaker.java
@Entity
@Table(name = "SPEAKERS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String bio;

    @Column(nullable = false)
    private String employeeId;

    // Constructors, getters and setters
}