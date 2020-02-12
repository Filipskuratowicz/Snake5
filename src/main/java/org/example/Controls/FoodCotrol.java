package org.example.Controls;

import org.example.Block;
import org.example.BlockClone;
import org.example.Food;

import java.util.ArrayList;
import java.util.Random;

public class FoodCotrol extends SpeedControl{

    int lenght = 40;

    Random random = new Random();

    public void nextFood(Food food, Block block, ArrayList<BlockClone> arr) {

        if (food.getPosx() * 10 == block.getPosX() && food.getPosy() * 10 == block.getPosY()) {
            food.setPosx(random.nextInt(30));
            food.setPosy(random.nextInt(30));

            lenght += 10;
            System.out.println("from fC = " + lenght);
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

    }

