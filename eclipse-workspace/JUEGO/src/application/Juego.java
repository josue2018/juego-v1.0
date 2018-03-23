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
	
	Pane root=new Pane();
	public void Escenario(Stage Stage2) {
		
		
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
			
			Image obstaculo2=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/obs1.jpg");
			mostrarObstaculo2 = new ImageView();
			mostrarObstaculo2.setImage(obstaculo2);
			mostrarObstaculo2.setLayoutX(aleatorio.PosicionX());
			mostrarObstaculo2.setLayoutY(aleatorio.PosicionY());
			
			autoRojo =new TranslateTransition(Duration.seconds(10),mostrarObstaculo2);
			autoRojo.setDuration(Duration.millis(9000));
			autoRojo.setByX(0);
			autoRojo.setByY(500.01);
			autoRojo.setCycleCount(Animation.INDEFINITE);
			autoRojo.setAutoReverse(false);
			autoRojo.play();
			
			root.getChildren().addAll(mostrarObstaculo2);


		
		/*Image obstaculo=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/obs3.jpg");
		ImageView mostrarObstaculo=new ImageView();
		mostrarObstaculo.setImage(obstaculo);
		mostrarObstaculo.setLayoutX(aleatorio.PosicionX());
		mostrarObstaculo.setLayoutY(aleatorio.PosicionY());
		
		TranslateTransition a=new TranslateTransition();
		a.setDuration(Duration.millis(5000));
		a.setNode(mostrarObstaculo);
		a.setByX(0);
		a.setByY(500);
		a.setCycleCount(10);
		a.setAutoReverse(false);
		a.play();
		
		root.getChildren().addAll(mostrarObstaculo);
		
		double x=aleatorio.PosicionX();
		double y=aleatorio.PosicionY();
		Image persona=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/persona%203.jpg");
		ImageView mostrarPersona=new ImageView();
		mostrarPersona.setImage(persona);
		mostrarPersona.setFitHeight(60);
		mostrarPersona.setFitWidth(40);
		mostrarPersona.setLayoutX(x-400);
		mostrarPersona.setLayoutY(y);
		
		TranslateTransition a3=new TranslateTransition();
		a3.setDuration(Duration.millis(5000));
		a3.setNode(mostrarPersona);
		a3.setByX(500);
		a3.setByY(450);
		a3.setCycleCount(10);
		a3.setAutoReverse(false);
		a3.play();
		
		root.getChildren().addAll(mostrarPersona);*/
		
		Image jugador=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/JUGADOR.jpg");
		ImageView mostrarJugador=new ImageView();
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
    				lose.Perdiste(Stage2);
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
		int autos1[] = new int[4];
	for(int i=0;i<=autos1.length;i++) {
		
		mostrarObstaculo2.setLayoutX(aleatorio.PosicionX());
		mostrarObstaculo2.setLayoutY(aleatorio.PosicionY());
		
			}
		if(mostrarObstaculo2.getTranslateY() >= 500) {
			System.out.println("bgfxbxf");
			mostrarObstaculo2.setTranslateY(0);
			mostrarObstaculo2.setLayoutX(aleatorio.PosicionX());
		}
		
	}
	
	
	
	
	
	
	
	
}
