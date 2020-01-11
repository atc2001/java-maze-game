import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class MainMenuController {


    public void onClickExitButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onClickSettingsButton(ActionEvent actionEvent) {

        try {
            ServiceLocator.navigationService.navigate("settings.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onClickPlayButton(ActionEvent actionEvent) {

        try {
            ServiceLocator.navigationService.navigate("generate-maze.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
