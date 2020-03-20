public class MazeService {

    /**
     * The generated maze.
     */
    private Graph<Vertex> maze;

    /**
     * Gets the generated maze.
     *
     * @return the generated maze
     */
    public Graph<Vertex> getMaze() {
        return maze;
    }

    /**
     * Sets the generated maze.
     *
     * @param maze the generated maze
     */
    public void setMaze(Graph<Vertex> maze) {
        this.maze = maze;
    }
}
