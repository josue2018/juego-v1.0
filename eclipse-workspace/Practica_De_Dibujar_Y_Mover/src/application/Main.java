package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,700,700);
			
			Personaje p1=new Personaje();
			p1.Pj();
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setScene(scene);
			primaryStage.show();
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				
			
					
				
				int x=0,y=0;
				int x1=0,y1=0;

				public void handle(KeyEvent ke) {
		                
	                    if (ke.getCode() == KeyCode.RIGHT) {
	                    	Line body=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Circle head=new Circle(150+x,150+y,4);
	        				
	        				Rectangle rect=new Rectangle(100+x,300+y,80,80);
	        				rect.setFill(Color.WHITE);
	        				root.getChildren().addAll(rect);
	        				
	        				root.getChildren().addAll(body,Lhand,Rhand,Rfeed,Lfeed,head);

	                        primaryStage.show();
	                        x=x+5;
	                    }
	                    if (ke.getCode() == KeyCode.UP) {
	                    	Line body=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Circle head=new Circle(150+x,150+y,4);
	        				
	        				Rectangle rect=new Rectangle(100+x,300+y,80,80);
	        				rect.setFill(Color.WHITE);
	        				root.getChildren().addAll(rect);
	        				
	        				root.getChildren().addAll(body,Lhand,Rhand,Rfeed,Lfeed,head);
	                        primaryStage.show();
	                        y=y-5;
	                    }
	                    if (ke.getCode() == KeyCode.LEFT) {
	                    	Line body=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Circle head=new Circle(150+x,150+y,4);
	        				
	        				Rectangle rect=new Rectangle(100+x,300+y,80,80);
	        				rect.setFill(Color.WHITE);
	        				root.getChildren().addAll(rect);
	        				
	        				root.getChildren().addAll(body,Lhand,Rhand,Rfeed,Lfeed,head);
	                        primaryStage.show();
	                        x=x-5;
	                    }
	                    if (ke.getCode() == KeyCode.DOWN) {
	                    	Line body=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rhand=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Rfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Line Lfeed=new Line(150+x,150+y,150+x1,150+y1);
	        				Circle head=new Circle(150+x,150+y,4);
	        				
	        				Rectangle rect=new Rectangle(100+x,300+y,80,80);
	        				rect.setFill(Color.WHITE);
	        				root.getChildren().addAll(rect);
	        				
	        				root.getChildren().addAll(body,Lhand,Rhand,Rfeed,Lfeed,head);

	                        primaryStage.show();
	                        y=y+5;
	                    }
	                   
	                   // root.getChildren().addAll(p1.Pj());
	                    primaryStage.show();
	                }
	            });

	            scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
	                public void handle(KeyEvent ke) {
	                    System.out.println("Key Released: " + ke.getText());
	                }
	            });


	         
	            //root.getChildren().addAll(p1.Pj());
	            primaryStage.setScene(scene);
	            primaryStage.show();

	    }
	
	
	public static void main(String[] args) {
		launch(args);
		
	}
		
	
}
