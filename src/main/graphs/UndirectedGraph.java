package graphs;

public class UndirectedGraph<V> extends Graph<V, Edge<V>> {
    @Override
    public void addEdge(Edge<V> edge) {
        addEdgeForUndirected(edge);
    }

    @Override
    public Directions direction() {
        return Directions.Undirected;
    }
}