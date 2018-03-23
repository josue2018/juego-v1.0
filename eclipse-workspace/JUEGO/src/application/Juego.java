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

public class Juego {
	//posiciones iniciales
	int mx=0;
	int my=0;
	
	TranslateTransition autoRojo;
	ImageView mostrarObstaculo2;
	Aleatorio aleatorio;
	ImageView autos1[];
	ImageView mostrarJugador;
	Stage juegoStage;
	
	Pane root=new Pane();
	public void Escenario(Stage Stage2) {
		
		juegoStage = Stage2;
		Scene scene=new Scene(root,500,500);
		aleatorio = new Aleatorio();
		
		Image fondo=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/FONDOFINAL.jpg");
		ImageView mostrarFondo=new ImageView();
		mostrarFondo.setImage(fondo);
		mostrarFondo.setFitWidth(500);
		mostrarFondo.setFitHeight(500);
		root.getChildren().addAll(mostrarFondo);
		Stage2.setScene(scene); 
		Stage2.show();
			
			Image obstaculo2 = new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/obs1.jpg");
			
			
			
			
			
			autos1 = new ImageView[5];
	    	for(int i=0;i<autos1.length;i++) {
	    		mostrarObstaculo2 = new ImageView();
				mostrarObstaculo2.setImage(obstaculo2);
				mostrarObstaculo2.setLayoutX(aleatorio.PosicionX());
				mostrarObstaculo2.setLayoutY(aleatorio.aparicionAleatoria());
	    		autos1[i] = mostrarObstaculo2;
	    		autoRojo = new TranslateTransition(Duration.seconds(10),mostrarObstaculo2);
				autoRojo.setDuration(Duration.millis(3000));
				autoRojo.setByX(0);
				autoRojo.setByY(500.1);
				autoRojo.setCycleCount(Animation.INDEFINITE);
				autoRojo.setAutoReverse(false);
				autoRojo.play();
			root.getChildren().addAll(mostrarObstaculo2);

				}
		
		/*Image obstaculo=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/obs3.jpg");
		ImageView mostrarObstaculo=new ImageView();
		mostrarObstaculo.setImage(obstaculo);
		mostrarObstaculo.setLayoutX(aleatorio.PosicionX());
		mostrarObstaculo.setLayoutY(aleatorio.PosicionY());
		
		TranslateTransition autoVerde = new TranslateTransition();
		autoVerde.setDuration(Duration.millis(5000));
		autoVerde.setNode(mostrarObstaculo);
		autoVerde.setByX(0);
		autoVerde.setByY(500);
		autoVerde.setCycleCount(10);
		autoVerde.setAutoReverse(false);
		autoVerde.play();
		
		root.getChildren().addAll(mostrarObstaculo);
		
	    //double x=aleatorio.PosicionX();
		//double y=aleatorio.PosicionY();
		Image persona=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/persona%203.jpg");
		ImageView mostrarPersona=new ImageView();
		mostrarPersona.setImage(persona);
		mostrarPersona.setFitHeight(60);
		mostrarPersona.setFitWidth(40);
		mostrarPersona.setLayoutX(aleatorio.PosicionX()-400);
		mostrarPersona.setLayoutY(aleatorio.PosicionY());
		
		TranslateTransition personaVerde=new TranslateTransition();
		personaVerde.setDuration(Duration.millis(5000));
		personaVerde.setNode(mostrarPersona);
		personaVerde.setByX(500);
		personaVerde.setByY(450);
		personaVerde.setCycleCount(10);
		personaVerde.setAutoReverse(false);
		personaVerde.play();
		
		root.getChildren().addAll(mostrarPersona);*/
		
		Image jugador=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/JUGADOR.jpg");
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
			
		});root.getChildren().addAll(mostrarJugador);
		
		AnimationTimer contador=new AnimationTimer() {

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
				autos1[i].setTranslateY(aleatorio.aparicionAleatoria());
				autos1[i].setLayoutX(aleatorio.PosicionX());
			}
			if(autos1[i].getBoundsInParent().intersects(mostrarJugador.getBoundsInParent())) {
				Colision lose=new Colision();
				lose.Perdiste(juegoStage);
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
}
