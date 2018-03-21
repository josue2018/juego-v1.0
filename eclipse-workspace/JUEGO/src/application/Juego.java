package application;

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

public class Juego {
	
	int mx=250;
	int my=400;
	
	public void Escenario(Stage Stage2) {
		
		Pane root=new Pane();
		Scene scene=new Scene(root,500,500);
		
		Image fondo=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/FONDOFINAL.jpg");
		ImageView mostrarFondo=new ImageView();
		mostrarFondo.setImage(fondo);
		mostrarFondo.setFitWidth(500);
		mostrarFondo.setFitHeight(500);
		
		root.getChildren().addAll(mostrarFondo);
		Stage2.setScene(scene); 
		Stage2.show();
		Button botonVolver=new Button("<-BACK");
		botonVolver.setLayoutX(250);
		botonVolver.setLayoutY(280);
		botonVolver.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent arg0) {
				
				Main volver=new Main();
				volver.start(Stage2);
			}
			
		});root.getChildren().addAll(botonVolver);
		for(int i=0;i<=5;i++) {
			
		Aleatorio ale=new Aleatorio();
		double x=ale.PosicionX();
		double y=ale.PosicionY();
		
		Image obstaculo=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/obs3.jpg");
		ImageView mostrarObstaculo=new ImageView();
		mostrarObstaculo.setImage(obstaculo);
		mostrarObstaculo.setLayoutX(x);
		mostrarObstaculo.setLayoutY(y);
		
		TranslateTransition a=new TranslateTransition();
		a.setDuration(Duration.millis(2700));
		a.setNode(mostrarObstaculo);
		a.setByX(-10);
		a.setByY(1500);
		a.setCycleCount(10);
		a.setAutoReverse(false);
		a.play();
		
		root.getChildren().addAll(mostrarObstaculo);
		}
		
		Image jugador=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/JUGADOR.jpg");
		ImageView mostrarJugador=new ImageView();
		mostrarJugador.setImage(jugador);
		mostrarJugador.setLayoutX(mx);
		mostrarJugador.setLayoutY(my);
		
		
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
			} 
			
		});root.getChildren().addAll(mostrarJugador);
		
		
		if(mx<10||mx>490) {
			Colision borde=new Colision();
			borde.Perdiste(Stage2);	
		}
	}

}
