package com.pokepoly.componets;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class PokedexDataComponent extends GridPane{

	
	private Label nombrePokemonLabel,idPokemonLabel;
	private ImageView imagenJugador;
	private Label tipoPokemonLabel,tipoDataPokemonLabel,tipo2PokemonLabel,tipo2DataPokemonLabel;
	private Label evolucionPokemonLabel,evolucionDataPokemonLabel;
	private BuscarComponent buscarPokemon;
	public PokedexDataComponent() {
		super();
		buscarPokemon = new BuscarComponent();
		nombrePokemonLabel = new Label();
		idPokemonLabel = new Label();
		
		GridPane identGrid = new GridPane();
		idPokemonLabel.setStyle(" -fx-font: 18px Arial;");
		nombrePokemonLabel.setStyle(" -fx-font: 18px Arial;");
		identGrid.setStyle(" -fx-background-color:linear-gradient(#ffffff 0%, #ffffff 20%, #2AAEF0 100%),linear-gradient(#ffffff, #2AAEF0),radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));-fx-background-radius: 5,4,3,5;-fx-background-insets: 0,1,2,0;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );-fx-font-family: 'Arial';-fx-text-fill: linear-gradient(white, #d0d0d0);-fx-font-size: 12px;-fx-padding: 10 20 10 20;");
		identGrid.addRow(0, idPokemonLabel, nombrePokemonLabel);
		identGrid.setPadding(new Insets(15));
		RowConstraints rcons = new RowConstraints();
		rcons.setValignment(VPos.BASELINE);
		ColumnConstraints idCol = new ColumnConstraints();
		idCol.setHgrow(Priority.NEVER);
		idCol.setHalignment(HPos.CENTER);
		ColumnConstraints idCol2 = new ColumnConstraints();
		idCol2.setHgrow(Priority.ALWAYS);
		idCol2.setHalignment(HPos.CENTER);
		identGrid.getColumnConstraints().addAll(idCol,idCol2);
		identGrid.getRowConstraints().addAll(rcons);
		
		tipoPokemonLabel= new Label("Tipo 1: ");
		tipo2PokemonLabel = new Label("Tipo 2: ");
		
		tipoDataPokemonLabel = new Label();
		tipo2DataPokemonLabel = new Label();
		
		VBox VboxImagen = new VBox(10);
		
		imagenJugador = new ImageView();
		imagenJugador.setImage(new Image(getClass().getResourceAsStream("1.png")));
		imagenJugador.setFitWidth(200);
		imagenJugador.setFitHeight(200);
		imagenJugador.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.5), 10, 0,10,10)");
		VboxImagen.getChildren().addAll(imagenJugador);
		VboxImagen.setAlignment(Pos.CENTER);
		evolucionPokemonLabel = new Label("Evolucion: ");
		evolucionDataPokemonLabel = new Label();
		VboxImagen.setEffect(new InnerShadow(BlurType.THREE_PASS_BOX, Color.BLACK,40,0,0,0));
		VboxImagen.setStyle("-fx-border-color:black;-fx-border-width: 2px;-fx-border-radius:100px;-fx-background-color:#2AAEF0;-fx-background-radius: 100,4,3,5;");
		
	
		setColumnSpan(VboxImagen, 2);
		setColumnSpan(identGrid, 2);
		setColumnSpan(buscarPokemon, 2);
		
		addRow(0, buscarPokemon);
		addRow(1, identGrid);
		addRow(2, VboxImagen);
		addRow(3, tipoPokemonLabel,tipoDataPokemonLabel);
		addRow(4, tipo2PokemonLabel,tipo2DataPokemonLabel);
		addRow(5, evolucionPokemonLabel,evolucionDataPokemonLabel);
		
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(Priority.SOMETIMES);
		col1.setHalignment(HPos.RIGHT);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(Priority.ALWAYS);
		col1.setHalignment(HPos.LEFT);
		getColumnConstraints().addAll(col1,col2);


		setPadding(new Insets(0,10,0,10));
		setVgap(10);
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
