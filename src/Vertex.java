import java.util.Objects;

public class Vertex {

    /**
     * The x co-ordinate of the vertex.
     */
    private final int x;

    /**
     * The y co-ordinate of the vertex.
     */
    private final int y;

    /**
     * Constructs a new vertex with an x co-ordinate and a y co-ordinate.
     *
     * @param x the x co-ordinate of the vertex
     * @param y the y co-ordinate of the vertex
     */
    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;

        if (other == null || getClass() != other.getClass()) return false;

        Vertex vertex = (Vertex) other;

        return x == vertex.x && y == vertex.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

    /**
     * Returns the x co-ordinate of the vertex.
     *
     * @return the x co-ordinate of the vertex
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y co-ordinate of the vertex.
     *
     * @return the y co-ordinate of the vertex
     */
    public int getY() {
        return y;
    }

    /**
     * Checks if a vertex is adjacent to this vertex.
     *
     * @param other the vertex to check for adjacency to this vertex
     * @return true if the vertex is adjacent to this vertex; otherwise, false
     */
    public boolean isAdjacent(Vertex other) {
        return (x + 1 == other.x && y == other.y) || (x == other.x && y + 1 == other.y) || (x - 1 == other.x && y == other.y) || (x == other.x && y - 1 == other.y);
    }
}
