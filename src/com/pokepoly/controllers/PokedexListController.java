package com.pokepoly.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.pokepoly.componets.PokedexElementComponent;
import com.pokepoly.componets.PokedexListComponent;
import com.pokepoly.models.PokedexModel;
import com.pokepoly.models.PokemonModel;
import com.pokepoly.views.PokedexView;

import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.layout.VBox;

public class PokedexListController {

	private PokedexModel model;
	private PokedexListComponent viewList;
	private IntegerProperty puntero;
	private PokemonModel pokemon;
	private ArrayList<PokedexElementComponent> arrayPokedex = new ArrayList<>();

	public PokedexListController() {
		
		puntero = new SimpleIntegerProperty(this,"puntero");
		model = new PokedexModel();
		pokemon = new PokemonModel();
		puntero.set(0);
		actualizarLista(arrayPokedex);
		
		viewList = new PokedexListComponent(arrayPokedex);
		
		viewList.getSiguienteButton().setOnAction(e -> {
			siguientePokemon();
		});
		viewList.getAnteriorButton().setOnAction(e -> {
			anteriorPokemon();
		});
		
		viewList.setOnMouseDragReleased(e-> {
			System.out.println("moviendo");
		});
		
	}


	private void siguientePokemon() {
		if (puntero.get()>=(model.getPokedex().size()-1)) {
			puntero.set(-1);
		}
		puntero.set(puntero.get()+1);
		model.setPuntero(puntero.get());
		actualizarLista(arrayPokedex);
		viewList.actualizarTabla(arrayPokedex);
	}
	private void anteriorPokemon() {
		if (puntero.get()<=0) {
			puntero.set(model.getPokedex().size());
		}
		puntero.set(puntero.get()-1);
		model.setPuntero(puntero.get());
		actualizarLista(arrayPokedex);
		viewList.actualizarTabla(arrayPokedex);
	}

	
	public void buscarPokemon(String dato){
		
		try {
			PokemonModel poke = model.buscarPokemon(dato);
			model.setPuntero(poke.getIdPokemon()-1);
			puntero.set(model.getPuntero());
			actualizarLista(arrayPokedex);
			viewList.actualizarTabla(arrayPokedex);
		} catch (Exception e) {
			
		}
		
		
		
	}
	
	private void actualizarLista(ArrayList<PokedexElementComponent> arrayPokedex) {
		arrayPokedex.clear();
		
		pokemon.idPokemonProperty().set(model.getPokemonList().get(model.getPuntero()).getIdPokemon());
		pokemon.nombrePokemonProperty().set(model.getPokemonList().get(model.getPuntero()).getNombrePokemon());
		pokemon.fasePokemonProperty().set(model.getPokemonList().get(model.getPuntero()).getFasePokemon());
		pokemon.tiposPokemonProperty().set(model.getPokemonList().get(model.getPuntero()).tiposPokemonProperty());
		pokemon.evolucionPokemonProperty().set(model.getPokemonList().get(model.getPuntero()).evolucionPokemonProperty());
		
		for (int j = 0; j < 7; j++) {
			model.anteriorPokemon();
		}
		for (int i = 0; i < 14; i++) {
			model.siguientePokemon();
				arrayPokedex.add(new PokedexElementComponent(
						Integer.toString(model.getPokemonList().get(model.getPuntero()).getIdPokemon()),
						model.getPokemonList().get(model.getPuntero()).getNombrePokemon()));
			final int x = i;
			final int entero = model.getPokemonList().get(model.getPuntero()).getIdPokemon();
			arrayPokedex.get(i).setOnMouseReleased(e->{
				buscarPokemon(Integer.toString(entero));
			});
			arrayPokedex.get(i).setOnMouseEntered(e->{
				if(x!=6){
					arrayPokedex.get(x).setStyle("-fx-background-color:rgba(255,255,255,0.8);-fx-border-color:black;-fx-border-width: 2px;");
					arrayPokedex.get(x).setCursor(Cursor.HAND);
				}
				
			});
			arrayPokedex.get(i).setOnMouseExited(e->{
				if(x!=6){
					arrayPokedex.get(x).setStyle("-fx-background-color:white;-fx-border-color:black;-fx-border-width: 2px;");
					arrayPokedex.get(x).setCursor(Cursor.DEFAULT);
				}
				
			});
	
		}
		
		
	}

	public PokedexModel getModel() {
		return model;
	}

	public void setModel(PokedexModel model) {
		this.model = model;
	}

	public PokedexListComponent getViewList() {
		return viewList;
	}

	public void setViewList(PokedexListComponent viewList) {
		this.viewList = viewList;
	}

	public final IntegerProperty punteroProperty() {
		return this.puntero;
	}
	

	public final int getPuntero() {
		return this.punteroProperty().get();
	}
	

	public final void setPuntero(final int puntero) {
		this.punteroProperty().set(puntero);
	}

	public PokemonModel getPokemon() {
		return pokemon;
	}

	public void setPokemon(PokemonModel pokemon) {
		this.pokemon = pokemon;
	}
	
	
}
