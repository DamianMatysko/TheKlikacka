package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

import static sample.Controller.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Klikacka");
        primaryStage.setScene(new Scene(root, 155, 155));
        primaryStage.show();

        //Random rnd = new Random();
        //int number=rnd.nextInt(11);

        //button1.setText(String.valueOf(rnd.nextInt(11)));
        //button2.setText(String.valueOf(rnd.nextInt(11)));
        //button3.setText(String.valueOf(rnd.nextInt(11)));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
