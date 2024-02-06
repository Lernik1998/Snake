package objects;

import snakegame.SnakeGame;

public class Apple {

    SnakeGame main;

    public int posX;
    public int posY;

    public Apple(int startX, int startY) {
        posX = startX;
        posY = startY;

    }

    @SuppressWarnings("static-access")
    public void setRandomPosition() {
        posX = (int) (Math.random() * main.WIDTH);
        posY = (int) (Math.random() * main.HEIGHT);
    }
}
