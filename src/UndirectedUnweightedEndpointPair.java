import java.util.Objects;

public class UndirectedUnweightedEndpointPair<V> implements UnweightedEndpointPair<V> {

    private final V origin;

    private final V destination;

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
