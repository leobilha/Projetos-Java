package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox)FXMLLoader.load(getClass().getResource("calc.fxml"));
			
			Bounds bounds = root.getBoundsInLocal();
		    double startX = bounds.getMaxX();
		    double startY = (bounds.getMaxY() - bounds.getMinY()) /2;

			
		    /*Line line = new Line(startX+20, startY-30, startX+200, startY-100);   
		    line.setStrokeWidth(2); 
		    line.setStroke(Color.SADDLEBROWN); 
		    
		    root.getChildren().addAll(line);*/
		    
			Scene scene = new Scene(root,320,240);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
