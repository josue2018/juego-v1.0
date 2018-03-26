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
			double PI=3.14159265;
			double  x;
			for(int y=240;y<=260;y++)
			{
				x=Math.cos(y-250)+PI*3;
				
				Circle circulo=new Circle(x,y,5);
				root.getChildren().addAll(circulo);
				
			}
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}
	
	
	public static void main(String[] args) {
		launch(args);
		


	}
}
