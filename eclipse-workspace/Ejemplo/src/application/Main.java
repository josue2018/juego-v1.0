package application;

//import com.sun.javafx.perf.PerformanceTracker;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class Main extends Application {
public static final double SCENE_WIDTH = 300;
public static final double SCENE_HEIGHT = 250;
public static final double BALL_RADIUS = 10;
public static double ballSpeed = 10;
@Override
public void start(Stage primaryStage) {
Group root = new Group();
// Bola que se usará para la animación
Circle ball = new Circle(BALL_RADIUS);
ball.setTranslateX(SCENE_WIDTH * 0.5);
ball.setTranslateY(SCENE_HEIGHT * 0.5);
root.getChildren().addAll(ball);

// Etiqueta que mostrará el valor de frames por segundo (FPS)
Label label = new Label();
label.setTranslateX(10);
label.setTranslateY(10);
root.getChildren().addAll(label);

Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
primaryStage.setScene(scene);
primaryStage.show();
// Game loop usando AnimationTimer
AnimationTimer animationTimer = new AnimationTimer() {
public void handle(long now) {
// Mostrar la frecuencia de refresco FPS
//PerformanceTracker perfTracker = PerformanceTracker.getSceneTracker(scene);
//label.setText("FPS (AnimationTimer) = " + perfTracker.getInstantFPS());
// Cambiar la dirección de la bola si llega a los extremos
if(ball.getTranslateX() < 0 || ball.getTranslateX() > SCENE_WIDTH) {
ballSpeed *= -1;
} 
ball.setTranslateX(ball.getTranslateX() + ballSpeed);
}
};
animationTimer.start();
}
public static void main(String[] args) {
launch(args);
}
}