package application;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Menu {
	public void MenuPrincipal(Stage primaryStage){
		Group root = new Group();
		Scene scene = new Scene(root,500,500);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Image Fondo=new Image("Contraruta.jpg");
		ImageView mostrarFondo=new ImageView();
		mostrarFondo.setImage(Fondo);
		
		mostrarFondo.setFitWidth(500);
		mostrarFondo.setFitHeight(500);
		
		Button botonIngresar=new Button("INGRESAR AL JUEGO");
		botonIngresar.setFont(Font.font("verdana",FontWeight.NORMAL,FontPosture.REGULAR,18));
		botonIngresar.setLayoutX(250);
		botonIngresar.setLayoutY(250);
		
		Button botonCreditos=new Button("Creditos");
		botonCreditos.setLayoutX(250);
		botonCreditos.setLayoutY(290);
		
		Button botonSalir=new Button("Salir");
		botonSalir.setLayoutX(250);
		botonSalir.setLayoutY(320);
		
		botonIngresar.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent event) {
				
				Escenario j1=new Escenario();
				j1.Escenario(primaryStage);
				
			}
			
		});
		botonCreditos.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent arg0) {
				
			Creditos c1=new Creditos();
			c1.Creadores(primaryStage);
			
			}
		});
		
		botonSalir.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent arg0) {
				
				System.exit(0);
			}
			
		});
		
		root.getChildren().addAll(mostrarFondo,botonIngresar,botonCreditos,botonSalir);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
