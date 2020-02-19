package org.example.Controls;

import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodCotrolTest {

        FoodForSnake foodForSnake = new FoodForSnake(15, 15);
        SnakeHead snakeHead = new SnakeHead(15, 15);
        FoodCotrol foodCotrol = new FoodCotrol();

        @Test
        public void snakeElongateshouldBe5AfterEeating1Food() {

            foodCotrol.nextFood(foodForSnake, snakeHead);
            assertEquals(5,foodCotrol.snakeElongate());
    }
}
