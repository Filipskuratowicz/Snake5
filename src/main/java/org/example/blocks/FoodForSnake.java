package org.example.blocks;

import javafx.scene.shape.Rectangle;
import org.example.App;

public class FoodForSnake extends Rectangle {

    private int posX;
    private int posY;

    public FoodForSnake(int x, int y){
        super(App.rectangle, App.rectangle);
        posX = x;
        posY = y;
        setTranslateX(posX * App.rectangle);
        setTranslateY(posY * App.rectangle);
    }

    public void setPosX(int posX) {
        this.posX = posX;
        updateHorizontal(posX *10);
    }

    public void setPosY(int posY) {
        this.posY = posY;
        updateVertical(posY *10);
    }

    public void updateVertical(int positionY) {
        setTranslateY(positionY);
    }

    public void updateHorizontal(int positionX) {
        setTranslateX(positionX);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
