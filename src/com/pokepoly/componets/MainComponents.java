package com.pokepoly.componets;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import com.pokepoly.controllers.DadosController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainComponents extends Application {
	Semaphore mutex = new Semaphore(1, true);
	Turno turno;

	public void start(Stage primaryStage) throws Exception {
		Turno turno = new Turno(4);

		ArrayList<DadosController> jugadores = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			jugadores.add(new DadosController(mutex, turno, i));
		}

		primaryStage.setScene(new Scene(new HBox(), 200, 200));
		primaryStage.setTitle("PokéPoly");
		primaryStage.initStyle(StageStyle.UNIFIED);
		primaryStage.show();

		ArrayList<Stage> jugadoresStages = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			jugadoresStages.add(new Stage());
			jugadoresStages.get(i).setScene(new Scene(jugadores.get(i).getDadoButton(), 200, 200));
			jugadoresStages.get(i).initOwner(primaryStage);
			jugadoresStages.get(i).setTitle("Jugador numero " + (i + 1));
			jugadoresStages.get(i).setX(300 * (i + 2));
			jugadoresStages.get(i).setY(500);
			jugadoresStages.get(i).initStyle(StageStyle.UNIFIED);
			jugadoresStages.get(i).show();

		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}
