package graphs;

import java.util.HashMap;

public class GraphForward<V> {
    private final HashMap<V, Integer> _front = new HashMap<>();
    private final HashMap<Integer, V> _back = new HashMap<>();
    private int _nv = 0;
    private final Graph _g;

    public GraphForward(Directions direction) {
        _g = createGraph(direction);
    }

    private static Graph createGraph(Directions direction) {
        switch (direction) {
            case Directed:
                return new DirectedGraph();
            case Undirected:
                return new UndirectedGraph();
            default:
                throw new RuntimeException("unexpected direction: " + direction);
        }
    }

    public Graph getGraph() {
        return _g;
    }

    public void addEdge(V a, V b) {
        indexingVertex(a);
        indexingVertex(b);
        _g.addEdge(indexOf(a), indexOf(b));
    }

    public void addVertex(V v) {
        indexingVertex(v);
        _g.addVertex(indexOf(v));
    }

    private void indexingVertex(V v) {
        if (!_front.containsKey(v)) {
            _front.put(v, _nv);
            if (!_back.containsKey(_nv)) {
                _back.put(_nv, v);
            }
            ++_nv;
        }
    }

    public Integer indexOf(V vertex) {
        return _front.get(vertex);
    }

    public V vertexOf(int index) {
        return _back.get(index);
    }
}