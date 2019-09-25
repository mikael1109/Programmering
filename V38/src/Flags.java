import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Flags extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("restriction")
	public void start(Stage sStage) {
		sStage.setTitle("Flaggor");
		Button tchadButton = new Button();
		tchadButton.setText("Tchad");
		StackPane layout = new StackPane();
		layout.getChildren().add(tchadButton);
		Scene scene = new Scene(layout, 500, 500);
		sStage.setScene(scene);
		sStage.show();

		tchadButton.setOnAction(event -> {
			StackPane tchadLayout = new StackPane();
			Scene tchadScene = new Scene(tchadLayout, 320, 180, Color.YELLOW);
			Stage tchad = new Stage();
			tchad.setTitle("Tchad");
			tchad.setScene(tchadScene);
			tchad.show();
			tchad.setX(sStage.getX());
			tchad.setY(sStage.getY());
			
			BorderPane border = new BorderPane();
			Rectangle left = new Rectangle();
			left.setFill(Color.DARKSLATEBLUE);
			
			

		});
	}

}
