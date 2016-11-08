package com.pokepoly.views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {

	Stage secStage, thrdStage, fourStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		JugadorView v = new JugadorView();
		JugadorView v2 = new JugadorView();
		JugadorView v3 = new JugadorView();
		JugadorView v4 = new JugadorView();
		
		secStage = new Stage();
		secStage.setScene(new Scene(v2));
		secStage.setTitle("Jugador 2");
		secStage.show();
		
		thrdStage = new Stage();
		thrdStage.setScene(new Scene(v3));
		thrdStage.setTitle("Jugador 3");
		thrdStage.show();
		
		fourStage = new Stage();
		fourStage.setScene(new Scene(v4));
		fourStage.setTitle("Jugador 4");
		fourStage.show();
		
		primaryStage.setTitle("Jugador 1");
		primaryStage.setScene(new Scene(v));
		primaryStage.setResizable(true);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
