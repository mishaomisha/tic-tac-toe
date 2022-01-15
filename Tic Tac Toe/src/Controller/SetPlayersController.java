package Controller;

import View.MainPage;
import View.SetPlayers;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SetPlayersController {
    public static SetPlayers setPlayers;
    public SetPlayersController(){
        setSetPlayers(new SetPlayers());
        initButton();
    }

    public static void setSetPlayers(SetPlayers setPlayers) {
        SetPlayersController.setPlayers = setPlayers;
    }

    private void initButton(){
        getSetPlayers().getStratt().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getSetPlayers().getScene().getWindow().hide();
                MainPage mainPage = new MainPage();
            }
        });
    }
    public void StartController(){
        setSetPlayers(new SetPlayers());

    }
    public static SetPlayers getSetPlayers(){

        return setPlayers;
    }
}
