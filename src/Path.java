import java.util.Set;

public interface Path<V> extends Iterable<V> {

    /**
     * Gets the origin vertex of the path.
     *
     * @return the origin vertex of the path
     */
    V getOrigin();

    /**
     * Gets the destination vertex of the path.
     *
     * @return the destination vertex of the path
     */
    V getDestination();

    /**
     * Gets all the vertices of the path.
     *
     * @return all the vertices of the path
     */
    Set<V> getVertices();


}
