package org.example;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;

public class Field extends Pane {
    App app;
    private int w;
    private int h;

    public Field(int width, int height) {
        w = width;
        h = height;

    setMinSize(w * app.blockSize, h * app.blockSize);
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
}
