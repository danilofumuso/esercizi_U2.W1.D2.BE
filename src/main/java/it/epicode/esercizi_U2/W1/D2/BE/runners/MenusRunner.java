package it.epicode.esercizi_U2.W1.D2.BE.runners;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Bevanda;

import it.epicode.esercizi_U2.W1.D2.BE.entities.Pizza;
import it.epicode.esercizi_U2.W1.D2.BE.entities.Topping;
import it.epicode.esercizi_U2.W1.D2.BE.repository.BevandaRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.MenuRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.PizzaRepository;
import it.epicode.esercizi_U2.W1.D2.BE.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
public class MenusRunner implements ApplicationRunner {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private BevandaRepository bevandaRepository;

    @Autowired
    private ToppingRepository toppingRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("MENU");
        System.out.println();
        System.out.println("PIZZE");

        List<Pizza> pizze = pizzaRepository.findAll();
        for (Pizza pizza : pizze) {
            System.out.println("Nome: " + pizza.getNome() + "\nprezzo: " + pizza.getPrezzo() + " €" + "\ncalorie: " + pizza.getCalorie() + " Kcal");
            System.out.println();
        }

        System.out.println();
        System.out.println("BEVANDE");

        List<Bevanda> bevande = bevandaRepository.findAll();
        for (Bevanda bevanda : bevande) {
            System.out.println("Nome: " + bevanda.getNome() + "\nprezzo: " + bevanda.getPrezzo() + " €" + "\ncalorie: " + bevanda.getCalorie() + " Kcal");
            System.out.println();
        }

        System.out.println();
        System.out.println("TOPPINGS");

        List<Topping> toppings = toppingRepository.findAll();
        for (Topping topping : toppings) {
            System.out.println("Nome: " + topping.getNome() + "\nprezzo: " + topping.getPrezzo() + " €" + "\ncalorie: " + topping.getCalorie() + " Kcal");
            System.out.println();

        }

    }
}
