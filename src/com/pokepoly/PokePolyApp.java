package com.pokepoly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PokePolyApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

<<<<<<< HEAD
		primaryStage.setScene(new Scene(new HBox(5, new Button("NO PeNA")), 620, 620));
=======
		primaryStage.setScene(new Scene(new HBox(5, new Button("")), 620, 620));
>>>>>>> origin/master
		primaryStage.setTitle("Pok�Poly");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
