package it.polito.tdp.noleggio.model;

import java.time.LocalTime;

public class Evento implements Comparable<Evento>{
	
	public enum TipoEvento {
		CLIENTE_ARRIVA,
		AUTO_RESTITUITA
	}
	
	private LocalTime tempo;
	private TipoEvento tipo;
	
	@Override
	public int compareTo(Evento ev) {
		return this.tempo.compareTo(ev.tempo);
	}
	
}
