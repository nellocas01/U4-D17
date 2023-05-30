package com.example.U4D17.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.U4D17.model.Drink;
import com.example.U4D17.model.DrinkLemonade;
import com.example.U4D17.model.Franchise;
import com.example.U4D17.model.FranchiseMug;
import com.example.U4D17.model.Menu;
import com.example.U4D17.model.PizzaHawaiian;
import com.example.U4D17.model.PizzaMargherita;
import com.example.U4D17.model.PizzaSalami;
import com.example.U4D17.model.ToppingCheese;
import com.example.U4D17.model.ToppingHam;

@Configuration
public class MenuConfig {

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));

		menu.getMenuDrink().add(drinkLemonade());

		return menu;

	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}

	@Bean
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
}
