package com.pokepoly.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;

public class PokePolyController {

	

    @FXML
    private StackPane mainView;

	
    public PokePolyController() {

    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pokepoly/views/principalView.fxml"));
			loader.setController(this);
			mainView=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    
    
    }
	
	
	
}
