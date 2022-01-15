package Controller;

import View.MainPage;
import View.MakeAccount;
import View.Start;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MakeAccountController {
    private MakeAccount makeAccount;
    public MakeAccountController(){
        setMakeAccount(new MakeAccount());
        initButton();
    }
    private void initButton(){
        MakeAccount.getSighninBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StartController startController = new StartController();
                getMakeAccount().getScene().getWindow().hide();
                Stage start = new Stage();
                start.setScene(new Scene(StartController.getStart()));
                start.show();
            }
        });
    }
    public MakeAccount getMakeAccount() {
        return makeAccount;
    }

    public void setMakeAccount(MakeAccount makeAccount) {
        this.makeAccount = makeAccount;
    }
}
