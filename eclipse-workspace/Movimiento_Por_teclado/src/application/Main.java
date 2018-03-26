//animacion por teclado
package application;
    
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        
       Circle circle=new Circle(150,150,3);
         Group root = new Group();
            Scene scene = new Scene(root, 600, 650);

    
            

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                int x=0,y=0;
            
                
                public void handle(KeyEvent ke) {
                
                    if (ke.getCode() == KeyCode.RIGHT) {
                        ///
                        Circle circle=new Circle(150+x,150+y,3);
                        System.out.println("derecha");
                    root.getChildren().add( circle);
                        primaryStage.show();
                        x=x+5;
                    }
                    if (ke.getCode() == KeyCode.UP) {
                        ///
                        
                        Circle circle=new Circle(150+x,150+y,3);
                        System.out.println("derecha");
                        root.getChildren().add( circle);
                        primaryStage.show();
                        y=y-5;
                    }
                    if (ke.getCode() == KeyCode.LEFT) {
                        Circle circle=new Circle(150+x,150+y,3);
                        System.out.println("derecha");
                        root.getChildren().add( circle);
                        primaryStage.show();
                        x=x-5;
                    }
                    if (ke.getCode() == KeyCode.DOWN) {
                        ///
                        Circle circle=new Circle(150+x,150+y,3);
                        System.out.println("derecha");
                        root.getChildren().add( circle);
                        primaryStage.show();
                        y=y+5;
                    }
                   
                    root.getChildren().add( circle);
                    primaryStage.show();
                }
            });

            scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent ke) {
                    System.out.println("Key Released: " + ke.getText());
                }
            });


         
             root.getChildren().add(circle);
            primaryStage.setScene(scene);
            primaryStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
