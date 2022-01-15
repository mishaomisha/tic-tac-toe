import Controller.SetPlayersController;
import Controller.StartController;
import View.SetPlayers;
import View.Start;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StartController startController = new StartController();
        primaryStage.setScene(new Scene(startController.getStart()));
        primaryStage.show();
    }
    public static void main (String[] args){
        launch(args);
    }
}
