package sample.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.artur.lab2.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;
import sample.TestBattle;

public class ChoosePokemon {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_pikachu;

    @FXML
    private Label label_raichu;

    @FXML
    private Label label_pichu;

    @FXML
    private Label label_farfetch;

    @FXML
    private Label label_skutank;

    @FXML
    private Label label_stanky;

    @FXML
    private Button choosePikachu;

    @FXML
    private Button choosePichu;

    @FXML
    private Button chooseRaichu;

    @FXML
    private Button chooseFarfetch;

    @FXML
    private Button chooseSkuntank;

    @FXML
    private Button chooseStanky;


    @FXML
    private AnchorPane toolStunky;




    @FXML
    void firstButton(ActionEvent event) {

    }

    @FXML
    void initialize() {

        //Допсказки на кнопки
        choosePikachu.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Charge Beam\n" +
                " 2. Thunder Wave\n" +
                " 3. Nuzzle"));
        chooseFarfetch.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Feather Dance\n" +
                " 2. Peck\n" +
                " 3. Roost\n" +
                " 4. Air Cutter"));
        choosePichu.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Charge Beam\n" +
                " 2. Thunder Wave"));
        chooseRaichu.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Charge Beam\n" +
                " 2. Thunder Wave\n" +
                " 3. Nuzzle\n" +
                " 4. Double Team"));
        chooseSkuntank.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Facade\n" +
                " 2. Fire Blast\n" +
                " 3. Scratch\n" +
                " 4. Poison Jab"));
        chooseStanky.setTooltip(new Tooltip(" Skills:\n" +
                " 1. Facade\n" +
                " 2. Fire Blast\n" +
                " 3. Scratch"));


        //создание покемонов (объектов)
        Pichu pichu = new Pichu("pichu");
        Pikachu pikachu = new Pikachu("pikachu");
        Raichu raichu = new Raichu("raichu");
        Farfetch farfetch = new Farfetch("farfetch");
        Skuntank skuntank = new Skuntank("skuntank");
        Stunky stunky = new Stunky("stunky");

        //Заполнение статов покемонов по покемонам
        label_pichu.setText(TestBattle.getAllStatTest(pichu));
        label_pikachu.setText(TestBattle.getAllStatTest(pikachu));
        label_raichu.setText(TestBattle.getAllStatTest(raichu));
        label_farfetch.setText(TestBattle.getAllStatTest(farfetch));
        label_skutank.setText(TestBattle.getAllStatTest(skuntank));
        label_stanky.setText(TestBattle.getAllStatTest(stunky));

        choosePikachu.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            try {

                //создание файла с текстом боя выбранного покемона

                TestBattle.battleTest(3);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

        choosePichu.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            //создание файла с текстом боя выбранного покемона

            try {
                TestBattle.battleTest(5);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();



        });

        chooseRaichu.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            //создание файла с текстом боя выбранного покемона

            try {
                TestBattle.battleTest(6);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

        chooseFarfetch.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            //создание файла с текстом боя выбранного покемона

            try {
                TestBattle.battleTest(1);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

        chooseSkuntank.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            //создание файла с текстом боя выбранного покемона

            try {
                TestBattle.battleTest(4);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

        chooseStanky.setOnAction(event -> {
            //choosePikachu.getScene().getWindow().hide();

            //создание файла с текстом боя выбранного покемона

            try {
                TestBattle.battleTest(2);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxmls/battle_2.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

    }
}
