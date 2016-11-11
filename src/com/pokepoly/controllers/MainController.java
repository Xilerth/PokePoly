package com.pokepoly.controllers;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import com.pokepoly.models.Turno;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController extends Application  {
	PokePolyController mainController;
	
	
	public void start(Stage primaryStage) throws Exception {

		mainController = new PokePolyController(primaryStage);
		primaryStage.setScene(new Scene(mainController.getMainView(),1200,900));
		primaryStage.setTitle("PokéPoly");
		primaryStage.initStyle(StageStyle.UNIFIED);
		primaryStage.show();

	

	}

	public static void main(String[] args) {
		launch(args);
	}

}
