import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
/**
 * Controls the menus and buttons within the menu page.
 */

public class SettingsController {
    public ComboBox<String> themeComboBox;
    public ComboBox<String> resolutionComboBox;

    @FXML
    public void initialize() {
        themeComboBox.setItems(FXCollections.observableArrayList("Light", "Dark"));
        resolutionComboBox.setItems(FXCollections.observableArrayList("1920x1080", "1280x720"));
    }

    public void onClickSaveLocationButton(ActionEvent actionEvent) {

        FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("JPG & GIF Images", "jpg", "gif");
        chooser.setSelectedExtensionFilter(filter);
        File file = chooser.showOpenDialog(ServiceLocator.navigationService.getStage());
        if (file != null) {
            System.out.println("You chose to open this file: " + file.getName());

        }
    }

    public void onClickBackButton(ActionEvent actionEvent) {

        try {
            ServiceLocator.navigationService.navigate("main-menu.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
