package graphs;

import common.Helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public abstract class Graph {
    protected final int _nv;
    protected final ArrayList<HashSet<Integer>> _adj;

    public Graph(int nv) {
        _nv = nv;
        _adj = Helper.allocateArray(nv, () -> new HashSet<>());
    }

    public int nv() {
        return _nv;
    }

    public abstract void addEdge(int a, int b);

    public Stream<Integer> neighbors(int v) {
        return _adj.get(v).stream();
    }
}
