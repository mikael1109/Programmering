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
import javafx.scene.shape.Polygon;
import javafx.scene.Group;

public class Flags {

	public void Flags() {
		tchad();
		bangladesh();
		colombia();
		danmark();
		djibouti();
	}

	/**
	 * Skapar tre rektanglar och placerar dem med borderpane.
	 */
	public void tchad() {
		BorderPane border = new BorderPane();
		Scene tchadScene = new Scene(border, 320, 180);
		Stage tchad = new Stage();
		tchad.setTitle("Tchad/Rumänien");
		tchad.setScene(tchadScene);
		tchad.setResizable(false);
		tchad.show();

		Rectangle left = new Rectangle();
		left.setFill(Color.DARKSLATEBLUE);
		left.setWidth(110);
		left.setHeight(200);
		border.setLeft(left);
		Rectangle mid = new Rectangle();
		mid.setFill(Color.YELLOW);
		mid.setWidth(111);
		mid.setHeight(200);
		border.setCenter(mid);
		Rectangle right = new Rectangle();
		right.setFill(Color.RED);
		right.setWidth(110);
		right.setHeight(200);
		border.setRight(right);
	}

	/**
	 * Gör bakgrunden grön och placerar sen cirkeln med gridpane
	 */
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
		bangladesh.setResizable(false);
		bangladesh.show();

		Circle circle = new Circle();
		circle.setFill(Color.ORANGERED);
		circle.setRadius(55);
		grid.add(circle, 3, 1);
	}

	/**
	 * Skapar 3 rektanglar där den över är större än de andra två och placerar de
	 * sen med borderpane
	 */
	public void colombia() {
		BorderPane border = new BorderPane();
		Scene colombiaScen = new Scene(border, 320, 180);
		Stage colombia = new Stage();
		colombia.setTitle("Colombia");
		colombia.setScene(colombiaScen);
		colombia.setResizable(false);
		colombia.show();

		Rectangle top = new Rectangle();
		top.setHeight(95);
		top.setWidth(340);
		top.setFill(Color.YELLOW);
		Rectangle mid = new Rectangle();
		mid.setHeight(50);
		mid.setWidth(340);
		mid.setFill(Color.DARKBLUE);
		Rectangle bot = new Rectangle();
		bot.setHeight(50);
		bot.setWidth(340);
		bot.setFill(Color.RED);

		border.setTop(top);
		border.setCenter(mid);
		border.setBottom(bot);
	}

	/**
	 * Gör bakgrunden röd och placerar sen två rektanglar med x,y cordinater i
	 * group.
	 */
	public void danmark() {
		StackPane pane = new StackPane();
		Group group = new Group();
		pane.getChildren().add(group);
		Scene danmarkScene = new Scene(pane, 320, 180);
		Stage danmark = new Stage();
		danmark.setScene(danmarkScene);
		danmark.setTitle("Danmark");
		danmark.setResizable(false);
		danmark.show();
		pane.setStyle("-fx-background-color: #e01907;");

		Rectangle rect1 = new Rectangle(0, 80, 340, 32);
		rect1.setFill(Color.WHITE);
		Rectangle rect2 = new Rectangle(120, 0, 32, 200);
		rect2.setFill(Color.WHITE);

		group.getChildren().addAll(rect1, rect2);
	}

	/**
	 * Skapar 3 polygoner och ger de x,y punkter och lägger de sen i group.
	 */
	public void djibouti() {
		Group layout = new Group();
		Scene scene = new Scene(layout, 320, 180);
		Stage djibouti = new Stage();
		djibouti.setTitle("Djibouti");
		djibouti.setScene(scene);
		djibouti.setResizable(false);
		djibouti.show();

		Polygon tri1 = new Polygon();
		tri1.getPoints().addAll(new Double[] { 0.0, 0.0, 340.0, 0.0, 340.0, 100.0, 192.0, 100.0 });
		tri1.setFill(Color.DEEPSKYBLUE);

		Polygon tri2 = new Polygon();
		tri2.getPoints().addAll(new Double[] { 340.0, 191.0, 340.0, 100.0, 192.0, 100.0, 0.0, 191.0 });
		tri2.setFill(Color.FORESTGREEN);

		Polygon star = new Polygon();
		star.getPoints().addAll(new Double[] { 62.5, 70.0, 80.0, 110.0, 40.0, 85.0, 85.0, 85.0, 50.0, 110.0 });
		star.setFill(Color.RED);

		layout.getChildren().addAll(tri1, tri2, star);
	}

}
