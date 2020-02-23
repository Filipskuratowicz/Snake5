package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Controls.*;
import org.example.blocks.Field;
import org.example.blocks.FoodForSnake;
import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;
import org.example.storage.BlockList;
import org.example.timer.AnimationTimerExt;

import java.util.ArrayList;

public class App extends Application {

    public static final int rectangle = 10;
    private static boolean firstAfterReset = false;


    @Override
    public void start(Stage stage){
        int height = 30;
        int width = 30;

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20));

        Field field = new Field(width, height);
        vBox.getChildren().add(field);

        SnakeHead snakeHead = new SnakeHead(15,15);
        field.addBlock(snakeHead);

        Scene scene = new Scene(vBox);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

        ControlKey controlKey = new ControlKey();
        FoodCotrol foodCotrol = new FoodCotrol();
        FoodForSnake food = new FoodForSnake(foodCotrol.ranX(), foodCotrol.ranY());
        field.addFood(food);
        Button button = new Button( "RESTART?" );
        SpeedControl speedControl = new SpeedControl();
        EndOfGame endOfGame = new EndOfGame();
        BlockList blockList = new BlockList();
        ArrayList<SnakeTail> arrayList = blockList.BlockCloneList();
        AnimationTimerExt timer = new AnimationTimerExt(300) {

                @Override
                public void handle() {
                    System.out.println(blockList.blockListSize());

//              Adding tail to "Head Block" by copying and saving position
                    SnakeTail blockClonned = new SnakeTail(snakeHead.getPosX(), snakeHead.getPosY());
                    blockList.addToQueue(blockClonned);
                    field.addCloneBlock(blockClonned);

//              Update movement of the head
                    snakeHead.update();
                    if (firstAfterReset) {
                        snakeHead.updateEvent(4);
                        firstAfterReset = false;
                    }

//              Controllers of game ending
                    endOfGame.crashOnBand(snakeHead);
                    endOfGame.crashOnYourself( snakeHead, arrayList);

                    // Restart of the game
                    if (!endOfGame.returnInformationEnd()) {
                            field.getChildren().add(button);
                        stop();
                        button.setOnAction(e -> {
                            field.resetAll(snakeHead, blockList, endOfGame, foodCotrol, speedControl);
                            field.getChildren().remove(button);
                            snakeHead.updateEvent(8);
                            start();
                            firstAfterReset = true;
                        });
                    }

//              Removing snake tali by seting last block outside
                    blockList.removeFromScene(blockList, foodCotrol.snakeElongate(), blockClonned);

//              Controller of the food
                    foodCotrol.nextFood(food, snakeHead);

//               Listening events
                    controlKey.keyControllers(scene, snakeHead, stage);
                }
            };

//          Addtional timer for change refresh rate of the first timer
        AnimationTimerExt timerForSpeed = new AnimationTimerExt(100) {
                @Override
                public void handle() {
                    speedControl.speedUpSnake(timer, blockList);
                }
            };

        timerForSpeed.start();
        timer.start();


    }

    public static void main(String[] args) {
        launch();
    }
}


