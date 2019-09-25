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
			Scene tchadScene = new Scene(tchadLayout, 320, 180);
			Stage tchad = new Stage();
			tchad.setTitle("Tchad/Rumänien");
			tchad.setScene(tchadScene);
			tchad.show();
			
			BorderPane border = new BorderPane();
			Rectangle left = new Rectangle();
			left.setFill(Color.DARKSLATEBLUE);
			left.setWidth(106);
			left.setHeight(180);
			border.setLeft(left);
			Rectangle mid = new Rectangle();
			mid.setFill(Color.YELLOW);
			mid.setWidth(107);
			mid.setHeight(180);
			border.setCenter(mid);
			Rectangle right = new Rectangle();
			right.setFill(Color.RED);
			right.setWidth(106);
			right.setHeight(180);
			border.setRight(right);
			tchadLayout.getChildren().add(border);

		});
	}

}
