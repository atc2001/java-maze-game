import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Loads the main-menu FXML file upon launch.
     *
     * @main launches the application.
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        ServiceLocator.navigationService = new NavigationService(primaryStage);
        ServiceLocator.navigationService.navigate("main-menu.fxml");

        ServiceLocator.mazeService = new MazeService();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
