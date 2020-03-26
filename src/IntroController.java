import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class IntroController {
    public TextField usernameTextField;

    public void onClickEnterButton(ActionEvent actionEvent) {

        try {
            ServiceLocator.navigationService.navigate("main-menu.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
