package com.example.U4D17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GodFatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodFatherPizzaApplication.class, args);

		GestioneMenu stampa = new GestioneMenu();
		GestioneOrdini stampa1 = new GestioneOrdini();
		stampa.stampaMenu();
		stampa.testTopping();
		stampa1.stampaOrdini();

	}

}
