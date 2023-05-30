package com.example.U4D17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.U4D17.config.OrdiniConfig;
import com.example.U4D17.model.Ordini;

public class GestioneOrdini {

	private Ordini ordini;
	private AnnotationConfigApplicationContext ctx;

	public GestioneOrdini() {
		ctx = new AnnotationConfigApplicationContext(OrdiniConfig.class);
		ordini = (Ordini) ctx.getBean("ordini");

	}

	public void stampaOrdini() {
		System.out.println("******ordini******");
		System.out.println(ordini.getId() + ordini.getCoperti() + ordini.getNumOrdine() + ordini.getTotale());
	}

	public void testTopping() {

	}

}
