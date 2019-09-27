import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Main extends Application {

	/**
	 * Startar javafx
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("restriction")
	public void start(Stage sStage) {
		Flags flag = new Flags(); // Skapar flag classen så man kan rita upp flaggan.

		// Skapar alla flaggors knappar och sätter texten på de.
		Button tchadButton = new Button();
		tchadButton.setText("Tchad");
		Button bangladeshButton = new Button();
		bangladeshButton.setText("Bangladesh");
		Button colombiaButton = new Button();
		colombiaButton.setText("Colombia");
		Button danmarkButton = new Button();
		danmarkButton.setText("Danmark");
		Button djiboutiButton = new Button();
		djiboutiButton.setText("Djibouti");

		// Sätter mellan rummet och paddingen på knapparna, sätter och en bakgrund färg.
		// allt med hbox.
		HBox hbox = new HBox();
		hbox.setSpacing(32);
		hbox.setPadding(new Insets(10, 25, 10, 25));
		hbox.setStyle("-fx-background-color: #336699;");

		// Japanska flaggan :)
		Group jLayout = new Group();
		Circle c = new Circle();
		c.setTranslateX(250);
		c.setTranslateY(300);
		c.setRadius(100);
		c.setFill(Color.RED);
		Text jText = new Text("(JAPAN)");
		jLayout.getChildren().add(c);

		// lägger knapparna på toppen och japanska flaggan under med borderpane och
		// sätter scenen och visar stagen.
		hbox.getChildren().addAll(bangladeshButton, tchadButton, colombiaButton, danmarkButton, djiboutiButton);
		BorderPane layout = new BorderPane();
		layout.setTop(hbox);
		layout.setCenter(jLayout);
		layout.setBottom(jText);
		layout.setStyle("-fx-background-color: #ffffff;");
		Scene scene = new Scene(layout, 500, 500);
		sStage.setScene(scene);
		sStage.setTitle("Flaggor");
		sStage.show();

		// Nedan för här kallas alla flaggor på efter deras knapp har blivit tryckt
		tchadButton.setOnAction(event -> {
			flag.tchad();
		});

		bangladeshButton.setOnAction(event -> {
			flag.bangladesh();
		});

		colombiaButton.setOnAction(event -> {
			flag.colombia();
		});

		danmarkButton.setOnAction(event -> {
			flag.danmark();
		});
		
		djiboutiButton.setOnAction(event ->{
			flag.djibouti();
		});
	}

}
