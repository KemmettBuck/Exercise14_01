/**
 * Exercise14_01
 * Display flag images in 2x2 Grid using JavaFX
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_01 {
    @Override
    public void start(Stage primaryStage) {
        //Create Grid
        GridPane gridPane = new GridPane();

        // Load flag images
        Image flag1 = new Image("flag1.gif"); // US
        Image flag2 = new Image("flag2.gif"); // UK
        Image flag6 = new Image("flag6.gif"); // France
        Image flag7 = new Image("flag7.gif"); // China

        // Create ImageView for each flag
        ImageView imageView1 = new ImageView(flag1);
        ImageView imageView2 = new ImageView(flag2);
        ImageView imageView3 = new ImageView(flag6);
        IamgeView imageView4 = new ImageView(flag7);

        // Set size for images
        imageView1
    }
}
