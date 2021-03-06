package graphs;

public class DirectedGraph<V> extends Graph<V, Edge<V>> {
    @Override
    public void addEdge(Edge<V> edge) {
        addEdgeForDirected(edge);
    }

    @Override
    public Directions direction() {
        return Directions.Directed;
    }
}
