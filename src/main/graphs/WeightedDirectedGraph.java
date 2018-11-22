package graphs;

public class WeightedDirectedGraph<V> extends Graph<V, WeightedEdge<V>> {
    @Override
    public void addEdge(WeightedEdge<V> edge) {
        addEdgeForDirected(edge);
    }

    @Override
    public Directions direction() {
        return Directions.Directed;
    }
}
