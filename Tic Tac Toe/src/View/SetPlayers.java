package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

public class SetPlayers extends VBox {
    private TextField P1 ;
    private TextField P2 ;
    private Button Stratt ;
    public SetPlayers(){
        Label Player1 = new Label("Player 1");
        setP1(new TextField());
        getP1().setPrefWidth(400);
        HBox playerr1 = new HBox(Player1, getP1());
        playerr1 .setSpacing(15);
        Label Player2 = new Label("Player 2");
        setP2(new TextField());
        getP2().setPrefWidth(400);
        HBox playerr2 = new HBox(Player2, getP2());
        playerr2.setSpacing(15);
        Button x = new Button("Start");
        x.setPrefWidth(600);
        setStratt(x);
        this.getChildren().addAll(playerr1,playerr2,Stratt);
        this.setSpacing(15);
        this.setForeground(new Color(0, 255, 153));
    }

    private void setForeground(Color color) {
    }

    public TextField getP1() {
        return P1;
    }

    public void setP1(TextField p1) {
        P1 = p1;
    }

    public TextField getP2() {
        return P2;
    }

    public void setP2(TextField p2) {
        P2 = p2;
    }

    public Button getStratt() {
        return Stratt;
    }

    public void setStratt(Button stratt) {
        Stratt = stratt;
    }
}
