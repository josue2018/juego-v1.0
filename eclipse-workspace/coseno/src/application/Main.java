package application;
	
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
			Line y1=new Line(10,10,10,490);
			Line x1=new Line(10,250,490,250);
			root.getChildren().addAll(x1,y1);
			//Coseno
			
			double  y;
			for(double x=1/2;x<=500;x=x+0.02)
			{
				y=-Math.cos(x)*20+250;
				
				Circle circulo=new Circle(x*20,y,3);
				root.getChildren().addAll(circulo);
				
			}
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}
	
	
	public static void main(String[] args) {
		launch(args);
		


	}
}
