package it.epicode.esercizi_U2.W1.D2.BE.repository;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Alimenti;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {



}
