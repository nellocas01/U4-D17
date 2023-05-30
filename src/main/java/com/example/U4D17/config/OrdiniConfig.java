package com.example.U4D17.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.U4D17.model.Ordini;
import com.example.U4D17.model.Tavolo.Stato;

@Configuration
public class OrdiniConfig {

	@Bean
	public Ordini ordini() {
		Ordini ordini = new Ordini(1, 10, Stato.LIBERO);

		return ordini;
	}
}
