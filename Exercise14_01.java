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

public class Exercise14_01 extends Application {
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
        ImageView imageView4 = new ImageView(flag7);

        // Set size for images
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(120);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(120);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(120);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(120);

        // Add images to GridPane (column, row)
        gridPane.add(imageView1, 0,0); // top left - US
        gridPane.add(imageView2, 1,0); // top right - UK
        gridPane.add(imageView3, 0,1); // bottom left - France
        gridPane.add(imageView4, 1,1); // bottom right - China

        // Set spacing between images
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        // Set padding around grid
        gridPane.setPadding(new Insets(10));

        // Create scene and set on stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
    }
}
