package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

import java.util.concurrent.ThreadLocalRandom;


public class Controller {

    int gameTime = 0;
    Enemy enemyClass = new Enemy();
    Player playerClass = new Player();
    Circle player = new Circle(40, Color.RED);
    Rectangle ground = new Rectangle(700, 100, Color.GREEN);
    Stage gameStage = new Stage();
    TextField gameTimer = new TextField("0");
    Pane pane = new Pane();

    public void start() {
        gameStage.setTitle("T-Rex Game");
        Scene gameScene = new Scene(pane, 700, 500);
        gameStage.setScene(gameScene);
        gameStage.show();

        gameTimer.setTranslateX(300);
        gameTimer.setEditable(false);
        gameTimer.setStyle("-fx-font: 40 arial;");
        gameTimer.setMaxWidth(130);

        player.setTranslateX(100);
        player.setTranslateY(50);

        ground.setTranslateY(420);

        Button jump = new Button();
        jump.setTranslateX(-100);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!player.getBoundsInParent().intersects(ground.getBoundsInParent())) {
                    player.setTranslateY(player.getTranslateY() + 8);
                }
            }
        }.start();

        jump.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                playerClass.jump(player);
            }
        });

        Runnable r = new Runnable() {
            public void run() {
                do {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    gameTime++;
                    gameTimer.setText(Integer.toString(gameTime));
                } while (gameStage.isShowing());
            }
        };

        Thread t = new Thread(r);

        t.start();

        pane.getChildren().addAll(player, ground, jump, gameTimer);

        spawnEnemy();
    }


    public void spawnEnemy() {
        Rectangle enemy = new Rectangle();
        enemy.setWidth(50);
        enemy.setHeight(100);
        enemy.setFill(Color.DARKOLIVEGREEN);
        enemy.setTranslateY(320);
        enemy.setTranslateX(600);
        pane.getChildren().add(enemy);
        enemyClass.move(enemy, gameTime, player, gameStage);
    }


}
