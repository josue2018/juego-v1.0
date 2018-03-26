package application;
	
import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
					BorderPane root = new BorderPane();
			Scene scene = new Scene(root,500,500);
			//Line y1=new Line(250,10,250,490);
			//Line x1=new Line(10,250,490,250);
			//root.getChildren().addAll(x1,y1);
			
			double  y=250;
			for(int x=10;x<=490;x+=20)
			{
				
				Circle circulo=new Circle(x,y,5);
				
				
				circulo.setFill(Color.BLACK);
				root.getChildren().addAll(circulo);
				circulo.setFill(Color.WHITE);
				
			}
			for(int x=0;x<=360;x++)
			{
				y=-Math.pow((x-250)*0.3,2)+250;
				
				Circle circulo=new Circle(x,y,2);
				//root.getChildren().addAll(circulo);
				
			}
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}
	
	
	public static void main(String[] args) {
		launch(args);
		


	}
}
