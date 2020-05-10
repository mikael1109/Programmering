package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Enemy {

    public void move(Rectangle enemy, int time, Circle player, Stage gameStage){
        new AnimationTimer() {
            public void handle(long now) {
                if(enemy.getTranslateX() >= 0){
                    enemy.setTranslateX(enemy.getTranslateX() - 8);
                }else{
                    enemy.setVisible(false);
                }
                if(player.getBoundsInParent().intersects(enemy.getBoundsInParent())){
                    gameStage.close();
                }
            }
        }.start();
    }


}
