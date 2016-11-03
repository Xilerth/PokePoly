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

public class PokedexModel {

	private ArrayList <PokemonModel> pokedex;
	
	public ArrayList<PokemonModel> getPokemonList() {
		return pokedex;
	}

	public void setPokemonList(ArrayList<PokemonModel> pokemonList) {
		this.pokedex = pokemonList;
	}

	public PokedexModel() {
		JSONObject jsonObject = new JSONObject(accederFicheroJson());
		pokedex = new ArrayList<>();
		for (int i = 1; i <= jsonObject.length(); i++) {
			String nombrePokemon = jsonObject.getJSONObject(i+"").getString("Nombre");		
			JSONArray tiposPokemon = jsonObject.getJSONObject(i+"").getJSONArray("Tipos");		
			JSONArray evolucionPokemon = jsonObject.getJSONObject(i+"").getJSONArray("Evolucion");	
			int fasePokemon = jsonObject.getJSONObject(i+"").getInt("Fase");		
			ArrayList<Integer> listaEvolucion = toArrayList(evolucionPokemon); 
			ArrayList<Integer> listaTipos = toArrayList(tiposPokemon);
			
			pokedex.add(new PokemonModel(i, fasePokemon, nombrePokemon, listaTipos, listaEvolucion));
		}
	
	}

	private ArrayList<Integer> toArrayList(JSONArray evolucionPokemon) {
		ArrayList<Integer> listdata = new ArrayList<Integer>();     
		JSONArray jArray = evolucionPokemon; 
		if (jArray != null) { 
		   for (int u=0;u<jArray.length();u++){ 
		    listdata.add(Integer.parseInt(jArray.get(u).toString()));
		   } 
		}
		return listdata;
	}

	private String accederFicheroJson() {
		String line = "";
		try (
		    InputStream fis = new FileInputStream("F:\\clase\\git\\PokePoly\\src\\com\\pokepoly\\resources\\json\\pokedex.min.json.txt");
		    InputStreamReader isr = new InputStreamReader(fis,Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		) {
		    line=br.readLine();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
	
	
	
}
