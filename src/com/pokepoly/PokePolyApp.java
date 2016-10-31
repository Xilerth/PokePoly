package com.pokepoly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PokePolyApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(new HBox(5, new Button("Pokepoly")), 620, 620));

		primaryStage.setTitle("PokéPoly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
