package com.pokepoly.controllers;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import com.pokepoly.componets.DadoButton;
import com.pokepoly.componets.DadosComponent;
import com.pokepoly.models.DadosModel;
import com.pokepoly.models.Turno;
import com.pokepoly.views.JugadorView;
import com.pokepoly.views.MainView;

import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JugadorController {

	DadosModel dados;
	JugadorView jugadorView;
	Semaphore mutex;
	Turno turno;
	int jugador;
	StackPane mainView;
	
	public JugadorController(Semaphore state, Turno turno, int jugador, StackPane mainView) {
		jugadorView = new JugadorView();
		this.mutex = state;
		this.turno = turno;
		this.jugador = jugador;
		this.mainView = mainView;
		jugadorView.getDadoButton().setOnAction((e) -> onDadosButtonAction());
	}

	private void onDadosButtonAction() {
		if (jugador == turno.n) {
			if (mutex.tryAcquire()) {
				dados = new DadosModel();
				dados.setCaras(6);
				dados.lanzarDados(2);

				ArrayList<Integer> result = dados.getDados();
				ArrayList<DadosComponent> dados = new ArrayList<>();
				for (int i = 0; i < result.size(); i++) {
					 dados.add(new DadosComponent(result.get(i)+""));
					dados.get(i).setMaxWidth(200);
					dados.get(i).setMaxHeight(200);
					
					mainView.getChildren().add(dados.get(i));
					StackPane.setMargin(dados.get(i), new Insets(0,0,0,(-700)+((i+1)*450)));
					/*stage.get(i).setScene(new Scene();
					stage.get(i).setX(200 * (i + 1));
					stage.get(i).setY(300);
					stage.get(i).initStyle(StageStyle.UNDECORATED);
					stage.get(i).show();*/
				
				}

				Task<Void> sleeper = new Task<Void>() {
					@Override
					protected Void call() throws Exception {
						try {
							Thread.sleep(2000);
							
							mutex.release();
							turno.siguienteTurno();
						} catch (InterruptedException e) {
						}
						return null;
					}
				};
				sleeper.setOnSucceeded((e) -> {
					for (int i = 0; i < result.size(); i++) {
						mainView.getChildren().remove(1, 2);
						/*stage.get(i).close();*/

					}
					/*stage.clear();*/

				});

				new Thread(sleeper).start();

			} else {
			}
		}else {
			System.out.println("No es tu turno jugador "+(jugador+1)+" Es el turno del jugador "+(turno.n+1));
		}
	}

	public DadosModel getDados() {
		return dados;
	}

	public void setDados(DadosModel dados) {
		this.dados = dados;
	}

	public JugadorView getJugadorView() {
		return jugadorView;
	}

	public void setJugadorView(JugadorView jugadorView) {
		this.jugadorView = jugadorView;
	}

	public Semaphore getMutex() {
		return mutex;
	}

	public void setMutex(Semaphore mutex) {
		this.mutex = mutex;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}



}
