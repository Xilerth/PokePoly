package com.pokepoly.models;

public class DadosMain {

	public static void main(String[] args) {

		DadosModel dados;
		dados = new DadosModel(6);

		dados.lanzarDados(3);
		System.out.println(dados.getResultadoTotal());
		System.out.println(dados.getDados());

		dados.lanzarDados(3);
		System.out.println(dados.getResultadoTotal());
		System.out.println(dados.getDados());
	}

}
