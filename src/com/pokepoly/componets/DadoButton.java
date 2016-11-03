package com.pokepoly.componets;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class DadoButton extends Button {

	public DadoButton() {
		super();
		setGraphic(new ImageView(getClass().getResource("../resources/img/dados.png").toExternalForm()));
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);
	}
}
