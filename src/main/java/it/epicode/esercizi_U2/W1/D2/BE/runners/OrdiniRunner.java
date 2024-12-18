package it.epicode.esercizi_U2.W1.D2.BE.runners;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Alimenti;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Menu;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Tavolo;
import it.epicode.esercizi_U2.W1.D2.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.OrdineRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.TavoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Order(5)
public class OrdiniRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private OrdineRepository ordineRepository;

    @Autowired
    private Ordine newOrdine;

    @Autowired
    private Ordine newOrdine2;



    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        newOrdine.setMenu(menuRepository.findAll().getFirst());
        newOrdine.setImportoTotale(100 + costoCoperto);
        newOrdine.setNumeroCoperti(6);

        newOrdine2.setMenu(menuRepository.findAll().getFirst());
        newOrdine2.setImportoTotale(150 + costoCoperto);
        newOrdine2.setNumeroCoperti(8);


        ordineRepository.save(newOrdine);
        ordineRepository.save(newOrdine2);

        System.out.println(ordineRepository.findById(1L));

    }
}
