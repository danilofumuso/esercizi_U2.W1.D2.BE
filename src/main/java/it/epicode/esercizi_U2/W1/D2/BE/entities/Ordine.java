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
    private  Long id;

    @Column(name="numero_ordine")
    private Long numeroOrdine;

    @Column(name = "stato_ordine", nullable = false)
    private StatoOrdineEnum statoOrdine;

    @Column(name = "numero_coperti")
    private int numeroCoperti;

    @Column(name = "ora_aquisizione", nullable = false)
    private LocalTime oraAcquisizione;

    @Column(name = "importo_totale")
    private double importoTotale;

    @ManyToMany
    private List<Menu> menu=new ArrayList<>();
}
