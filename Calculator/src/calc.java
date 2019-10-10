import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.BorderWidths;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

public class calc extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage sStage) {
		
		GridPane layout = new GridPane();
		Button ett = new Button();
		ett.setText("1");
		ett.setMinSize(150, 150);
		Button tva = new Button();
		tva.setText("2");
		tva.setMinSize(150, 150);
		Button tre = new Button();
		tre.setText("3");
		tre.setMinSize(150, 150);
		Button fyra = new Button();
		fyra.setText("4");
		fyra.setMinSize(150, 150);
		Button fem = new Button();
		fem.setText("5");
		fem.setMinSize(150, 150);
		Button sex = new Button();
		sex.setText("6");
		sex.setMinSize(150, 150);
		Button sju = new Button();
		sju.setText("7");
		sju.setMinSize(150, 150);
		Button atta = new Button();
		atta.setText("8");
		atta.setMinSize(150, 150);
		Button nio = new Button();
		nio.setText("9");
		nio.setMinSize(150, 150);
		
		layout.setHgap(10);
		layout.setVgap(10);
		layout.setMinSize(500, 500);
		layout.add(ett, 0, 1);
		layout.add(tva, 1, 1);
		layout.add(tre, 2, 1);
		layout.add(fyra, 0, 2);
		layout.add(fem, 1, 2);
		layout.add(sex, 2, 2);
		layout.add(sju, 0, 3);
		layout.add(atta, 1, 3);
		layout.add(nio, 2, 3);
		layout.setAlignment(Pos.CENTER);
		
		TextField field = new TextField();
		field.setMinWidth(500);
		field.setMaxWidth(500);
		field.setMinHeight(75);
		field.setMaxHeight(75);
		field.setEditable(false);
		
		BorderPane border = new BorderPane();
		border.setTop(field);
		border.setCenter(layout);
		border.setAlignment(field, Pos.CENTER);
		
		Scene mainScene = new Scene(border, 600, 600);
		sStage.setScene(mainScene);
		sStage.setTitle("Calculator");
		sStage.setResizable(false);
		sStage.show();
	}

}
