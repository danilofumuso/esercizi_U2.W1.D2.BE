package it.epicode.esercizi_U2.W1.D2.BE.repository;

import it.epicode.esercizi_U2.W1.D2.BE.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuItem,Long> {

}
