package com.pokepoly;

import com.pokepoly.componets.PokedexElementComponent;
import com.pokepoly.models.PokedexModel;
import com.pokepoly.models.PokemonModel;
import com.pokepoly.views.JugadorView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PokePolyApp extends Application {

	PokedexModel pokedexController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		pokedexController = new PokedexModel();
		
		JugadorView jView = new JugadorView();
		PokedexElementComponent element = new  PokedexElementComponent("1", "BULBASAUR");
	
		VBox vbox = new VBox();
		int puntero= pokedexController.getPuntero();
		for (int j = 0; j < 7; j++) {
			pokedexController.anteriorPokemon();
		}
		for (int i = 0; i < 20; i++) {
		
			
				pokedexController.siguientePokemon();
				vbox.getChildren().addAll(new PokedexElementComponent(
						Integer.toString(pokedexController.getPokemonList().get(pokedexController.getPuntero()).getIdPokemon()),
						pokedexController.getPokemonList().get(pokedexController.getPuntero()).getNombrePokemon()));
			
	
		}
		for (int i = 0; i < pokedexController.getPokemonList().size(); i++) {

			System.out.println(pokedexController.getPokemonList().get(i).toString());

		}
		primaryStage.setScene(new Scene(vbox, 620, 620));
		primaryStage.setTitle("PokéPoly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
