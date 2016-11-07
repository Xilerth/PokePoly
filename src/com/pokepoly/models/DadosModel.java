package com.pokepoly.models;

import java.util.ArrayList;

public class DadosModel {

	private ArrayList<Integer> dados;
	private int caras;

	public void lanzarDados(int numDados) {
		dados.clear();
		for (int i = 0; i < numDados; i++) {
			dados.add((int) Math.floor(Math.random() * caras) + 1);
		}
		System.out.println(getResultadoTotal());
		System.out.println(getDados());
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

	public int getCaras() {
		return caras;
	}

	public void setCaras(int caras) {
		this.caras = caras;
	}

	public DadosModel() {
		dados = new ArrayList<>();
	}
}
