import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class PlayController {
    public ComboBox<String> selectAlgorithmComboBox;

    @FXML
    public void initialize() {
        selectAlgorithmComboBox.setItems(FXCollections.observableArrayList("Recursive Backtracking", "Wilson's Algorithm", "Growing Tree"));
    }

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
