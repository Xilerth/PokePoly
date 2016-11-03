package com.pokepoly.controllers;

import com.pokepoly.componets.DadoButton;
import com.pokepoly.models.DadosModel;

public class DadosController {

	DadosModel dados;
	DadoButton dadoButton;

	public DadosController() {
		dadoButton = new DadoButton();

		dadoButton.setOnAction((e)-> onDadosButtonAction());
	}

	private void onDadosButtonAction() {
		dados = new DadosModel(6);
		dados.lanzarDados(2);
	}

	public DadosModel getDados() {
		return dados;
	}

	public void setCaras(int caras) {
		dados = new DadosModel(caras);
	}

	public DadoButton getDadoButton() {
		return dadoButton;
	}
	
	
	
}
