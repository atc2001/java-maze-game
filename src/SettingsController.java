import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class SettingsController {

    public void onClickSaveLocationButton(ActionEvent actionEvent) {

        FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("JPG & GIF Images", "jpg", "gif");
        chooser.setSelectedExtensionFilter(filter);
        File file = chooser.showOpenDialog(Main.stage);
        if (file != null) {
            System.out.println("You chose to open this file: " + file.getName());

        }
    }

    public void onClickBackButton(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("main-menu.fxml"));

            Main.stage.setScene(new Scene(root));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
