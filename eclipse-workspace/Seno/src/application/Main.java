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
		//Seno
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,500,500);
			Line y1=new Line(10,10,10,490);
			Line x1=new Line(10,250,490,250);
			root.getChildren().addAll(x1,y1);
			double PI=3.14159265;
			double  y;
			for(double x=10/20;x<=500;x=x+0.02)
			{
				y=Math.sin(x)*20+250;
				
				Circle circulo=new Circle(x*20,y,3);
				root.getChildren().addAll(circulo);
				
			}
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
