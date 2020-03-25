import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationService {

    private final Stage stage;

    public Stage getStage() {
        return stage;
    }

    /**
     * This opens the generated maze in a new maximised window.
     */

    public NavigationService(Stage stage) {
        this.stage = stage;
    }

    public void navigate(String view) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(view));

        stage.hide();
        stage.setTitle("Maze Game");
        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.show();

    }

}
