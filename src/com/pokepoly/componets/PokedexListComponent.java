package com.pokepoly.componets;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PokedexListComponent extends VBox{
	
	
	private Button siguienteButton,anteriorButton;
	private ArrayList<PokedexElementComponent> PEC;

	public PokedexListComponent(ArrayList<PokedexElementComponent> PEC) {
		siguienteButton = new Button("Siguiente");
		siguienteButton.setMaxWidth(Double.MAX_VALUE);
		siguienteButton.setStyle("-fx-base:rgba(0,0,0,0.4);-fx-border-color:black;-fx-border-width: 2px;-fx-text-fill:white");
		anteriorButton = new Button("Anterior");
		anteriorButton.setMaxWidth(Double.MAX_VALUE);
		anteriorButton.setStyle("-fx-base:rgba(0,0,0,0.4);-fx-border-color:black;-fx-border-width: 2px;-fx-text-fill:white");
		actualizarTabla(PEC);
	}
	public PokedexListComponent() {
		siguienteButton = new Button("Siguiente");
		siguienteButton.setMaxWidth(Double.MAX_VALUE);
		siguienteButton.setStyle("-fx-background-color:red;-fx-border-color:black;-fx-border-width: 2px;");
		
		anteriorButton = new Button("Anterior");
		anteriorButton.setMaxWidth(Double.MAX_VALUE);
	}
	public void actualizarTabla(ArrayList<PokedexElementComponent> PEC) {
	
		
		this.PEC = PEC;
		getChildren().clear();
		getChildren().addAll(anteriorButton);
		for (int i = 0; i < PEC.size(); i++) {
			getChildren().removeAll(PEC.get(i));
		}
		
		for (int i = 0; i < PEC.size(); i++) {
			if (i==6) {
				PEC.get(i).setStyle("-fx-background-color:#86D7FF");
			}
			getChildren().addAll(PEC.get(i));
			
		}
		getChildren().addAll(siguienteButton);
	setStyle("-fx-background-color:#86D7FF");
	}

	public ArrayList<PokedexElementComponent> getPEC() {
		return PEC;
	}

	public void setPEC(ArrayList<PokedexElementComponent> pEC) {
		PEC = pEC;
	}
	public Button getSiguienteButton() {
		return siguienteButton;
	}
	public void setSiguienteButton(Button siguienteButton) {
		this.siguienteButton = siguienteButton;
	}
	public Button getAnteriorButton() {
		return anteriorButton;
	}
	public void setAnteriorButton(Button anteriorButton) {
		this.anteriorButton = anteriorButton;
	}
	
}
