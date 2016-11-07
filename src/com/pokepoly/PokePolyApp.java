package com.pokepoly;

import com.pokepoly.componets.PokedexDataComponent;
import com.pokepoly.componets.PokedexElementComponent;
import com.pokepoly.controllers.PokedexController;
import com.pokepoly.controllers.PokedexListController;
import com.pokepoly.models.PokedexModel;
import com.pokepoly.models.PokemonModel;
import com.pokepoly.views.JugadorView;
import com.pokepoly.views.PokedexView;

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
		PokedexController element = new  PokedexController();
	
		
		for (int i = 0; i < pokedexController.getPokemonList().size(); i++) {

//			System.out.println(pokedexController.getPokemonList().get(i).toString());
		}
		primaryStage.setScene(new Scene(element.getView(), 620, 620));
		primaryStage.setTitle("PokéPoly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
