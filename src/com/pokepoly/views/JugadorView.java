package com.pokepoly.views;

import com.pokepoly.componets.DadoButton;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JugadorView extends HBox {

	DadoButton dadoButton;
	Button nextButton, pkmn1, pkmn2, pkmn3, pkmn4, pkmn5, pkmn6;
	ImageView imagenJugador;
	Label nombreLabel, dineroLabel, gimnasiosLabel, pokedexLabel;
	Label dineroTextoLabel, nombreTextoLabel, pokedexTextoLabel, gimnasiosTextoLabel;
	GridPane gridPane;

	public JugadorView() {
		super(5);

		dadoButton = new DadoButton();

		pkmn1 = new Button("pkmn1");
		pkmn2 = new Button("pkmn2");
		pkmn3 = new Button("pkmn3");
		pkmn4 = new Button("pkmn4");
		pkmn5 = new Button("pkmn5");
		pkmn6 = new Button("pkmn6");

		imagenJugador = new ImageView(getClass().getResource("../resources/img/asd.jpg").toExternalForm());
		imagenJugador.setFitWidth(75);
		imagenJugador.setFitHeight(85);

		nextButton = new Button();
		nextButton.setMaxWidth(50);
		nextButton.setMaxHeight(50);
		nextButton.setGraphic(new ImageView(getClass().getResource("../resources/img/flecha.png").toExternalForm()));

		nombreLabel = new Label("Nombre");
		dineroLabel = new Label("Dinero");
		gimnasiosLabel = new Label("Gimnasios");
		pokedexLabel = new Label("Pokédex");

		nombreTextoLabel = new Label("Unown");
		dineroTextoLabel = new Label("0 ₽");
		gimnasiosTextoLabel = new Label("0");
		pokedexTextoLabel = new Label("0 / 151");

		VBox labels = new VBox(5, nombreLabel, dineroLabel, gimnasiosLabel, pokedexLabel);
		labels.setAlignment(Pos.CENTER);

		VBox dataLabels = new VBox(5, nombreTextoLabel, dineroTextoLabel, gimnasiosTextoLabel, pokedexTextoLabel);
		dataLabels.setAlignment(Pos.CENTER);

		// EQUIPO POKÉMON
		gridPane = new GridPane();
		GridPane.setRowSpan(imagenJugador, 3);
		gridPane.add(pkmn1, 0, 0);
		gridPane.add(pkmn2, 1, 0);
		gridPane.add(pkmn3, 0, 1);
		gridPane.add(pkmn4, 1, 1);
		gridPane.add(pkmn5, 0, 2);
		gridPane.add(pkmn6, 1, 2);
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		setPadding(new Insets(5));
		getChildren().addAll(gridPane, imagenJugador, labels, dataLabels, dadoButton);

		setAlignment(Pos.TOP_CENTER);
	}

}
