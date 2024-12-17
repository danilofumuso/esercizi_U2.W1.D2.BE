package it.epicode.esercizi_U2.W1.D2.BE.configurations;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D2.BE.entities.enums.StatoTavoloEnum;
import org.springframework.context.annotation.Bean;

public class TavoloConfiguration {

    @Bean
    Tavolo newTavolo(){
        Tavolo tavolo= new Tavolo();
        tavolo.setStatoTavolo(StatoTavoloEnum.LIBERO);
        tavolo.setNumeroCopertiMax(10);
        return tavolo;
    }

}
