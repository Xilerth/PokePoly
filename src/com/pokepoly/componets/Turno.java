package com.pokepoly.componets;

public class Turno {
	public int n = 0;

	public int jugadores;

	public Turno(int jugadores) {
		this.jugadores = jugadores;
	}

	public void siguienteTurno() {
		
		if(n<(jugadores-1)){
			n++;
		}else{
			n=0;
		}
		
	}
}
