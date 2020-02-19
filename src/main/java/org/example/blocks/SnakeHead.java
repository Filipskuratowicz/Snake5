package org.example.blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.App;

public class SnakeHead extends Rectangle {

    protected int direction;
    int posx;
    int posy;
    private int posX;
    private int posY;
    boolean verHor = true;

    public SnakeHead(int x, int y) {
        super(App.rectangle, App.rectangle);
        posx = x;
        posy = y;
        setTranslateX(posx * App.rectangle);
        setTranslateY(posy * App.rectangle);
        posX = posx * 10;
        posY = posy * 10;
        setFill(Color.CYAN);
    }

    public void updateEvent(int num) {
        switch (num) {
            case 4:
                if (verHor == false) {
                    verHor = true;
                    direction = 4;
                    break;
                }
            case 6:
                if (verHor == false) {
                    verHor = true;
                    direction = 6;
                }
                break;

            case 8:
                if (verHor == true) {
                    verHor = false;
                    direction = 8;
                }
                break;

            case 5:
                if (verHor == true) {
                    verHor = false;
                    direction = 5;
                }
                break;
        }
    }

    public void update() {
        int z = direction;
        switch (z) {
            case 0:
                fieldUpdaterHorizontalLeft();
                direction = 4;
                break;
            case 4:
                fieldUpdaterHorizontalLeft();
                direction = 4;
                break;
            case 6:
                fieldUpdaterHorizontalRight();
                direction = 6;
                break;
            case 8:
                fieldUpdaterVerticalUp();
                direction = 8;
                break;
            case 5:
                fieldUpdaterVerticalDown();
                direction = 5;
                break;
        }
    }

    public void fieldUpdaterVerticalUp() {
        posY -= 10;
        updateVertical(posY);
    }

    public void fieldUpdaterVerticalDown() {
        posY += 10;
        updateVertical(posY);
    }

    public void fieldUpdaterHorizontalLeft() {
        posX -= 10;
        updateHorizontal(posX);
    }

    public void fieldUpdaterHorizontalRight() {
        posX += 10;
        updateHorizontal(posX);
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

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setDirection(int direction) {
        this.direction = direction;
        }

    public void setVerHor(boolean verHor) {
        this.verHor = verHor;
    }
}

