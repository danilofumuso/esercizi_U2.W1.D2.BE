package it.epicode.esercizi_U2.W1.D2.BE.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Alimenti {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int calorie;

    @Column(nullable = false)
    private double prezzo;
}
