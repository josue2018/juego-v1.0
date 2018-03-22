package application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Colision {
	
	public void Perdiste(Stage Stage3) {
		
		Pane root=new Pane();
		Scene scene=new Scene(root,500,500);
		Stage3.setScene(scene); 
		Stage3.show();
		
		
		Image perdiste=new Image("file:///C:/Users/usuario/eclipse-workspace/JUEGO/src/application/GAME%20OVER.jpg");
		ImageView p1=new ImageView();
		p1.setImage(perdiste);
		p1.setLayoutX(150);
		p1.setLayoutY(150);
		
		Button botonVolver=new Button("<-BACK");
		botonVolver.setLayoutX(250);
		botonVolver.setLayoutY(280);
		
		botonVolver.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() 
		{

			@Override
			public void handle(MouseEvent arg0) {
				
				Main volver=new Main();
				volver.start(Stage3);
			}
			
		});
		root.getChildren().addAll(p1,botonVolver);

		
	}

}
