package com.pokepoly.controllers;

import java.util.Observable;

import com.pokepoly.views.PokedexView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PokedexController {

	PokedexView view;
	PokedexListController controlerList;
	
	public PokedexController() {
		
		view = new PokedexView();
		controlerList = new PokedexListController();
		view.setPokeList(controlerList.getViewList());
		
		view.getPokedexData().getBuscarPokemon().getBuscarButton().setOnAction(e->controlerList.buscarPokemon(view.getPokedexData().getBuscarPokemon().getBuscarText().getText()));
		
		controlerList.punteroProperty()
	    .addListener((observable, oldValue, newValue) -> onCambioImagen(oldValue, newValue));
		view.getPokedexData().getIdPokemonLabel().textProperty().bind(controlerList.getPokemon().idPokemonProperty().asString());
		view.getPokedexData().getTipoDataPokemonLabel().textProperty().bind(controlerList.getPokemon().tiposPokemonProperty().get(0).asString());
		view.getPokedexData().getTipo2DataPokemonLabel().textProperty().bind(controlerList.getPokemon().tiposPokemonProperty().get(1).asString());
		view.getPokedexData().getNombrePokemonLabel().textProperty().bind(controlerList.getPokemon().nombrePokemonProperty());
	
		
	}

	private void onCambioImagen(Number oldValue, Number newValue) {
		Number n = newValue;
		if(n.intValue()==controlerList.getModel().getPokedex().size()){
			
		}else{
		view.getPokedexData().getImagenJugador().setImage(new Image(getClass().getResource("../resources/imgPokemon/"+(n.intValue()+1)+".png").toExternalForm()));
		view.getPokedexData().getTipoDataPokemonLabel().textProperty().bind(controlerList.getPokemon().tiposPokemonProperty().get(0).asString());
		view.getPokedexData().getTipo2DataPokemonLabel().textProperty().bind(controlerList.getPokemon().tiposPokemonProperty().get(1).asString());
		view.getPokedexData().getIdPokemonLabel().textProperty().bind(controlerList.getPokemon().idPokemonProperty().asString());
		view.getPokedexData().getNombrePokemonLabel().textProperty().bind(controlerList.getPokemon().nombrePokemonProperty());
		}
	
	}

	public PokedexView getView() {
		return view;
	}

	public void setView(PokedexView view) {
		this.view = view;
	}

	public PokedexListController getControlerList() {
		return controlerList;
	}

	public void setControlerList(PokedexListController controlerList) {
		this.controlerList = controlerList;
	}
	
	
	
	
}
