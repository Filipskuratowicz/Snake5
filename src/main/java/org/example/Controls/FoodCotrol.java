package org.example.Controls;

import org.example.Block;
import org.example.BlockClone;
import org.example.Food;

import java.util.ArrayList;
import java.util.Random;

public class FoodCotrol {

    int lenght = 10;


    Random random = new Random();

    public void nextFood(Food food, Block block, ArrayList<BlockClone> arr) {
        System.out.println("XXXXXXXXXXXX   food= " +food.getPosx() + "//// " + "block = " + block.getPosX());
        System.out.println(" YYYYYYYYYY   food= " +food.getPosy() + "//// " + "block = " + block.getPosY());
        if (food.getPosx()*10 == block.getPosX() && food.getPosy()*10 == block.getPosY())
        {
            System.out.println(food.getPosx());
            food.setPosx(random.nextInt(30));
            food.setPosy(random.nextInt(30));
            System.out.println(food.getPosx()+ "po zmianie");

            lenght+=10;
        }
    }

    public int snakeElongate() {
        return lenght;
    }

    public int ranX() {
        return random.nextInt(1) + 300;
    }
    public int ranY() {
        return random.nextInt(1) + 300;
    }

}
