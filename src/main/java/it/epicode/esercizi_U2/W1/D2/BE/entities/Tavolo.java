package it.epicode.esercizi_U2.W1.D2.BE.entities;

import it.epicode.esercizi_U2.W1.D2.BE.entities.enums.StatoTavoloEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    @Column(name = "numero_coperti_max", nullable = false)
    private int numeroCopertiMax;

    @Column(name = "stato_tavolo", nullable = false)
    private StatoTavoloEnum statoTavolo;

    @OneToOne
    private Ordine ordine;
}
