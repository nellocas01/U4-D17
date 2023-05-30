package com.example.U4D17.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ordini extends Tavolo {

	public Ordini(int id, int coperti, Stato stato) {
		super(id, coperti, stato);
	}

	private int numOrdine;
	private State state;
	private int coperti;
	private Date orario;
	private double totale;

	public enum State {
		INCORSO, PRONTO, SERVITO;
	}

	public Ordini() {
		super(1, 6, Stato.LIBERO);
	}
}
