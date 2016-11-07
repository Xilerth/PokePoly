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
		anteriorButton = new Button("Anterior");
		anteriorButton.setMaxWidth(Double.MAX_VALUE);
		actualizarTabla(PEC);
	}
	public PokedexListComponent() {
		siguienteButton = new Button("Siguiente");
		siguienteButton.setMaxWidth(Double.MAX_VALUE);
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
