package application;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Escenario {
	//posiciones iniciales
	int mx=0;
	int my=0;
	AnimationTimer contador;
	TranslateTransition autoRojo;
	TranslateTransition autoVerde;
	TranslateTransition personaVerde;
	ImageView mostrarObstaculo2;
	ImageView mostrarObstaculo;
	ImageView mostrarPersona;
	Aleatorio aleatorio;
	ImageView autos1[];
	ImageView autos2[];
	ImageView peatones[];
	ImageView mostrarJugador;
	Stage juegoStage;
	
	Pane root=new Pane();
	public void Escenario(Stage Stage2) {
		
		juegoStage = Stage2;
		Scene scene=new Scene(root,500,500);
		aleatorio = new Aleatorio();
		
		Image fondo=new Image("FONDOFINAL.jpg");
		ImageView mostrarFondo=new ImageView();
		mostrarFondo.setImage(fondo);
		mostrarFondo.setFitWidth(500);
		mostrarFondo.setFitHeight(500);
		root.getChildren().addAll(mostrarFondo);
		Stage2.setScene(scene); 
		Stage2.show();
			
			Image obstaculo2 = new Image("obs1.jpg");
			autos1 = new ImageView[5];
	    	for(int i=0;i<autos1.length;i++) {
	    		mostrarObstaculo2 = new ImageView();
				mostrarObstaculo2.setImage(obstaculo2);
				mostrarObstaculo2.setLayoutX(aleatorio.PosicionX());
				mostrarObstaculo2.setLayoutY(aleatorio.PosicionY());
	    		autos1[i] = mostrarObstaculo2;
	    		autoRojo = new TranslateTransition();
	    		autoRojo.setNode(mostrarObstaculo2);
				autoRojo.setDuration(Duration.millis(aleatorio.Tiempo()));
				autoRojo.setByX(0);
				autoRojo.setByY(500.1);
				autoRojo.setCycleCount(Animation.INDEFINITE);
				autoRojo.setAutoReverse(false);
				autoRojo.play();
			root.getChildren().addAll(mostrarObstaculo2);

				}
		
		Image obstaculo=new Image("obs3.jpg");
		autos2 = new ImageView[5];
		for(int i=0;i<autos2.length;i++) {
			mostrarObstaculo=new ImageView();
			mostrarObstaculo.setImage(obstaculo);
			mostrarObstaculo.setLayoutX(aleatorio.PosicionX());
			mostrarObstaculo.setLayoutY(aleatorio.PosicionY());
			autos2[i] = mostrarObstaculo;
			autoVerde = new TranslateTransition();
			autoVerde.setNode(mostrarObstaculo);
			autoVerde.setDuration(Duration.millis(aleatorio.Tiempo()));
			autoVerde.setByX(0);
			autoVerde.setByY(500.1);
			autoVerde.setCycleCount(Animation.INDEFINITE);
			autoVerde.setAutoReverse(false);
			autoVerde.play();
		root.getChildren().addAll(mostrarObstaculo);
		}
		
		Image persona=new Image("persona 3.jpg");
		peatones = new ImageView[2];
		
		mostrarPersona=new ImageView();
		mostrarPersona.setImage(persona);
		mostrarPersona.setFitHeight(60);
		mostrarPersona.setFitWidth(40);
		mostrarPersona.setLayoutX(aleatorio.PosicionX()-400);
		mostrarPersona.setLayoutY(aleatorio.PosicionY());
		
		personaVerde=new TranslateTransition();
		personaVerde.setDuration(Duration.millis(5000));
		personaVerde.setNode(mostrarPersona);
		personaVerde.setByX(500);
		personaVerde.setByY(451);
		personaVerde.setCycleCount(10);
		personaVerde.setAutoReverse(false);
		personaVerde.play();
		
		root.getChildren().addAll(mostrarPersona);
	
		
		Image jugador=new Image("JUGADOR.jpg");
		mostrarJugador=new ImageView();
		mostrarJugador.setImage(jugador);
		//posicion inicial jugador
		mostrarJugador.setLayoutX(250);
		mostrarJugador.setLayoutY(400);
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
		{
			@Override
				public void handle(KeyEvent ke) {
		
				if(ke.getCode()== KeyCode.RIGHT) {
					mx=mx+10;
					mostrarJugador.setTranslateX(mx);
				}
                if(ke.getCode()== KeyCode.LEFT) {
					mx=mx-10;
					mostrarJugador.setTranslateX(mx);
				}
                if(ke.getCode()== KeyCode.UP) {
                	my=my-10;
                	mostrarJugador.setTranslateY(my);
				}
                if(ke.getCode()== KeyCode.DOWN) {
                	my=my+10;
                	mostrarJugador.setTranslateY(my);
                }
                if(mx>180||mx<-210) {
                	
                	System.out.println("LIMITE"+mx);
    				Colision lose=new Colision();
    				lose.Perdiste(juegoStage);
    			}
                
			}
			
		});
		root.getChildren().addAll(mostrarJugador);
		
		contador=new AnimationTimer() {

			@Override
			public void handle(long arg0) {
				Actualizar(); 
			}
		};
		contador.start();
		
	}

	public void Actualizar() {
		for(int i=0;i<autos1.length;i++) {
			if(autos1[i].getTranslateY() > 500.0) {
				System.out.println("bgfxbxf");
				autos1[i].setTranslateY(aleatorio.PosicionY());
				autos1[i].setLayoutX(aleatorio.PosicionX());
				
			}
			if(autos1[i].getBoundsInParent().intersects(mostrarJugador.getBoundsInParent())) {
				Colision lose=new Colision();
				lose.Perdiste(juegoStage);
				contador.stop();
			}
		}
		for(int j=0;j<autos2.length;j++) {
			if(autos2[j].getTranslateY() > 500.0) {
				autos2[j].setTranslateY(aleatorio.PosicionY());
				autos2[j].setLayoutX(aleatorio.PosicionX());
				
			}
			if(autos2[j].getBoundsInParent().intersects(mostrarJugador.getBoundsInParent())) {
				Colision lose=new Colision();
				lose.Perdiste(juegoStage);
				contador.stop();
			}
		}
		for(int j=0;j<1000;j++) {
			if(mostrarPersona.getTranslateY() > 450.0) {
				mostrarPersona.setTranslateY(aleatorio.PosicionY()-400);
				mostrarPersona.setLayoutX(0);
			}
			if(mostrarPersona.getBoundsInParent().intersects(mostrarJugador.getBoundsInParent())) {
				Colision lose=new Colision();
				lose.Perdiste(juegoStage);
				contador.stop();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
}
