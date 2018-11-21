package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public abstract class Graph {
    protected int _nv;
    protected int _ne;
    protected final HashMap<Integer, HashSet<Integer>> _adj = new HashMap<>();

    public int nv() {
        return _nv;
    }

    public int ne() {
        return _ne;
    }

    public abstract void addEdge(int a, int b);

    public void addVertex(int v) {
        insertVertex(v);
    }

    protected void insertVertex(int v) {
        if (!_adj.containsKey(v)) {
            _adj.put(v, new HashSet<>());
            ++_nv;
        }
    }

    protected void insertEdge(int from, int to) {
        insertVertex(from);
        insertVertex(to);
        var list = _adj.get(from);
        if (!list.contains(to)) {
            list.add(to);
            ++_ne;
        }
    }

    public Stream<Integer> neighbors(int v) {
        var list = _adj.get(v);
        if (list == null) {
            return Stream.empty();
        }
        return list.stream();
    }

    public abstract boolean isDirected();
}
