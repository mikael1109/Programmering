package sample;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

public class Controller {

    public void start(){
        Pane pane = new Pane();
        Stage gameStage = new Stage();
        gameStage.setTitle("T-Rex Game");
        Scene gameScene = new Scene(pane, 500, 500);
        gameStage.setScene(gameScene);
        gameStage.show();

        Circle player = new Circle(50, Color.RED);
        player.setTranslateX(50);
        player.setTranslateY(50);

        Rectangle ground = new Rectangle(500, 100, Color.GREEN);
        ground.setTranslateY(400);

        pane.getChildren().addAll(player,ground);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if(!player.getBoundsInParent().intersects(ground.getBoundsInParent())){
                    player.setTranslateY(player.getTranslateY() + 10);
                }
            }
        }.start();
    }
}
