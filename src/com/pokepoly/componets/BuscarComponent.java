package com.pokepoly.componets;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class BuscarComponent extends GridPane{

	private TextField buscarText;
	private Button buscarButton;
	
	public BuscarComponent() {

		buscarText = new TextField();
		buscarText.setPromptText("Buscar Pokemon (id/nombre)");
		
		buscarButton = new Button("Buscar");
		buscarButton.setDefaultButton(true);
		
		addRow(0,buscarText,buscarButton);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(Priority.ALWAYS);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(Priority.NEVER);
		getColumnConstraints().addAll(col1,col2);
	}

	public TextField getBuscarText() {
		return buscarText;
	}

	public void setBuscarText(TextField buscarText) {
		this.buscarText = buscarText;
	}

	public Button getBuscarButton() {
		return buscarButton;
	}

	public void setBuscarButton(Button buscarButton) {
		this.buscarButton = buscarButton;
	}
	
	
}
