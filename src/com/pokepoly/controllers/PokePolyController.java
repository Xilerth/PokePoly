package com.pokepoly.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import com.pokepoly.models.Turno;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class PokePolyController {

	

    @FXML
    private StackPane mainView;
    
    private TableroController tableroController;
	private Semaphore mutex;
	private Turno turno;
	
    public PokePolyController(Stage primaryStage) {
    	Turno turno = new Turno(4);
    	tableroController = new TableroController();
    	mutex = new Semaphore(1, true);
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pokepoly/views/principalView.fxml"));
			loader.setController(this);
			mainView=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
    	ArrayList<JugadorController> jugadores = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			jugadores.add(new JugadorController(mutex, turno, i, mainView));
		}
		
		ArrayList<Stage> jugadoresStages = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			jugadoresStages.add(new Stage());
			jugadoresStages.get(i).setScene(new Scene(jugadores.get(i).getJugadorView(),450,105));
			jugadoresStages.get(i).setTitle("Jugador numero " + (i + 1));
			jugadoresStages.get(i).initOwner(primaryStage);
			jugadoresStages.get(i).setX(100 );
			jugadoresStages.get(i).setY((100* (i)*2)+100);
			jugadoresStages.get(i).initStyle(StageStyle.UTILITY);
			jugadoresStages.get(i).show();

		}
		
		mainView.getChildren().addAll(tableroController.getTableroGrid());
    
    }

	public StackPane getMainView() {
		return mainView;
	}

	public void setMainView(StackPane mainView) {
		this.mainView = mainView;
	}

	public TableroController getTableroController() {
		return tableroController;
	}

	public void setTableroController(TableroController tableroController) {
		this.tableroController = tableroController;
	}
	
	
	
}
