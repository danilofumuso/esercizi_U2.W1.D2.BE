package it.epicode.esercizi_U2.W1.D2.BE.runners;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Menu;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Ordine;
import it.epicode.esercizi_U2.W1.D2.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.OrdineRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.TavoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Order(6)
public class OrdiniRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private OrdineRepository ordineRepository;

    @Autowired
    private Ordine newOrdine;

    @Autowired
    private TavoloRepository tavoloRepository;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        ordineRepository.save(newOrdine);

        List<Menu> menu = menuRepository.findAll();

        newOrdine.setMenu(menu);
        newOrdine.setNumeroCoperti(6);
        newOrdine.setImportoTotale(menu.get(5).getPrezzo() + menu.get(2).getPrezzo() );

    }
}
