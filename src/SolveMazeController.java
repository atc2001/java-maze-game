import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.Set;

public class SolveMazeController {

    public Canvas mazeCanvas;

    public void initialize() {

        int scale = 100;

        Graph<Vertex> maze = ServiceLocator.mazeService.getMaze();

        Set<Vertex> vertices = maze.getVertices();

        mazeCanvas.setWidth(vertices.stream().map(Vertex::getX).map(x -> (x + 2) * scale).max(Integer::compareTo).orElse(0));
        mazeCanvas.setHeight(vertices.stream().map(Vertex::getY).map(y -> (y + 2) * scale).max(Integer::compareTo).orElse(0));

        GraphicsContext graphicsContext = mazeCanvas.getGraphicsContext2D();

        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.setLineWidth(scale * 0.8);

        for (Vertex vertex : vertices) {
            for (Vertex adjacentVertex : maze.getAdjacentVertices(vertex)) {
                graphicsContext.strokeLine((vertex.getX() + 1) * scale, (vertex.getY() + 1) * scale, (adjacentVertex.getX() + 1) * scale, (adjacentVertex.getY() + 1) * scale);
            }
        }
    }
}
