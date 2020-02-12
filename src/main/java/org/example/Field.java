package org.example;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Field extends Pane {
    App app;
    private int w;
    private int h;
//    Snake snake;

//    ArrayList<Block> blocks = new ArrayList<>();
    public Field(int width, int height) {
        w = width;
        h = height;

    setMinSize(w * app.blockSize, h * app.blockSize);
    setBackground(new Background(new BackgroundFill(Color.ANTIQUEWHITE, null, null)));
    setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));
    }




    public void addBlock(Block block) {
        getChildren().add(block);
    }
    public void addCloneBlock(BlockClone block) {
        getChildren().add(block);
    }
    public void addFood(Food food) {
        getChildren().add(food);
    }



    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
