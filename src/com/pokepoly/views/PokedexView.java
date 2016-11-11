package com.pokepoly.views;

import com.pokepoly.componets.PokedexDataComponent;
import com.pokepoly.componets.PokedexListComponent;
import com.pokepoly.controllers.PokedexListController;

import javafx.scene.layout.BorderPane;

public class PokedexView extends BorderPane {

	PokedexDataComponent pokedexData;
	PokedexListComponent pokeList;
	public PokedexView() {
		pokeList = new PokedexListComponent();
		
		pokedexData = new PokedexDataComponent();
		
		
		
		pokedexData.setStyle("-fx-background-color:#86D7FF");
		setCenter(pokeList);
		setRight(pokedexData);
	}

	public PokedexDataComponent getPokedexData() {
		return pokedexData;
	}

	public void setPokedexData(PokedexDataComponent pokedexData) {
		this.pokedexData = pokedexData;
	}

	public PokedexListComponent getPokeList() {
		return pokeList;
	}

	public void setPokeList(PokedexListComponent pokeList) {
		
		this.pokeList = pokeList;
		setCenter(pokeList);
	}
	
	
}
