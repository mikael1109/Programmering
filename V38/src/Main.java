import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("restriction")
	public void start(Stage sStage) {
		Flags flag = new Flags();
		sStage.setTitle("Flaggor");
		
		Button tchadButton = new Button();
		tchadButton.setText("Tchad");
		Button bangladeshButton = new Button();
		bangladeshButton.setText("Bangladesh");
		Button colombiaButton = new Button();
		colombiaButton.setText("Colombia");
		Button danmarkButton = new Button();
		danmarkButton.setText("Danmark");
		
		HBox hbox = new HBox();
		hbox.setSpacing(30);
		hbox.setPadding(new Insets(15 ,10 ,15 ,10));
		hbox.setStyle("-fx-background-color: #336699;");
		hbox.getChildren().addAll(bangladeshButton, tchadButton, colombiaButton, danmarkButton);
		
		BorderPane layout = new BorderPane();
		layout.setTop(hbox);
		Scene scene = new Scene(layout, 500, 500);
		sStage.setScene(scene);
		sStage.show();

		tchadButton.setOnAction(event -> {
			flag.tchad();
		});
		
		bangladeshButton.setOnAction(event ->{
			flag.bangladesh();
		});
		
		colombiaButton.setOnAction(event ->{
			flag.colombia();
		});
		
		danmarkButton.setOnAction(event ->{
			flag.danmark();
		});
	}

}
