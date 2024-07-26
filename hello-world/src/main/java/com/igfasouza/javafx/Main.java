package com.igfasouza.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

     public void start(Stage primaryStage) {
        Pane pane = new Pane();
        OlympicRingsPaintingContext ctx = new OlympicRingsPaintingContext(pane, 50, 10);
        OlympicRingsPaintingContext.STANDARD_OLYMPIC_COLORS.forEach(ctx::paintNextRing);

        Scene scene1 = new Scene(pane, 440, 250); // creates the parameters of the pane
        primaryStage.setTitle("Olympic Rings"); // names the pane
        primaryStage.setScene(scene1); // picks what will go in the pane
        primaryStage.show(); // shows the scene i've created
    }

    public static void main(String[] args) {
        launch(args);
    }
}
