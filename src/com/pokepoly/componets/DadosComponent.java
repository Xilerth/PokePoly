package com.pokepoly.componets;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class DadosComponent extends BorderPane {

	private Label label = new Label();
	
	public DadosComponent(String data) {
		VBox dado = new VBox();
		label = new Label(data);
		dado.setStyle("-fx-font: 40 arial;");
		dado.getChildren().addAll(label);
		dado.setAlignment(Pos.CENTER);
		
		AnchorPane anchor = new AnchorPane();
		 AnchorPane.setTopAnchor(dado, 0.0);
		 AnchorPane.setBottomAnchor(dado, 0.0);
		 AnchorPane.setLeftAnchor(dado, 0.0);
		 AnchorPane.setRightAnchor(dado, 0.0);
		anchor.setStyle("-fx-background-color:white;-fx-border-color:black;-fx-border-width: 2px;");
		anchor.getChildren().addAll(dado);
		
		setCenter(anchor);
		
	}

	public Label getLabel() {
		return label;
	}
	
}
