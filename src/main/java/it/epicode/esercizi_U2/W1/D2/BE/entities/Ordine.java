package it.epicode.esercizi_U2.W1.D2.BE.entities;

import it.epicode.esercizi_U2.W1.D2.BE.entities.enums.StatoOrdineEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "stato_ordine", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoOrdineEnum statoOrdine;

    @Column(name = "numero_coperti")
    private int numeroCoperti;

    @Column(name = "ora_aquisizione", nullable = false)
    private LocalTime oraAcquisizione;

    @Column(name = "importo_totale")
    private double importoTotale;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
