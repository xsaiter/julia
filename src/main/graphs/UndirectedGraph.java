package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;


public class UndirectedGraph<V> extends Graph<V> {
    private final HashMap<V, HashSet<Edge<V>>> _adj = new HashMap<>();
    private int _nv = 0;
    private int _ne = 0;

    public int nv() {
        return _nv;
    }

    public int ne() {
        return _ne;
    }

    public void addVertex(V v) {
        if (!containsVertex(v)) {
            _adj.put(v, new HashSet<>());
            ++_nv;
        }
    }

    public void addEdge(V a, V b) {
        doAddEdge(a, b);
        doAddEdge(b, a);
        ++_ne;
    }

    private void doAddEdge(V a, V b) {
        var edges = _adj.get(a);
        if (edges == null) {
            edges = new HashSet<>();
            _adj.put(a, edges);
            ++_nv;
        }
        var edge = new Edge(a, b);
        edges.add(edge);
    }

    public boolean containsVertex(V v) {
        return _adj.containsKey(v);
    }

    public Iterable<Edge<V>> incidentEdges(V v) {
        return _adj.get(v);
    }

    public Stream<V> neighbors(V v) {
        return _adj.get(v).stream().map(x -> x.b());
    }
}
