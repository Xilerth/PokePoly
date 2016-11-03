package com.pokepoly.controllers;

import com.pokepoly.componets.DadoButton;
import com.pokepoly.models.DadosModel;

public class DadosController {

	DadosModel dados;
	DadoButton dadoButton;

	public DadosController() {
		dados = new DadosModel();
		dadoButton = new DadoButton();

		dadoButton.setOnAction((e)-> onDadosButtonAction());
		System.out.println("asdas");
	}

	private void onDadosButtonAction() {
		dados.lanzarDados(1);
		System.out.println("pene");
	}

	public DadosModel getDados() {
		return dados;
	}

	public void setCaras(int caras) {
		dados = new DadosModel(caras);
	}
}
