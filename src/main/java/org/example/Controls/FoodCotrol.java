package org.example.Controls;

import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;

import java.util.Random;

public class FoodCotrol extends SpeedControl{

    int lenght = 40;
    Random random = new Random();

    public void nextFood(FoodForSnake food, SnakeHead snakeHead) {

        if (food.getPosx() * 10 == snakeHead.getPosX() && food.getPosy() * 10 == snakeHead.getPosY()) {
            food.setPosx(random.nextInt(30));
            food.setPosy(random.nextInt(30));
            lenght += 10;
        }
    }

    public int snakeElongate() {
        return lenght/10;
    }

    public int ranX() {
        return random.nextInt(30);
    }

    public int ranY() {
        return random.nextInt(30);
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}

