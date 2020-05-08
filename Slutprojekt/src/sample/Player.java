package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;

public class Player {

    public void jump(Circle player){
        new AnimationTimer() {

            @Override
            public void handle(long now) {
                do{
                    player.setTranslateY(player.getTranslateY() - 10);
                    System.out.println(player.getTranslateY());
                }while(player.getTranslateY() > 200);
            }
        }.start();
    }
}
