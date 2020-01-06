import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {


    public void onClickExitButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onClickSettingsButton(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("settings.fxml"));

            Main.stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onClickPlayButton(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("play.fxml"));

            Main.stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
