import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class calc extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage sStage) {

		functions func = new functions();

		Button ett = new Button();
		ett.setText("1");
		ett.setMinSize(100, 100);
		Button tva = new Button();
		tva.setText("2");
		tva.setMinSize(100, 100);
		Button tre = new Button();
		tre.setText("3");
		tre.setMinSize(100, 100);
		Button fyra = new Button();
		fyra.setText("4");
		fyra.setMinSize(100, 100);
		Button fem = new Button();
		fem.setText("5");
		fem.setMinSize(100, 100);
		Button sex = new Button();
		sex.setText("6");
		sex.setMinSize(100, 100);
		Button sju = new Button();
		sju.setText("7");
		sju.setMinSize(100, 100);
		Button atta = new Button();
		atta.setText("8");
		atta.setMinSize(100, 100);
		Button nio = new Button();
		nio.setText("9");
		nio.setMinSize(100, 100);
		Button clear = new Button();
		clear.setText("CLEAR");
		clear.setMinSize(450, 50);
		Button noll = new Button();
		noll.setText("0");
		noll.setMinSize(100, 100);
		Button exe = new Button();
		exe.setText("=");
		exe.setMinSize(100, 100);
		Button add = new Button();
		add.setText("+");
		add.setMinSize(100, 100);
		Button minus = new Button();
		minus.setText("-");
		minus.setMinSize(100, 100);
		Button multi = new Button();
		multi.setText("x");
		multi.setMinSize(100, 100);
		Button divide = new Button();
		divide.setText("/");
		divide.setMinSize(100, 100);
		Button dot = new Button();
		dot.setText(".");
		dot.setMinSize(100, 100);

		GridPane layout = new GridPane();
		layout.setHgap(10);
		layout.setVgap(10);
		layout.add(ett, 0, 0);
		layout.add(tva, 1, 0);
		layout.add(tre, 2, 0);
		layout.add(add, 3, 0);
		layout.add(fyra, 0, 1);
		layout.add(fem, 1, 1);
		layout.add(sex, 2, 1);
		layout.add(minus, 3, 1);
		layout.add(sju, 0, 2);
		layout.add(atta, 1, 2);
		layout.add(nio, 2, 2);
		layout.add(dot, 3, 2);
		layout.add(multi, 0, 3);
		layout.add(noll, 1, 3);
		layout.add(divide, 2, 3);
		layout.add(exe, 3, 3);
		layout.setAlignment(Pos.CENTER);

		TextField topField = new TextField();
		topField.setMaxSize(470, 25);
		topField.setMinSize(470, 25);
		topField.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		topField.setEditable(false);

		TextField field = new TextField();
		field.setMaxSize(470, 55);
		field.setMinSize(470, 55);
		field.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		field.setEditable(false);

		BorderPane fieldBorder = new BorderPane();
		fieldBorder.setTop(topField);
		fieldBorder.setCenter(field);

		BorderPane border = new BorderPane();
		border.setTop(fieldBorder);
		border.setCenter(layout);
		border.setBottom(clear);
		border.setAlignment(field, Pos.CENTER);
		border.setAlignment(topField, Pos.CENTER);
		border.setAlignment(clear, Pos.CENTER);

		Scene mainScene = new Scene(border, 500, 600);
		sStage.setScene(mainScene);
		sStage.setTitle("Calculator");
		sStage.setResizable(false);
		sStage.show();

		ett.setOnAction(event -> {
			func.actNumb('1');
			field.setText(func.activeNumb);
		});
		tva.setOnAction(event -> {
			func.actNumb('2');
			field.setText(func.activeNumb);
		});
		tre.setOnAction(event -> {
			func.actNumb('3');
			field.setText(func.activeNumb);
		});
		fyra.setOnAction(event -> {
			func.actNumb('4');
			field.setText(func.activeNumb);
		});
		fem.setOnAction(event -> {
			func.actNumb('5');
			field.setText(func.activeNumb);
		});
		sex.setOnAction(event -> {
			func.actNumb('6');
			field.setText(func.activeNumb);
		});
		sju.setOnAction(event -> {
			func.actNumb('7');
			field.setText(func.activeNumb);
		});
		atta.setOnAction(event -> {
			func.actNumb('8');
			field.setText(func.activeNumb);
		});
		nio.setOnAction(event -> {
			func.actNumb('9');
			field.setText(func.activeNumb);
		});
		noll.setOnAction(event -> {
			func.actNumb('0');
			field.setText(func.activeNumb);
		});
		dot.setOnAction(event -> {
			func.actNumb('.');
			field.setText(func.activeNumb);
		});
		clear.setOnAction(event -> {
			func.clear();
			field.setText(func.activeNumb);
			topField.setText(func.numb);
		});
		add.setOnAction(event -> {
			func.addNumb();
			field.setText(func.activeNumb);
			topField.setText(func.numb);
		});
		multi.setOnAction(event -> {
			func.multiply();
			field.setText(func.activeNumb);
			topField.setText(func.numb);
		});
		divide.setOnAction(event -> {
			func.divide();
			field.setText(func.activeNumb);
			topField.setText(func.numb);
		});
		exe.setOnAction(event -> {
			func.execute();
			if (func.sum % 1 == 0) {
				field.setText(Integer.toString((int) func.sum));
			} else {
				field.setText(Double.toString(func.sum));
			}
			topField.setText(func.numb);
			func.sum = 0;
			func.numb = "";
		});

	}

}
