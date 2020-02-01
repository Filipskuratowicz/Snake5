package org.example;

import java.util.ArrayList;
import java.util.Timer;

public class Snake {
    ArrayList<Block> blocks = new ArrayList<>();

    Block head;
    Field fieldW;


    public Snake(int iLenght, int x , int y) {

        head = new Block(x, y, null);
//            Block previous = head;
        blocks.add(head);

//              <---- do przywrócenia --------->
//          public Snake(int iLenght, Field field) {
//            int ipx = field.getW()/2;
//            int ipy = field.getH()/2;
//
//
//            head = new Block(ipx, ipy, null);
////            Block previous = head;
//            blocks.add(head);

//            !!!---próba przekazania heada zamiast blocku---!!!
//            Block b = new Block(ipx   , ipy  , previous);
//            blocks.add(b);
//    }
//            <------ _----------->
    }

}





