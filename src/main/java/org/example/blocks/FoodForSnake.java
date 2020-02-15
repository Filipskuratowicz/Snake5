package org.example.blocks;

import javafx.scene.shape.Rectangle;
import org.example.App;

public class FoodForSnake extends Rectangle {

    private int posx;
    private int posy;

    public FoodForSnake(int x, int y){
        super(App.blockSize, App.blockSize);
        posx = x;
        posy = y;
        setTranslateX(posx * App.blockSize);
        setTranslateY(posy * App.blockSize);

    }


    public void setPosx(int posx) {
        this.posx = posx;
        updateHorizontal(posx*10);
    }

    public void setPosy(int posy) {
        this.posy = posy;
        updateVertical(posy*10);
    }

    public void updateVertical(int positionY) {
        setTranslateY(positionY);
    }

    public void updateHorizontal(int positionX) {
        setTranslateX(positionX);
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}
