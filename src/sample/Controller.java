package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;

    //int num0, num1, num2, num3;
    Random rnd = new Random();
    //todo random
    int num0 = rnd.nextInt(5 )+5;
    int num1 = rnd.nextInt(5 )+5;
    int num2 = rnd.nextInt(5 )+5;
    int num3 = rnd.nextInt(5 )+5;

    //button1.setText(String.valueOf(rnd.nextInt(11)));

    public void change0(ActionEvent actionEvent) {
        if (num0>0) {
            num0 -= 1;
            num1 += 1;
            num2 += 1;
            button0.setText(String.valueOf(num0));
            button1.setText(String.valueOf(num1));
            button2.setText(String.valueOf(num2));
            button3.setText(String.valueOf(num3));
        }
    }

    public void change1(ActionEvent actionEvent) {
        if (num1>0) {
            num1 -= 1;
            num0 += 1;
            num3 += 1;
            button0.setText(String.valueOf(num0));
            button1.setText(String.valueOf(num1));
            button2.setText(String.valueOf(num2));
            button3.setText(String.valueOf(num3));
        }
    }

    public void change2(ActionEvent actionEvent) {
        if (num2>0) {
            num2 -= 1;
            num0 += 1;
            num3 += 1;
            button0.setText(String.valueOf(num0));
            button1.setText(String.valueOf(num1));
            button2.setText(String.valueOf(num2));
            button3.setText(String.valueOf(num3));
        }
    }

    public void change3(ActionEvent actionEvent) {
        if (num3>0) {
            num3 -= 1;
            num1 += 1;
            num2 += 1;
            button0.setText(String.valueOf(num0));
            button1.setText(String.valueOf(num1));
            button2.setText(String.valueOf(num2));
            button3.setText(String.valueOf(num3));
        }
    }
}
