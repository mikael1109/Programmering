import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;

public class calc extends Application {

	functions func = new functions();
	TextField topField = new TextField();
	TextField field = new TextField();

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage sStage) {

		Button[] buttons = { new Button("1"), new Button("2"), new Button("3"), new Button("+"), new Button("4"),
				new Button("5"), new Button("6"), new Button("-"), new Button("7"), new Button("8"), new Button("9"),
				new Button("."), new Button("x"), new Button("0"), new Button("/"), new Button("="),
				new Button("CLEAR") }; // skapar knapp arrayen

		for (int i = 0; i < buttons.length; i++) { // Sätter alla knappar till samma storlek förrutom knappen clear
			if (buttons[i].getText().equals("CLEAR")) {
				buttons[i].setMinSize(450, 50);
			} else {
				buttons[i].setMinSize(100, 100);
			}
			btnEvent(buttons[i]); // kallar på btnEvent med alla knappar
		}

		GridPane layout = new GridPane();
		layout.setHgap(10);
		layout.setVgap(10);
		int layoutCount = 0;
		int layoutCount2 = 0;
		for (int i = 0; i < buttons.length - 1; i++) { // Lägger in alla knappar på rätt platts med hjälp av två counts
			layout.add(buttons[i], layoutCount, layoutCount2);
			if (layoutCount != 3) {
				layoutCount++;
			} else {
				layoutCount = 0;
				layoutCount2++;
			}
		}
		layout.setAlignment(Pos.CENTER);

		topField.setMaxSize(470, 25);
		topField.setMinSize(470, 25);
		topField.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		topField.setEditable(false);

		field.setMaxSize(470, 55);
		field.setMinSize(470, 55);
		field.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
		field.setEditable(false);

		BorderPane fieldBorder = new BorderPane();
		fieldBorder.setTop(topField);
		fieldBorder.setCenter(field);

		BorderPane border = new BorderPane();
		border.setTop(fieldBorder);
		fieldBorder.setTranslateY(10);
		border.setCenter(layout);
		border.setBottom(buttons[16]);
		border.setAlignment(field, Pos.CENTER);
		border.setAlignment(topField, Pos.CENTER);
		buttons[16].setTranslateY(-10);
		border.setAlignment(buttons[16], Pos.CENTER);

		Scene mainScene = new Scene(border, 500, 600);
		sStage.setScene(mainScene);
		sStage.setTitle("Calculator");
		sStage.setResizable(false);
		sStage.show();

	}

	public void btnEvent(Button btn) {
		if (Character.isDigit(btn.getText().charAt(0))) { // Kollar ifall knappens text är ett nummer och kallar sen på
															// actNumb med knappens nummer och sätter textfieldet till
															// activeNumb
			btn.setOnAction(event -> {
				func.actNumb(btn.getText().charAt(0));
				field.setText(func.activeNumb);
			});
		} else if (btn.getText().equals(".")) { // Kollar ifall knappens text är en punkt och kollar sen ifall det finns
												// en annan punkt i talet och ifall activeNumb är tom ifall nej så kallar den på actNumb med punkten
												// och skriver ut activeNumb
			btn.setOnAction(event -> {
				boolean dotActive = false;
				for (int i = 0; i < func.activeNumb.length(); i++) {
					if (func.activeNumb.charAt(i) == '.') {
						dotActive = true;
					}
				}
				if (!dotActive && func.activeNumb != "") {
					func.actNumb('.');
					field.setText(func.activeNumb);
				}
			});
		} else if (btn.getText().equals("+")) { // Kallar på addNumb och sätter textfieldsen
			btn.setOnAction(event -> {
				func.addNumb();
				field.setText(func.activeNumb);
				topField.setText(func.numb);
			});
		} else if (btn.getText().equals("-")) { // Kallar på minus och sätter textfieldsen
			btn.setOnAction(event -> {
				func.minus();
				field.setText(func.activeNumb);
				topField.setText(func.numb);
			});
		} else if (btn.getText().equals("x")) { // Kallar på multiply och sätter textfieldsen
			btn.setOnAction(event -> {
				func.multiply();
				field.setText(func.activeNumb);
				topField.setText(func.numb);
			});
		} else if (btn.getText().equals("/")) { // Kallar på divide och sätter textfieldsen
			btn.setOnAction(event -> {
				func.divide();
				field.setText(func.activeNumb);
				topField.setText(func.numb);
			});
		} else if (btn.getText().equals("=")) { // Kallar på execute, kollar sen ifall summan har några decimaler ifall
												// nej så gör den om den till en int ifall ja så har den kvar den som en
												// double, sätter textfieldsen och återställer sum och numb.
			btn.setOnAction(event -> {
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
		} else if (btn.getText().equals("CLEAR")) { // kallar på clear och sätter textfieldsen.
			btn.setOnAction(event -> {
				func.clear();
				field.setText(func.activeNumb);
				topField.setText(func.numb);
			});
		}

	}

}
