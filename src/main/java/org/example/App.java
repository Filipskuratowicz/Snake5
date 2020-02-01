package org.example;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * JavaFX App
 */
public class App extends Application {

    static int blockSize = 10;

    int width = 30;
    int height = 30;




    Block block;
    @Override
    public void start(Stage stage) throws InterruptedException {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();


        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));

        Field field = new Field(width, height);
        vBox.getChildren().add(field);
        Block block = new Block(15, 15, null);
        field.addBlock(block);

        Scene scene = new Scene(vBox);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();


        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {

            block.update();

            }
        };
        timer.start();
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


    public static void main(String[] args) {
        launch();
    }
}


