package com.pokepoly.componets;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class PokedexElementComponent extends GridPane {
	private Label numeroLabel, nombreLabel;
	
	public PokedexElementComponent(String numero, String nombre) {

		numeroLabel = new Label(numero);
		nombreLabel = new Label(nombre);
		
		initPokedexElement();
		
		
	}
	public PokedexElementComponent() {
		numeroLabel = new Label("");
		nombreLabel = new Label("");
		
		initPokedexElement();
	
	}
	private void initPokedexElement() {
		addRow(0, numeroLabel,nombreLabel);
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(Priority.NEVER);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(Priority.ALWAYS);
		col2.setHalignment(HPos.CENTER);
		setStyle("-fx-background-color:white;-fx-border-color:black;-fx-border-width: 2px;");
		setPadding(new Insets(10));
		getColumnConstraints().addAll(col1,col2);
	}
	public Label getNumeroLabel() {
		return numeroLabel;
	}
	public Label getNombreLabel() {
		return nombreLabel;
	}
	
}
