package com.pokepoly.models;

import java.util.ArrayList;
import java.util.Iterator;

public class DadosModel {

	private ArrayList<Integer> dados;
	private int caras;

	DadosModel(int caras) {
		dados = new ArrayList<>();
		this.caras = caras;
	}

	public void lanzarDados(int numDados) {
		dados.clear();
		for (int i = 0; i < numDados; i++) {
			dados.add((int) Math.floor(Math.random() * caras) + 1);
		}

	}

	public int getResultadoTotal() {

		int tirada = 0;

		for (Integer result : dados) {
			tirada += result;
		}

		return tirada;
	}

	public ArrayList<Integer> getDados() {
		return dados;
	}
}
