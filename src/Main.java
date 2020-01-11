import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ServiceLocator.navigationService = new NavigationService(primaryStage);
        ServiceLocator.navigationService.navigate("generate-maze.fxml");

        ServiceLocator.mazeService = new MazeService();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
