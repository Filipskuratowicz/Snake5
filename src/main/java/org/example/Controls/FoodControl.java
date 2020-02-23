package org.example.Controls;

import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;

import java.util.Random;

public class FoodControl extends SpeedControl{

    int length = 40;
    Random random = new Random();

    public void nextFood(FoodForSnake food, SnakeHead snakeHead) {

        if (food.getPosX() * 10 == snakeHead.getPosX() && food.getPosY() * 10 == snakeHead.getPosY()) {
            food.setPosX(random.nextInt(30));
            food.setPosY(random.nextInt(30));
            length += 10;
        }
    }

    public int snakeElongate() {
        return length /10;
    }

    public int ranX() {
        return random.nextInt(30);
    }

    public int ranY() {
        return random.nextInt(30);
    }

    public void setLength(int length) {
        this.length = length;
    }
}

