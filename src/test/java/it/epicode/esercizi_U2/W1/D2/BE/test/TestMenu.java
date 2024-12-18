package it.epicode.esercizi_U2.W1.D2.BE.test;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D2.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.OrdineRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestMenu {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private OrdineRepository ordineRepository;

    @Test
    @DisplayName("Test salvataggio menu")
    public void testSaveMenu() {
        Long menuSalvati = menuRepository.count();
        assertEquals(1, menuSalvati);
    }

    @Test
    @DisplayName("Confronto stato Ordini")
    public void testOrdini() {
        Ordine ordine = ordineRepository.findById(1L).orElse(null);
        Ordine ordine2 = ordineRepository.findById(2L).orElse(null);
        assertFalse(ordine.getStatoOrdine() == ordine2.getStatoOrdine());

    }

    @ParameterizedTest
    @DisplayName("Test parametrico stato ordine")
    @ValueSource(strings = {"IN_CORSO", "PRONTO", "SERVITO"})
    public void testParametrico(String stato) {

        Ordine ordine = ordineRepository.findById(1L).orElse(null);
        assertEquals(ordine.getStatoOrdine().toString(), stato);

    }

}
