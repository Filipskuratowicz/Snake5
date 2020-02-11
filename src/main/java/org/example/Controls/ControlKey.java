package org.example.Controls;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import org.example.Block;

public class ControlKey {


    public void keyControllers(Scene scene, Block block) {

        scene.setOnKeyPressed(e -> {
            System.out.println("I clicked");
            if (e.getCode().equals(KeyCode.UP)) {
                block.updateEvent(8);
                System.out.println("8");
            }
            if (e.getCode().equals(KeyCode.DOWN)) {
                block.updateEvent(5);
                System.out.println("5");
            }
            if (e.getCode().equals(KeyCode.RIGHT)) {
                block.updateEvent(6);
                System.out.println("6");
            }
            if (e.getCode().equals(KeyCode.LEFT)) {
                block.updateEvent(4);
                System.out.println("4");
            }
        });
    }
}
