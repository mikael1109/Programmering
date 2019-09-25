import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Flags extends Application{

	Button button;
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage sStage) {
		sStage.setTitle("Flaggor");
		button = new Button();
		button.setText("Tchad");
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,500,500);
		sStage.setScene(scene);
		sStage.show();
	}

}
