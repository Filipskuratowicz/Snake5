package org.example;


import javafx.scene.shape.Rectangle;



public class Block extends Rectangle {
    protected int direction;
    int posx;
    int posy;

    public Block(int x, int y, Block b) {
        super(App.blockSize, App.blockSize);
            posx = x;
            posy = y;

            setTranslateX(posx*App.blockSize);
            setTranslateY(posy*App.blockSize);

    }
    private int posX = 150;
    private int posY = 150;



    public void updateEvent(int num) {
        switch (num) {
                case 4:
                    direction = 4;
                    break;

                case 6:
                    direction = 6;
                    break;

                case 8:
                    direction = 8;
                    break;

                case 5:
                    direction = 5;
                    break;
        }
    }
    public void update() {
        int z = direction;
            switch (z) {
                case 0:
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

    public void fieldUpdaterVerticalUp () {
        posY--;
        updateVertical(posY);
    }
    public void fieldUpdaterVerticalDown () {
        posY++;
        updateVertical(posY);
    }
    public void fieldUpdaterHorizontalLeft () {
        posX--;
        updateHorizontal(posX);
    }
    public void fieldUpdaterHorizontalRight () {
        posX++;
        updateHorizontal(posX);
    }

    public void updateVertical(int positionY) {
        setTranslateY(positionY);
    }
    public void updateHorizontal(int positionX) {
        setTranslateX(positionX);
    }
}
