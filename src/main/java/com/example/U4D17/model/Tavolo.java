package com.example.U4D17.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Tavolo {

	private int id;
	private int coperti;
	private Stato stato;

	public enum Stato {
		OCCUPATO, LIBERO;
	}

}
