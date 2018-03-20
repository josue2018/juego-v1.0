package application;

import java.util.Random;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Escenario {
	
	/*Aleatorio ale=new Aleatorio();
	double X=ale.PosicionX();
	double Y=ale.PosicionY();*/
	
	int mx=250,my=400;
	
	public void MostrarEscenario(Stage Stage2)
	{
		
		Pane root=new Pane();
		
		Scene scene = new Scene(root,500,500);
		
		
		
		Image fondo=new Image("file:///C:/Users/usuario/eclipse-workspace/Fondo_Jfx/src/application/FONDOFINAL.jpg");
		ImageView mostrar2=new ImageView();
		mostrar2.setImage(fondo);
		
		mostrar2.setFitWidth(500);
		mostrar2.setFitHeight(500);
		
		root.getChildren().addAll(mostrar2);
		Stage2.setScene(scene);
		Stage2.show();
		
		for(int i=0;i<=5;i++){
			/*Random aleatorio=new Random();
			int X=aleatorio.nextInt(300);
			int Y=aleatorio.nextInt(300);*/
			
			Aleatorio ale=new Aleatorio();
			double X=ale.PosicionX();
			double Y=ale.PosicionY();
			
			
			Image cars=new Image("file:///C:/Users/usuario/eclipse-workspace/Fondo_Jfx/src/application/obs1.jpg");
			ImageView cv=new ImageView();
			
			cv.setImage(cars);
			cv.setTranslateX(X);
			cv.setTranslateY(Y);
			
			root.getChildren().addAll(cv);
			}
		
		
		
		Image jugador=new Image("file:///C:/Users/usuario/eclipse-workspace/Fondo_Jfx/src/application/JUGADOR.jpg");
		ImageView mostrar3=new ImageView();
		mostrar3.setImage(jugador);
		
		mostrar3.setTranslateX(mx);
		mostrar3.setTranslateY(my);
		root.getChildren().addAll(mostrar3);
		
		
		scene.setOnKeyPressed(event ->{ 
			
				if(event.getCode()== KeyCode.RIGHT) {
					
					mx=mx+10;
					mostrar3.setTranslateX(mx);
					
				}
                if(event.getCode()== KeyCode.LEFT) {
					
					mx=mx-10;
					mostrar3.setTranslateX(mx);
					
				}
                if(event.getCode()== KeyCode.UP) {
					
                	my=my-10;
					mostrar3.setTranslateY(my);
					
				}
                if(event.getCode()== KeyCode.DOWN) {
                	my=my+10;
                	mostrar3.setTranslateY(my);
                }
			
		});
		
		 root.getChildren().addAll(mostrar3); 

	}}
	