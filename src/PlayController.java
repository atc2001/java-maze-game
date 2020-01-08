import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    /**
     * Generate a maze.
     * @param actionEvent
     */
    public void onClickGenerateButton(ActionEvent actionEvent) {

        List<Vertex> vertices = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
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
    }
}
