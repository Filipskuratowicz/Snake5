package org.example.Controls;

import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodControlTest {

        FoodForSnake foodForSnake = new FoodForSnake(15, 15);
        SnakeHead snakeHead = new SnakeHead(15, 15);
        FoodControl foodControl = new FoodControl();

        @Test
        public void snakeElongateShouldBe5AfterEating1Food() {
            foodControl.nextFood(foodForSnake, snakeHead);

            assertEquals(5, foodControl.snakeElongate());
    }
}
