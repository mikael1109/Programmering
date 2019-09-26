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

public class Flags extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("restriction")
	public void start(Stage sStage) {
		sStage.setTitle("Flaggor");
		
		Button tchadButton = new Button();
		tchadButton.setText("Tchad");
		Button bangladeshButton = new Button();
		bangladeshButton.setText("Bangladesh");
		Button colombiaButton = new Button();
		colombiaButton.setText("Colombia");
		
		HBox hbox = new HBox();
		hbox.setSpacing(30);
		hbox.setPadding(new Insets(15 ,10 ,15 ,10));
		hbox.setStyle("-fx-background-color: #336699;");
		hbox.getChildren().addAll(bangladeshButton, tchadButton, colombiaButton);
		
		BorderPane layout = new BorderPane();
		layout.setTop(hbox);
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
		
		bangladeshButton.setOnAction(event ->{
			GridPane grid = new GridPane();
			grid.setHgap(20);
			grid.setVgap(25);
			grid.setPadding(new Insets(10, 10, 10, 10));
			grid.setStyle("-fx-background-color: #456342;");
			
			Scene bangladeshScene = new Scene(grid, 320, 180);
			Stage bangladesh = new Stage();
			bangladesh.setTitle("Bangladesh");
			bangladesh.setScene(bangladeshScene);
			bangladesh.show();
			
			Circle circle = new Circle();
			circle.setFill(Color.ORANGERED);
			circle.setRadius(55);
			grid.add(circle, 3, 1);
		});
	}

}
