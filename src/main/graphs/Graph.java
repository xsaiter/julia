package graphs;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Graph<V, E extends AbstractEdge<V>> {
    protected int _nv;
    protected int _ne;
    protected final HashMap<V, HashSet<E>> _adj = new HashMap<>();

    public int nv() {
        return _nv;
    }

    public int ne() {
        return _ne;
    }

    public abstract void addEdge(E edge);

    protected void insertEdge(V from, E edge) {
        insertVertex(edge.a());
        insertVertex(edge.b());

        var list = _adj.get(from);
        if (!list.contains(edge.b())) {
            list.add(edge);
            ++_ne;
        }
    }

    public void addVertex(V v) {
        insertVertex(v);
    }

    protected void insertVertex(V v) {
        if (!_adj.containsKey(v)) {
            _adj.put(v, new HashSet<>());
            ++_nv;
        }
    }

    protected void addEdgeForUndirected(E edge){
        insertEdge(edge.a(), edge);
        insertEdge(edge.b(), edge);
    }

    protected void addEdgeForDirected(E edge) {
        insertEdge(edge.a(), edge);
    }

    public abstract Directions direction();
}
