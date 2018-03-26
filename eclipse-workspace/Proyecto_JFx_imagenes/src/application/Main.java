package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	Image imagen=new Image("file:///C:/Users/usuario/eclipse-workspace/Proyecto_JFx_imagenes/src/application/Homer.gif");
	Image imagen2=new Image("file:///C:/Users/usuario/eclipse-workspace/Proyecto_JFx_imagenes/src/application/hamburguer.png");
	
	
	@Override
	public void start(Stage primaryStage) {
		
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1000,700);
			int y=0;
			for(int x=0;x<=1000;x+=10)
			{
				
			}
				
				
			ImageView iv=new ImageView();
			
			iv.setImage(imagen);
			//iv.
			//iv.setImage(imagen2);
			root.getChildren().addAll(iv);
			
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
