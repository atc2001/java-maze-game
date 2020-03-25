public interface EndpointPair<V> {
    /**
     * Gets the origin vertex of the endpoint pair.
     *
     * @return the origin vertex of the endpoint pair
     */
    V getOrigin();

    /**
     * Gets the destination vertex of the endpoint pair.
     *
     * @return the destination vertex of the endpoint pair
     */
    V getDestination();
}
