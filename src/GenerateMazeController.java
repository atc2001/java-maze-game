import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateMazeController {
    public ComboBox<String> selectAlgorithmComboBox;
    public TextField widthTextField;
    public TextField heightTextField;

    @FXML
    public void initialize() {
        selectAlgorithmComboBox.setItems(FXCollections.observableArrayList("Recursive Backtracking", "Wilson's Algorithm", "Growing Tree"));
    }

    public void onClickBackButton(ActionEvent actionEvent) {

        try {
            ServiceLocator.navigationService.navigate("main-menu.fxml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onClickExitButton(ActionEvent actionEvent) {
        System.exit(0);
    }


    /**
     * Generate a maze.
     * @param actionEvent
     */
    public void onClickGenerateButton(ActionEvent actionEvent) {

        List<Vertex> vertices = new ArrayList<>();
        for (int x = 0; x < Integer.parseInt(widthTextField.getText()); x++) {
            for (int y = 0; y < Integer.parseInt(heightTextField.getText()); y++) {
                vertices.add(new Vertex(x, y));
            }
        }

        UnweightedGraph<Vertex> graph = new UndirectedUnweightedGraph<>();

        for (Vertex vertex : vertices) {
            graph.addVertex(vertex);
        }

        for (Vertex origin : vertices) {
            List<Vertex> destinations = vertices.stream().filter(origin::isAdjacent).collect(Collectors.toList());

            for (Vertex destination : destinations) {
                graph.addEdge(origin, destination);
            }
        }

        Algorithm<Vertex> algorithm = new KruskalsAlgorithm<>(graph);

        ServiceLocator.mazeService.setMaze(algorithm.generateMaze());

        try {
            Parent root = FXMLLoader.load(getClass().getResource("solve-maze.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Maze");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
