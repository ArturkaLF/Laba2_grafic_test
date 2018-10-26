package sample.controllers;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.util.ResourceBundle;

import com.artur.lab2.GraficsClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Battle_2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label text_battle;

    @FXML
    private Button btnBack;



    @FXML
    void initialize() throws FileNotFoundException {

        //GraficsClass.battle_text();

        File file = new File("test_out");
        Scanner sc = new Scanner(file);
        String l = "";
        while (sc.hasNext()){
            l += sc.nextLine() + "\r\n";
        }
        text_battle.setText(l);
        sc.close();


        btnBack.setOnAction(event -> {
            btnBack.getScene().getWindow().hide();
        });


    }
}
