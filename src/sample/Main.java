package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import jdk.nashorn.internal.runtime.ScriptEnvironment;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("fxmls/Controller.fxml"));
        primaryStage.setTitle("PokemonBattle");
        Scene scene = new Scene(root, 700, 400);
        scene.getStylesheets().add(0, "sample/styles/my.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}


