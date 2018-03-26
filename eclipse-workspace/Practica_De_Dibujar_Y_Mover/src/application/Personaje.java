package application;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Personaje {
	BorderPane root = new BorderPane();
	
	public void Pj() {
		
		//Scene scene = new Scene(root, 700, 700);
		Group root = new Group();
		Line body=new Line(350,660,350,650);
		Line Lhand=new Line(350,656,346,653);
		Line Rhand=new Line(350,656,354,653);
		Line Rfeed=new Line(350,660,354,663);
		Line Lfeed=new Line(350,660,346,663);
		Circle head=new Circle(346,646,4);
		root.getChildren().addAll(body,Lhand,Rhand,Rfeed,Lfeed,head);
		
	}
}
	
		
	
			
		

		

	
	


