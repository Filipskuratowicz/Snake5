package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.Controls.ControlKey;
import org.example.Controls.EndOfGame;
import org.example.Controls.FoodCotrol;
import org.example.storage.BlockList;

import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    static int blockSize = 10;
    int width = 30;
    int height = 30;
    EndOfGame endOfGame;

    @Override
    public void start(Stage stage) throws InterruptedException {

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


        EndOfGame endOfGame = new EndOfGame();
        BlockList blockList = new BlockList();
        ArrayList arrayList = blockList.BlockCloneList();
        FoodCotrol foodCotrol = new FoodCotrol();
        Food food = new Food(1, 1, null);
        field.addFood(food);
        AnimationTimerExt timer = new AnimationTimerExt(100) {

            @Override
            public void handle() {
                block.update();
                foodCotrol.nextFood(food, block, blockList.BlockCloneList());
                //////////
                String s = block.toString();
//                System.out.println(s);
                endOfGame.crashOnBand(stage, block);
                endOfGame.crashOnYourself(stage, block, arrayList);
                /////////
                BlockClone blockClonned = new BlockClone(block.getPosX(), block.getPosY(), null);
                blockList.addToQueue(blockClonned);
                field.addCloneBlock(blockClonned);
                blockList.removeFromScene(scene, blockList, foodCotrol.snakeElongate() );
            }
        };


        timer.start();
        ControlKey controlKey = new ControlKey();
        controlKey.keyControllers(scene, block, stage);

    }


    public static void main(String[] args) {
        launch();
    }
}


