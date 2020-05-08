package sample;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

public class Controller {

    Player playerClass = new Player();
    Circle player = new Circle(40, Color.RED);
    Rectangle ground = new Rectangle(700, 100, Color.GREEN);
    Stage gameStage = new Stage();

    public void start(){
        Pane pane = new Pane();
        gameStage.setTitle("T-Rex Game");
        Scene gameScene = new Scene(pane, 700, 500);
        gameStage.setScene(gameScene);
        gameStage.show();

        player.setTranslateX(100);
        player.setTranslateY(50);

        ground.setTranslateY(400);

        Button jump = new Button();
        jump.setTranslateX(-100);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!player.getBoundsInParent().intersects(ground.getBoundsInParent())) {
                    player.setTranslateY(player.getTranslateY() + 6);
                }
                
            }
        }.start();

        jump.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.ENTER){
                playerClass.jump(player);
            }
        });

        pane.getChildren().addAll(player,ground, jump);
    }
}
