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

public class Flags {
	
	public void Flags() {
		tchad();
		bangladesh();
		colombia();
		danmark();
	}
	
	public void tchad() {
		BorderPane border = new BorderPane();
		Scene tchadScene = new Scene(border, 320, 180);
		Stage tchad = new Stage();
		tchad.setTitle("Tchad/Rumänien");
		tchad.setScene(tchadScene);
		tchad.show();
		
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
	}
	
	public void bangladesh() {
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
	}
	
	public void colombia() {
		BorderPane border = new BorderPane();
		Scene colombiaScen = new Scene(border, 320, 180);
		Stage colombia = new Stage();
		colombia.setTitle("Colombia");
		colombia.setScene(colombiaScen);
		colombia.show();
		
		Rectangle top = new Rectangle();
		top.setHeight(90);
		top.setWidth(320);
		top.setFill(Color.YELLOW);
		Rectangle mid = new Rectangle();
		mid.setHeight(45);
		mid.setWidth(320);
		mid.setFill(Color.DARKBLUE);
		Rectangle bot = new Rectangle();
		bot.setHeight(45);
		bot.setWidth(320);
		bot.setFill(Color.RED);
		
		border.setTop(top);
		border.setCenter(mid);
		border.setBottom(bot);
	}
	
	public void danmark() {
		GridPane grid = new GridPane();
		Scene danmarkScene = new Scene(grid, 320, 180);
		Stage danmark = new Stage();
		danmark.setScene(danmarkScene);
		danmark.setTitle("Danmark");
		danmark.show();
		
		grid.setStyle("-fx-background-color: #e01907;");
		grid.setHgap(36);
		grid.setVgap(36); 
		
		Rectangle rect1 = new Rectangle();
		rect1.setFill(Color.WHITE);
		rect1.setWidth(32);
		rect1.setHeight(73);
		grid.add(rect1, 5, 0);
		
		Rectangle rect2 = new Rectangle();
		rect2.setFill(Color.WHITE);
		rect2.setWidth(32);
		rect2.setHeight(73);
		grid.add(rect2, 5, 1);
		
		Rectangle rect3 = new Rectangle();
		rect3.setFill(Color.WHITE);
		rect3.setWidth(320);
		rect3.setHeight(32);
		grid.add(rect3, 0, 2);
	}

}
