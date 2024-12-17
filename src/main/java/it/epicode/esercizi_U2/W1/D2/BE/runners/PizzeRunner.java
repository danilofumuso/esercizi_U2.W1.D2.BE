package it.epicode.esercizi_U2.W1.D2.BE.runners;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D2.BE.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Order(1)
public class PizzeRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private Pizza newPizzaMargherita;

    @Autowired
    private Pizza newPizzaHawaaiiana;

    @Autowired
    private Pizza newPizzaSalame;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        pizzaRepository.save(newPizzaMargherita);
        pizzaRepository.save(newPizzaHawaaiiana);
        pizzaRepository.save(newPizzaSalame);

    }
}
