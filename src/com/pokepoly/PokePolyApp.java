package com.pokepoly;

import com.pokepoly.controllers.PokedexController;
import com.pokepoly.models.PokedexModel;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class PokePolyApp extends Application {

	PokedexModel pokedexController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		pokedexController = new PokedexModel();
		
//		JugadorView jView = new JugadorView();
		PokedexController element = new  PokedexController();
	
		
		for (int i = 0; i < pokedexController.getPokemonList().size(); i++) {

//			System.out.println(pokedexController.getPokemonList().get(i).toString());
		}
//		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(new Scene(element.getView(), 620, 630));
		primaryStage.setTitle("PokéPoly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
