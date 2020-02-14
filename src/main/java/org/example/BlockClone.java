package org.example;

import javafx.scene.shape.Rectangle;

public class BlockClone extends Rectangle  {

        private int posx;
        private int posy;

           public BlockClone(int x, int y, org.example.Block b){
        super(App.blockSize, App.blockSize);
        posx = x/10;
        posy = y/10;
        setTranslateX(posx * App.blockSize);
        setTranslateY(posy * App.blockSize);

    }

    public void setPositionOutside(int positionY, int positionX) {
        setTranslateY(positionY);
        setTranslateX(positionX);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlockClone{");
        sb.append("posx=").append(posx);
        sb.append(", posy=").append(posy);
        sb.append('}');
        return sb.toString();
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
}


