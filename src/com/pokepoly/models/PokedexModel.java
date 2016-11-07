package com.pokepoly.models;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;


public class PokedexModel {

	private ArrayList<PokemonModel> pokedex;
	private int puntero;

	public ArrayList<PokemonModel> getPokemonList() {
		return pokedex;
	}

	public void setPokemonList(ArrayList<PokemonModel> pokemonList) {
		this.pokedex = pokemonList;
	}

	public PokedexModel() {
		JSONObject jsonObject = new JSONObject(accederFicheroJson());
		puntero = 0;
		pokedex = new ArrayList<>();
		for (int i = 1; i <= jsonObject.length(); i++) {
			String nombrePokemon = jsonObject.getJSONObject(i + "").getString("Nombre").toUpperCase();
			JSONArray tiposPokemon = jsonObject.getJSONObject(i + "").getJSONArray("Tipos");
			JSONArray evolucionPokemon = jsonObject.getJSONObject(i + "").getJSONArray("Evolucion");
			int fasePokemon = jsonObject.getJSONObject(i + "").getInt("Fase");
			
			
			ArrayList<IntegerProperty> listaEvolucion = toArrayList(evolucionPokemon);
			ArrayList<IntegerProperty> listaTipos = toArrayList(tiposPokemon);

			pokedex.add(new PokemonModel(i, fasePokemon, nombrePokemon, listaTipos, listaEvolucion));

		}

	}

	private ArrayList<IntegerProperty> toArrayList(JSONArray evolucionPokemon) {
		ArrayList<IntegerProperty> listdata = new ArrayList<IntegerProperty>();
		JSONArray jArray = evolucionPokemon;
		if (jArray != null) {
			for (int u = 0; u < jArray.length(); u++) {
				listdata.add(new SimpleIntegerProperty(this,"poke",Integer.parseInt(jArray.get(u).toString())));
			}
		}
		return listdata;
	}

	private String accederFicheroJson() {
		String line = "";
		try (InputStream fis = new FileInputStream(
				"F:\\clase\\git\\PokePoly\\src\\com\\pokepoly\\resources\\json\\pokedex.min.json.txt");
				InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
				BufferedReader br = new BufferedReader(isr);) {
			line = br.readLine();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	public void siguientePokemon() {
		if (pokedex.size()-1 > puntero) {
			puntero++;
		} else {
			puntero = 0;
		}

	}

	public void anteriorPokemon() {
		if (0 < puntero) {
			puntero--;
		} else {
			puntero = pokedex.size() - 1;
		}

	}

	public PokemonModel buscarPokemon(String data) throws Exception {
		PokemonModel poke = new PokemonModel();
		data = data.toUpperCase();
		try {
			int dato = Integer.parseInt(data);

			if (dato <= pokedex.size()) {
				poke = pokedex.get(dato - 1);
			} else {
				poke = null;
			}
		} catch (NumberFormatException e) {
			for (int i = 0; i < pokedex.size(); i++) {
				if (data.equals(pokedex.get(i).getNombrePokemon())) {
					poke = pokedex.get(i);
				}
			}

		}

		return poke;

	}

	public ArrayList<PokemonModel> getPokedex() {
		return pokedex;
	}

	public int getPuntero() {
		return puntero;
	}

	public void setPuntero(int puntero) {
		this.puntero = puntero;
	}


}
