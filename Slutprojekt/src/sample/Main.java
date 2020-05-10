package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Main extends Application {

    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        primaryStage.setTitle("T-Rex Game");
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        TextField title = new TextField();
        title.setEditable(false);
        title.setMaxSize(390, 100);
        title.setText("T-REX GAME");
        title.setStyle("-fx-font: 50 arial;");
        title.setTranslateX(50);

        Button startButton = new Button("START");
        startButton.setMaxSize(200, 150);
        startButton.setStyle("-fx-font: 35 arial;");
        startButton.setTranslateY(300);
        startButton.setTranslateX(150);

        pane.getChildren().addAll(title, startButton);

        startButton.setOnAction(event -> {
            controller.start();
            primaryStage.close();
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
