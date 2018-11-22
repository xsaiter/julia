package graphs;

public class WeightedUndirectedGraph<V> extends Graph<V, WeightedEdge<V>> {
    @Override
    public void addEdge(WeightedEdge<V> edge) {
        addEdgeForUndirected(edge);
    }

    @Override
    public Directions direction() {
        return Directions.Undirected;
    }
}
