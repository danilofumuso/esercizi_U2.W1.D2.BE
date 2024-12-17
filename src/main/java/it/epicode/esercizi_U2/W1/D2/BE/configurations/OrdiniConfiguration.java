package it.epicode.esercizi_U2.W1.D2.BE.configurations;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D2.BE.entities.enums.StatoOrdineEnum;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

public class OrdiniConfiguration {
    @Bean
    Ordine newOrdine() {
        Ordine ordine = new Ordine();
        ordine.setStatoOrdine(StatoOrdineEnum.IN_CORSO);
        ordine.setNumeroOrdine(ordine.getId());
        ordine.setOraAcquisizione(LocalTime.now());
        return ordine;
    }
}
