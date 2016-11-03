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

import com.pokepoly.enums.Tipos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class PokemonModel {

	IntegerProperty idPokemon, fasePokemon;
	StringProperty nombrePokemon;
	ListProperty<Integer> tiposPokemon, evolucionPokemon;
	

	public PokemonModel(int idPokemon, int fasePokemon, String nombrePokemon, ArrayList<Integer> tiposPokemon,
			ArrayList<Integer> evolucionPokemon) {
		this.idPokemon = new SimpleIntegerProperty(this, "idPokemon", idPokemon);
		this.fasePokemon = new SimpleIntegerProperty(this, "fasePokemon", fasePokemon);
		this.nombrePokemon = new SimpleStringProperty(this, "nombrePokemon", nombrePokemon);
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

	public void setTiposPokemon(final ListProperty<Integer> tiposPokemon) {
		this.tiposPokemonProperty().set(tiposPokemon);
	}

	public ListProperty<Integer> evolucionPokemonProperty() {
		return this.evolucionPokemon;
	}

	public List<Integer> getEvolucionPokemon() {
		return this.evolucionPokemonProperty().get();
	}

	public void setEvolucionPokemon(final ListProperty<Integer> evolucionPokemon) {
		this.evolucionPokemonProperty().set(evolucionPokemon);
	}

	@Override
	public String toString() {
		String tipos = "";
		for (int j = 0; j < tiposPokemon.size(); j++) {
			
			switch(tiposPokemon.get(j).toString()){
			case "0": tipos +=""; break;
			case "1": tipos +=" "+Tipos.ACERO; break;
			case "2": tipos +=" "+Tipos.AGUA; break;
			case "3": tipos +=" "+Tipos.BICHO; break;
			case "4": tipos +=" "+Tipos.DRAG�N; break;
			case "5": tipos +=" "+Tipos.EL�CTRICO; break;
			case "6": tipos +=" "+Tipos.FANTASMA; break;
			case "7": tipos +=" "+Tipos.FUEGO; break;
			case "8": tipos +=" "+Tipos.HADA; break;
			case "9": tipos +=" "+Tipos.HIELO; break;
			case "10": tipos +=" "+Tipos.LUCHA; break;
			case "11": tipos +=" "+Tipos.NORMAL; break;
			case "12": tipos +=" "+Tipos.PLANTA; break;
			case "13": tipos +=" "+Tipos.PS�QUICO; break;
			case "14": tipos +=" "+Tipos.ROCA; break;
			case "15": tipos +=" "+Tipos.SINIESTRO; break;
			case "16": tipos +=" "+Tipos.TIERRA; break;
			case "17": tipos +=" "+Tipos.VENENO; break;
			case "18": tipos +=" "+Tipos.VOLADOR; break;
			
			}
			try {
				if(!tiposPokemon.get(j+1).equals(0))
				tipos +=", ";
			} catch (Exception e) {
				// TODO: handle exception
			}
			 
		}
		String Pokemon = getIdPokemon()+", "+getNombrePokemon()+", "+tipos+", "+getFasePokemon()+", "+getEvolucionPokemon();
	return Pokemon;
	}
}
