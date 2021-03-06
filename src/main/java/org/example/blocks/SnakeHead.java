package org.example.blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.App;

public class SnakeHead extends Rectangle {

    protected int direction;
    private int posX;
    private int posY;
    private boolean verHor = true;

    public SnakeHead(int x, int y) {
        super(App.rectangle, App.rectangle);
        setTranslateX(x * App.rectangle);
        setTranslateY(y * App.rectangle);
        posX = x * 10;
        posY = y * 10;
        setFill(Color.CYAN);
    }

    public void updateEvent(int num) {
        switch (num) {
            case 4:
                if (!verHor) {
                    verHor = true;
                    direction = 4;
                    break;
                }
            case 6:
                if (!verHor) {
                    verHor = true;
                    direction = 6;
                }
                break;

            case 8:
                if (verHor) {
                    verHor = false;
                    direction = 8;
                }
                break;

            case 5:
                if (verHor) {
                    verHor = false;
                    direction = 5;
                }
                break;
        }
    }

    public void update() {
        int z = direction;
        switch (z) {
            case 4 :
            case 0:
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

