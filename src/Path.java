import java.util.Set;

public interface Path<V> extends Iterable<V> {

    V getOrigin();

    V getDestination();

    Set<V> getVertices();


}
