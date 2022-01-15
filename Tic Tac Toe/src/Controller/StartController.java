package Controller;

import View.Start;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartController extends ActionEvent {
    private static Start start;
    public StartController(){
        start = new Start();
        initButtonStart();
        initButtonAccount();
    }
    private void initButtonStart(){
        Start.getStartBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SetPlayersController setPlayersControllert = new SetPlayersController();
                getStart().getScene().getWindow().hide();
                Stage setPlayers = new Stage();
                setPlayers.setScene(new Scene(SetPlayersController.getSetPlayers()));
                setPlayers.show();
            }
        });
    }
    private void initButtonAccount(){
        Start.getSighnUpBTN() .setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MakeAccountController makeAccountController = new MakeAccountController();
                getStart().getScene().getWindow().hide();
                Stage makeAccount = new Stage();
                makeAccount.setScene(new Scene(makeAccountController.getMakeAccount()));
                makeAccount.show();
            }
        });
    }

    public static Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }
}
