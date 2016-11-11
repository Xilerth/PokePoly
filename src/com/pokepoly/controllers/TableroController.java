package com.pokepoly.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class TableroController {

	@FXML
	private BorderPane tableroBorder;

	@FXML
	private GridPane tableroGrid;

	public TableroController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pokepoly/views/principalView.fxml"));
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
