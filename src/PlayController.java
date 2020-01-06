import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class PlayController {
    public void onClickBackButton(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("main-menu.fxml"));

            Main.stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onClickExitButton(ActionEvent actionEvent) {
        System.exit(0);
    }
}
