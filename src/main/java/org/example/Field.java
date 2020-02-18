package org.example;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.example.Controls.EndOfGame;
import org.example.Controls.FoodCotrol;
import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;
import org.example.storage.BlockList;

public class Field extends Pane {
    App app;
    private int w;
    private int h;


    public Field(int width, int height) {
        w = width;
        h = height;

    setMinSize(w * app.rectangle, h * app.rectangle);
    setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, null, null)));
    setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
    }

    public void addBlock(SnakeHead block) {
        getChildren().add(block);
    }
    public void addCloneBlock(SnakeTail block) {
        getChildren().add(block);
    }
    public void addFood(FoodForSnake food) {
        getChildren().add(food);
    }

    public void resetAll(SnakeHead head, BlockList blockList, EndOfGame endOfGame,
                         FoodCotrol foodCotrol, FoodForSnake food) {
        getChildren().clear();
        head.setPosX(150);
        head.setPosY(150);
        endOfGame.setGameEnd(true);
        blockList.removeAllFromList();
        blockList.setFirstBlock(true);
        head.setDirection(4);
        head.setVerHor(true);
        foodCotrol.setLenght(40);
        getChildren().add(head);
        getChildren().add(food);
    }
}
