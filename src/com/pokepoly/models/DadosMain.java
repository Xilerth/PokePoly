package com.pokepoly.models;

import com.pokepoly.controllers.DadosController;

public class DadosMain {

	public static void main(String[] args) {

		DadosController dadosController = new DadosController();
		
//		dadosController.getDados() = new DadosModel(6);

		dadosController.getDados().lanzarDados(3);
		System.out.println(dadosController.getDados().getResultadoTotal());
		System.out.println(dadosController.getDados().getDados());

		dadosController.getDados().lanzarDados(3);
		System.out.println(dadosController.getDados().getResultadoTotal());
		System.out.println(dadosController.getDados().getDados());
	}

}
