package com.pokepoly.views;

import com.pokepoly.componets.DadoButton;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class JugadorView extends GridPane {

	DadoButton dadoButton;
	Button nextButton, pkmn1, pkmn2, pkmn3, pkmn4, pkmn5, pkmn6;
	ImageView imagenJugador;
	Label nombreLabel, dineroLabel, gimnasiosLabel, pokedexLabel;
	// Label

	public JugadorView() {

		dadoButton = new DadoButton();

		pkmn1 = new Button("pkmn1");
		pkmn2 = new Button("pkmn2");
		pkmn3 = new Button("pkmn3");
		pkmn4 = new Button("pkmn4");
		pkmn5 = new Button("pkmn5");
		pkmn6 = new Button("pkmn6");

		imagenJugador = new ImageView(getClass().getResource("../resources/img/asd.jpg").toExternalForm());
		imagenJugador.setFitWidth(75);
		imagenJugador.setFitHeight(80);
		nextButton = new Button();
		nextButton.setMaxWidth(50);
		nextButton.setMaxHeight(50);
		nextButton.setGraphic(new ImageView(getClass().getResource("../resources/img/flecha.png").toExternalForm()));

		nombreLabel = new Label("Nombre");
		dineroLabel = new Label("Dinero");
		gimnasiosLabel = new Label("Gimnasios");
		pokedexLabel = new Label("Pokédex");

		VBox stats = new VBox(5, nombreLabel, dineroLabel, gimnasiosLabel);

		GridPane.setRowSpan(imagenJugador, 3);
		GridPane.setRowSpan(stats, 3);

		add(pkmn1, 0, 0);
		add(pkmn2, 1, 0);
		add(pkmn3, 0, 1);
		add(pkmn4, 1, 1);
		add(pkmn5, 0, 2);
		add(pkmn6, 1, 2);

		add(imagenJugador, 2, 0);
		add(stats, 3, 0);
		// pokedexLabel), 0, 3);
		// add(nextButton, 2, 3);
		// add(dadoButton, 0, 4);

		setVgap(5);
		setHgap(5);
		setPadding(new Insets(10));
//		setGridLinesVisible(true);
	}

}
