package it.epicode.esercizi_U2.W1.D2.BE.repository;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Ordine,Long> {
}
