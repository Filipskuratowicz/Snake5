package org.example.blocks;

import javafx.scene.shape.Rectangle;
import org.example.App;

public class SnakeTail extends Rectangle  {

        private int posx;
        private int posy;

           public SnakeTail(int x, int y){
        super(App.rectangle, App.rectangle);
        posx = x/10;
        posy = y/10;
        setTranslateX(posx * App.rectangle);
        setTranslateY(posy * App.rectangle);
    }

    public void setPositionOutside() {
        setTranslateY(400);
        setTranslateX(400);
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}


