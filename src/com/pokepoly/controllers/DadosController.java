package com.pokepoly.controllers;

import java.util.ArrayList;

import com.pokepoly.componets.DadoButton;
import com.pokepoly.componets.DadosComponent;
import com.pokepoly.models.DadosModel;

import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DadosController {

	DadosModel dados;
	DadoButton dadoButton;

	public DadosController() {
		dadoButton = new DadoButton();

		dadoButton.setOnAction((e) -> onDadosButtonAction());
	}

	private void onDadosButtonAction() {
		dados = new DadosModel();
		dados.setCaras(6);
		dados.lanzarDados(2);
		
		ArrayList<Integer> result = dados.getDados();
		ArrayList<Stage> stage = new ArrayList<>();
		for (int i = 0; i < result.size(); i++) {
			stage.add(new Stage());
			stage.get(i).setScene(new Scene(new DadosComponent(result.get(i)+""),200,200));
			stage.get(i).setX(200*(i+1));
			stage.get(i).setY(300);
			stage.get(i).initStyle(StageStyle.UNDECORATED);
			stage.get(i).show();
		}

		Task<Void> sleeper = new Task<Void>() {
	        @Override
	        protected Void call() throws Exception {
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	            }
	            return null;
	        }
	    };
	   
		sleeper.setOnSucceeded((e)-> {
			for (int i = 0; i < result.size(); i++) {
				
				stage.get(i).close();
			
			}
			stage.clear();
		
		});

		    new Thread(sleeper).start();
		    
	}
	

    
    
	public DadosModel getDados() {
		return dados;
	}

	public DadoButton getDadoButton() {
		return dadoButton;
	}

}
