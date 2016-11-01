package com.pokepoly.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class PokemonModel {

	
	 IntegerProperty idPokemon,fasePokemon; 
	 StringProperty nombrePokemon;
	 ListProperty<Integer> tiposPokemon,evolucionPokemon;
	 

	public PokemonModel(int idPokemon, int fasePokemon,String nombrePokemon, ArrayList<Integer>tiposPokemon,ArrayList<Integer>evolucionPokemon) {
		this.idPokemon = new SimpleIntegerProperty(this,"idPokemon",idPokemon);
		this.fasePokemon = new SimpleIntegerProperty(this,"fasePokemon",fasePokemon);
		this.nombrePokemon = new SimpleStringProperty(this,"nombrePokemon",nombrePokemon);
		this.tiposPokemon = new SimpleListProperty<Integer>();
		this.tiposPokemon.set(FXCollections.observableArrayList(tiposPokemon));
		this.evolucionPokemon = new SimpleListProperty<Integer>();
		this.evolucionPokemon.set(FXCollections.observableArrayList(evolucionPokemon));
	}


	public IntegerProperty idPokemonProperty() {
		return this.idPokemon;
	}
	


	public int getIdPokemon() {
		return this.idPokemonProperty().get();
	}
	


	public void setIdPokemon(final int idPokemon) {
		this.idPokemonProperty().set(idPokemon);
	}
	


	public IntegerProperty fasePokemonProperty() {
		return this.fasePokemon;
	}
	


	public int getFasePokemon() {
		return this.fasePokemonProperty().get();
	}
	


	public void setFasePokemon(final int fasePokemon) {
		this.fasePokemonProperty().set(fasePokemon);
	}
	


	public StringProperty nombrePokemonProperty() {
		return this.nombrePokemon;
	}
	


	public String getNombrePokemon() {
		return this.nombrePokemonProperty().get();
	}
	


	public void setNombrePokemon(final String nombrePokemon) {
		this.nombrePokemonProperty().set(nombrePokemon);
	}
	


	public ListProperty<Integer> tiposPokemonProperty() {
		return this.tiposPokemon;
	}
	


	public List<Integer> getTiposPokemon() {
	return this.tiposPokemonProperty().get();
	}
	


	public  void setTiposPokemon(final ListProperty<Integer> tiposPokemon) {
	this.tiposPokemonProperty().set(tiposPokemon);
	}
	


	public ListProperty<Integer> evolucionPokemonProperty() {
		return this.evolucionPokemon;
	}
	


	public List<Integer> getEvolucionPokemon() {
	return this.evolucionPokemonProperty().get();
	}
	


	public  void setEvolucionPokemon(final ListProperty<Integer> evolucionPokemon) {
	this.evolucionPokemonProperty().set(evolucionPokemon);
	}
	

}
