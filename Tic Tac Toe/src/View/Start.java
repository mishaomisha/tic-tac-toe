package View;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.awt.*;

public class Start extends VBox {

    private static Button StartBTN = new Button();
    private static Button SighnUpBTN = new Button();

    public Start(){
        Label start = new Label("Start");
        Button button = new Button(start.getText());
        button.setPrefWidth(1000);
        button.setPrefHeight(200);
        button.setFont(new Font(48));
        setStart(button);
        start = new Label("Sign in");
        button = new Button(start.getText());
        button.setPrefWidth(1000);
        button.setPrefHeight(200);
        button.setFont(new Font(48));
        setSighnUpBTN(button);
        this.getChildren().addAll(getStartBTN(), getSighnUpBTN());
    }

    public static Button getStartBTN() {
        return StartBTN;
    }

    public void setStart(Button startBTN) {
        StartBTN = startBTN;
    }

    public static Button getSighnUpBTN() {
        return SighnUpBTN;
    }

    public void setSighnUpBTN(Button sighnUp) {
        this.SighnUpBTN = sighnUp;
    }
}
