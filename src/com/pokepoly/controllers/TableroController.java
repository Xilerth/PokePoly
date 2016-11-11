package com.pokepoly.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TableroController{

	@FXML
	private BorderPane tableroBorder;

	@FXML
	private GridPane tableroGrid;

	public TableroController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pokepoly/views/tableroView.fxml"));
			loader.setController(this);
			tableroBorder = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	public BorderPane getTableroBorder() {
		return tableroBorder;
	}

	public void setTableroBorder(BorderPane tableroBorder) {
		this.tableroBorder = tableroBorder;
	}

	public GridPane getTableroGrid() {
		return tableroGrid;
	}

	public void setTableroGrid(GridPane tableroGrid) {
		this.tableroGrid = tableroGrid;
	}

}
