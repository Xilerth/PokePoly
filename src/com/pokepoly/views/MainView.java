package com.pokepoly.views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		JugadorView v = new JugadorView();
		
		primaryStage.setTitle("Jugador 1");
		primaryStage.setScene(new Scene(v));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
