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
		
			Menu start=new Menu();
			start.MenuPrincipal(primaryStage);
			System.out.println("hola");
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
