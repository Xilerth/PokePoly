package com.pokepoly;

import com.pokepoly.controllers.PokemonController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PokePolyApp extends Application {

	PokemonController pokemonController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		pokemonController = new PokemonController();
		primaryStage.setScene(new Scene(new HBox(5, new Button("Pokepoly")), 620, 620));

		for (int i = 0; i < pokemonController.getPokemonList().size(); i++) {

			System.out.println(pokemonController.getPokemonList().get(i).toString());

		}

		primaryStage.setTitle("PokéPoly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
