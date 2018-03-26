//Movimiento por teclado
package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
@Override
public void start(Stage primaryStage) {

Group root = new Group();
Scene scene = new Scene(root, 700, 700);
Image image = new Image("file:///C:/Users/usuario/eclipse-workspace/Animacion_Por_Teclado/src/application/Homer.gif");
Image image1 = new Image("file:///C:/Users/usuario/eclipse-workspace/Animacion_Por_Teclado/src/application/hamburguer.png");
ImageView iv1=new ImageView();

iv1.setImage(image1);
iv1.setTranslateX(400);
iv1.setTranslateY(20);

root.getChildren().addAll(iv1);
primaryStage.show();

scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
int x=0,y=0;

public void handle(KeyEvent ke) {

if (ke.getCode() == KeyCode.RIGHT) {

ImageView iv=new ImageView();

iv.setImage(image);
iv.setTranslateX(100+x);
iv.setTranslateY(300+y);

Rectangle rect=new Rectangle(100+x,300+y,100,100);
rect.setFill(Color.WHITE);
root.getChildren().addAll(rect);


root.getChildren().addAll(iv);
primaryStage.show();

x=x+10;
}
if (ke.getCode() == KeyCode.UP) {

ImageView iv=new ImageView();
Rectangle rect=new Rectangle(100+x,300+y,100,100);
rect.setFill(Color.WHITE);

iv.setImage(image);

root.getChildren().addAll(rect);
iv.setTranslateX(100+x);
iv.setTranslateY(300+y);

root.getChildren().addAll(iv);
primaryStage.show();

y=y-10;
}
if (ke.getCode() == KeyCode.LEFT) {

ImageView iv=new ImageView();
iv.setImage(image);

Rectangle rect=new Rectangle(100+x,300+y,100,100);
rect.setFill(Color.WHITE);
root.getChildren().addAll(rect);

iv.setTranslateX(100+x);
iv.setTranslateY(300+y);

root.getChildren().addAll(iv);
primaryStage.show();

x=x-10;


}
if (ke.getCode() == KeyCode.DOWN) {

ImageView iv=new ImageView();
iv.setImage(image);

Rectangle rect=new Rectangle(100+x,300+y,100,100);
rect.setFill(Color.WHITE);
root.getChildren().addAll(rect);

iv.setTranslateX(100+x);
iv.setTranslateY(300+y);

root.getChildren().addAll(iv);
primaryStage.show();
y=y+10;
}
if (x>=400)
{
System.out.println("colixion");
Circle circleR=new Circle(400,200,150);
circleR.setFill(Color.RED);

root.getChildren().add( circleR);
primaryStage.show();
}

}
});
primaryStage.setScene(scene);
primaryStage.show();

}
public static void main(String[] args) {
launch(args);
}
}