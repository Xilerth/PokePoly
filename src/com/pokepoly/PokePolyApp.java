package com.pokepoly;

import com.pokepoly.models.PokedexModel;
import com.pokepoly.views.JugadorView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PokePolyApp extends Application {

	PokedexModel pokedexController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		pokedexController = new PokedexModel();
		
		JugadorView jView = new JugadorView();
		primaryStage.setScene(new Scene(jView, 620, 620));

		for (int i = 0; i < pokedexController.getPokemonList().size(); i++) {

			System.out.println(pokedexController.getPokemonList().get(i).toString());

		}

		primaryStage.setTitle("Pok�Poly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
