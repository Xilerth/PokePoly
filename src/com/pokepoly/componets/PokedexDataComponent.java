package com.pokepoly.componets;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class PokedexDataComponent extends GridPane{

	
	private Label nombrePokemonLabel,idPokemonLabel;
	private ImageView imagenJugador;
	private Label tipoPokemonLabel,tipoDataPokemonLabel,tipo2PokemonLabel,tipo2DataPokemonLabel;
	private Label evolucionPokemonLabel,evolucionDataPokemonLabel;
	private BuscarComponent buscarPokemon;
	public PokedexDataComponent() {
		buscarPokemon = new BuscarComponent();
		nombrePokemonLabel = new Label();
		idPokemonLabel = new Label();
		
		tipoPokemonLabel= new Label("Tipo 1: ");
		tipo2PokemonLabel = new Label("Tipo 2: ");
		
		tipoDataPokemonLabel = new Label();
		tipo2DataPokemonLabel = new Label();
		
		
		imagenJugador = new ImageView();
		imagenJugador.setImage(new Image(getClass().getResource("../resources/imgPokemon/"+1+".png").toExternalForm()));
		imagenJugador.setFitWidth(200);
		imagenJugador.setFitHeight(200);
		
		
		evolucionPokemonLabel = new Label("evuluciona al nivel: ");
		evolucionDataPokemonLabel = new Label();
	
		
		setColumnSpan(imagenJugador, 2);
		setColumnSpan(buscarPokemon, 2);
		
		addRow(0, buscarPokemon);
		addRow(1, idPokemonLabel,nombrePokemonLabel);
		addRow(2, imagenJugador);
		addRow(3, tipoPokemonLabel,tipoDataPokemonLabel);
		addRow(4, tipo2PokemonLabel,tipo2DataPokemonLabel);
		addRow(5, evolucionPokemonLabel,evolucionDataPokemonLabel);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(Priority.SOMETIMES);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(Priority.ALWAYS);
		getColumnConstraints().addAll(col1,col2);


	}

	public Label getNombrePokemonLabel() {
		return nombrePokemonLabel;
	}

	public void setNombrePokemonLabel(Label nombrePokemonLabel) {
		this.nombrePokemonLabel = nombrePokemonLabel;
	}

	public Label getIdPokemonLabel() {
		return idPokemonLabel;
	}

	public void setIdPokemonLabel(Label idPokemonLabel) {
		this.idPokemonLabel = idPokemonLabel;
	}

	public ImageView getImagenJugador() {
		return imagenJugador;
	}

	public void setImagenJugador(ImageView imagenJugador) {
		this.imagenJugador = imagenJugador;
	}

	public Label getTipoPokemonLabel() {
		return tipoPokemonLabel;
	}

	public void setTipoPokemonLabel(Label tipoPokemonLabel) {
		this.tipoPokemonLabel = tipoPokemonLabel;
	}

	public Label getTipoDataPokemonLabel() {
		return tipoDataPokemonLabel;
	}

	public void setTipoDataPokemonLabel(Label tipoDataPokemonLabel) {
		this.tipoDataPokemonLabel = tipoDataPokemonLabel;
	}

	public Label getTipo2PokemonLabel() {
		return tipo2PokemonLabel;
	}

	public void setTipo2PokemonLabel(Label tipo2PokemonLabel) {
		this.tipo2PokemonLabel = tipo2PokemonLabel;
	}

	public Label getTipo2DataPokemonLabel() {
		return tipo2DataPokemonLabel;
	}

	public void setTipo2DataPokemonLabel(Label tipo2DataPokemonLabel) {
		this.tipo2DataPokemonLabel = tipo2DataPokemonLabel;
	}

	public Label getEvolucionPokemonLabel() {
		return evolucionPokemonLabel;
	}

	public void setEvolucionPokemonLabel(Label evolucionPokemonLabel) {
		this.evolucionPokemonLabel = evolucionPokemonLabel;
	}

	public Label getEvolucionDataPokemonLabel() {
		return evolucionDataPokemonLabel;
	}

	public void setEvolucionDataPokemonLabel(Label evolucionDataPokemonLabel) {
		this.evolucionDataPokemonLabel = evolucionDataPokemonLabel;
	}

	public BuscarComponent getBuscarPokemon() {
		return buscarPokemon;
	}

	public void setBuscarPokemon(BuscarComponent buscarPokemon) {
		this.buscarPokemon = buscarPokemon;
	}
	
}
