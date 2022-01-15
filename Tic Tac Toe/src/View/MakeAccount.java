package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MakeAccount extends VBox {
    private TextField name ;
    private static Button sighninBTN ;
    public MakeAccount(){
        Label username = new Label("Username");
        setName(new TextField());
        getName().setPrefWidth(400);
        HBox playerr1 = new HBox(username, getName());
        Button x = new Button("Make Account");
        x.setPrefWidth(600);
        setSighninBTN(x);
        this.getChildren().addAll(playerr1, getSighninBTN());
        this.setSpacing(15);
    }

    public TextField getName() {
        return name;
    }

    public void setName(TextField name) {
        this.name = name;
    }

    public static Button getSighninBTN() {
        return sighninBTN;
    }

    public void setSighninBTN(Button sighninBTN) {
        this.sighninBTN = sighninBTN;
    }
}
