import java.util.Set;

public interface Path<V> {

    V getOrigin();

    V getDestination();

    Set<V> getVertices();


}
