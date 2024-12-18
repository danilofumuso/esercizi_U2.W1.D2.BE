package it.epicode.esercizi_U2.W1.D2.BE.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(mappedBy = "menu")
    private List<Pizza> pizze = new ArrayList<>();

    @OneToMany(mappedBy = "menu")
    private List<Bevanda> bevande = new ArrayList<>();

    @OneToMany(mappedBy = "menu")
    private List<Topping> toppings = new ArrayList<>();

    public void stampaMenu() {
        System.out.println("MENU");
        System.out.println();
        System.out.println("PIZZE");
        for (Pizza pizza : pizze) {
            System.out.println("Nome: " + pizza.getNome() + "\nprezzo: " + pizza.getPrezzo() + " €" + "\ncalorie: " + pizza.getCalorie() + " Kcal");
            System.out.println();
        }
        System.out.println();
        System.out.println("BEVANDE");
        for (Bevanda bevanda : bevande) {
            System.out.println("Nome: " + bevanda.getNome() + "\nprezzo: " + bevanda.getPrezzo() + " €" + "\ncalorie: " + bevanda.getCalorie() + " Kcal");
            System.out.println();
        }
        System.out.println();
        System.out.println("TOPPINGS");
        for (Topping topping : toppings) {
            System.out.println("Nome: " + topping.getNome() + "\nprezzo: " + topping.getPrezzo() + " €" + "\ncalorie: " + topping.getCalorie() + " Kcal");
            System.out.println();

        }
    }

}
