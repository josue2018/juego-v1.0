package application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Creditos {
	public void Creadores(Stage creditos) {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,500,500);
		
		Image fondo = new Image("CREADORES.jpg");
		ImageView mostrarFondo = new ImageView();
		mostrarFondo.setImage(fondo);
		mostrarFondo.setFitWidth(500);
		mostrarFondo.setFitHeight(500);
		
		
		root.getChildren().addAll(mostrarFondo);
		creditos.setScene(scene);
		creditos.show();
	}

}
