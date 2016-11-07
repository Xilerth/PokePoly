package com.pokepoly.componets;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class DadoButton extends Button {

	public DadoButton() {
		super();
		ImageView dados = new ImageView(getClass().getResource("../resources/img/dados.png").toExternalForm());
		dados.setFitHeight(80);
		dados.setFitWidth(80);
		setGraphic(dados);
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);
	}
}
