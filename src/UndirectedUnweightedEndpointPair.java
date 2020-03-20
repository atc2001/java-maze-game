import java.util.Objects;

public class UndirectedUnweightedEndpointPair<V> implements UnweightedEndpointPair<V> {

    /**
     * The origin vertex of the undirected unweighted endpoint pair.
     */
    private final V origin;

    /**
     * The destination vertex of the undirected unweighted endpoint pair.
     */
    private final V destination;

    /**
     * Constructs a new undirected unweighted endpoint pair using an origin vertex and a destination vertex.
     *
     * @param origin      the origin vertex of the undirected unweighted endpoint pair
     * @param destination the destination vertex of the undirected unweighted endpoint pair
     */
    public UndirectedUnweightedEndpointPair(V origin, V destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UndirectedUnweightedEndpointPair<?> that = (UndirectedUnweightedEndpointPair<?>) o;
        return (origin.equals(that.origin) && destination.equals(that.destination)) || (origin.equals(that.destination) && destination.equals(that.origin));
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, destination);
    }

    @Override
    public String toString() {
        return origin.toString() + " ↔ " + destination.toString();
    }

    @Override
    public V getOrigin() {
        return origin;
    }

    @Override
    public V getDestination() {
        return destination;
    }
}
