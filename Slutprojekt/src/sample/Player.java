package sample;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;
import java.util.concurrent.TimeUnit;

public class Player {

    public void jump(Circle player){
        new AnimationTimer() {

            @Override
            public void handle(long now) {
                do{
                    player.setTranslateY(player.getTranslateY() - 15);
                    try {
                        delay();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(player.getTranslateY());
                }while(player.getTranslateY() >= 150);
                stop();
            }
        }.start();
    }

    public void delay() throws InterruptedException {
        Thread.sleep(10);
    }
}
