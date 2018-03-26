package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,500,500);
			int y1=5;
			int x2=5;
			for(int i=0;i<=500;i++) {
				Line car=new Line(0,y1,x2,500);
				Line car2=new Line(y1,0,500,x2);
				y1=y1+10;
				x2=x2+10;
				root.getChildren().addAll(car,car2);
				car.setStroke(Color.BLUEVIOLET);
				car2.setStroke(Color.RED);
				scene.setFill(Color.CORNSILK);
			}
			
			Text t=new Text(180,230,"Proyecto\nProgramación I");
			t.setFont(new Font(20));
			t.setTextAlignment(TextAlignment.CENTER);
			
			root.getChildren().addAll(t);
			
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
	{
		
	}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
