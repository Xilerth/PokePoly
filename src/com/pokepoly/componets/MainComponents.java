package com.pokepoly.componets;

import com.pokepoly.controllers.DadosController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainComponents extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		DadosController dados = new DadosController();
		primaryStage.setScene(new Scene(dados.getDadoButton(), 200, 200));
		primaryStage.setTitle("PokéPoly");
		primaryStage.initStyle(StageStyle.UNIFIED);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
