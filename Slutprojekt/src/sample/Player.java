package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;

public class Player {

    public void jump(Circle player){
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (player.getTranslateY() > 330) {
                    do {
                        player.setTranslateY(player.getTranslateY() - 15);
                        System.out.println(player.getTranslateY());
                    } while (player.getTranslateY() >= 100);
                    stop();
                }
            }
        }.start();
    }
}
