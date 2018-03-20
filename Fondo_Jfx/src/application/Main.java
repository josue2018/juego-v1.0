package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
			Group root = new Group();
			Scene scene = new Scene(root,500,500);
			
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			//Aleatorio ale=new Aleatorio();
			
			Image fondo=new Image("file:///C:/Users/usuario/eclipse-workspace/Fondo_Jfx/src/application/images2.jpg");
			ImageView mostrar=new ImageView();
			mostrar.setImage(fondo);
			
			mostrar.setFitWidth(500);
			mostrar.setFitHeight(500);
			
			Button botonIngresar=new Button("INGRESAR AL JUEGO");
			botonIngresar.setFont(Font.font("verdana",FontWeight.NORMAL, FontPosture.REGULAR,18));
			botonIngresar.setLayoutX(250);
			botonIngresar.setLayoutY(250);
			
			Button botoncreditos=new Button("CREDITOS");
			botoncreditos.setLayoutX(250);
			botoncreditos.setLayoutY(290);
			
			Button botonSalir=new Button("SALIR");
			
			botonSalir.setLayoutX(250);
			botonSalir.setLayoutY(320);
			botonSalir.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{

						@Override
						public void handle(MouseEvent arg0) {
							System.exit(0);
							
						}});
			
			botoncreditos.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{

						@Override
						public void handle(MouseEvent event) {
							// TODO Auto-generated method stub
							/////EN CONTRUCCION
							
						}
				
					});
			
			
			botonIngresar.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()
					{

						@Override
						public void handle(MouseEvent event) {
							// TODO Auto-generated method stub
							
							Escenario e1=new Escenario();
							e1.MostrarEscenario(primaryStage);
							
						}
				
					}
			        );
			
			
			root.getChildren().addAll(mostrar,botonIngresar,botoncreditos,botonSalir);
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
