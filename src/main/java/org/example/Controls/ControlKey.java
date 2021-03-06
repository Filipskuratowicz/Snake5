package org.example.Controls;

        import javafx.scene.Scene;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;
        import javafx.stage.Stage;
        import org.example.blocks.SnakeHead;

public class ControlKey {

    public void keyControllers(Scene scene, SnakeHead block, Stage stage) {

        scene.addEventFilter(KeyEvent.KEY_PRESSED, (e) -> {
            if (e.getCode() == KeyCode.UP) {
                block.updateEvent(8);
                System.out.println("UP");
            }
            if (e.getCode() == KeyCode.DOWN) {
                block.updateEvent(5);
                System.out.println("DOWN");
            }
            if (e.getCode() == KeyCode.RIGHT) {
                block.updateEvent(6);
                System.out.println("RIGHT");
            }
            if (e.getCode() == KeyCode.LEFT) {
                block.updateEvent(4);
                System.out.println("LEFT");
            }
            if (e.getCode().equals(KeyCode.ESCAPE)) {
                stage.hide();
                System.out.println("END OF THE GAME");
            }
        });
    }
}
