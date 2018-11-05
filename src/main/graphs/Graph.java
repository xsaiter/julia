package graphs;

import common.Helper;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Graph {
    final int _nv;
    int _ne;
    ArrayList<LinkedList<Integer>> _adj;

    public Graph(int nv) {
        _nv = nv;
        _adj = Helper.newArray(_nv, () -> new LinkedList<>());
    }

    public int nv() {
        return _nv;
    }

    public int ne() {
        return _ne;
    }

    public void addEdge(int a, int b) {
        _adj.get(a).add(b);
        _adj.get(b).add(a);
        ++_ne;
    }

    public Collection<Integer> neighbors(int v) {
        return _adj.get(v);
    }

    public void traversalBFS(int s, Consumer<Integer> visit) {
        ArrayList<Boolean> marked = Helper.newArray(nv(), () -> false);
        Queue<Integer> q = new ArrayDeque<>(nv());
        q.add(s);
        while (!q.isEmpty()) {
            int p = q.poll();
            var nbrs = neighbors(p);
            for (var nbr : nbrs) {
                if (!marked.get(nbr)) {
                    visit.accept(nbr);
                    marked.set(nbr, true);
                    q.add(nbr);
                }
            }
        }
    }

    public void traversalDFS(int s, Consumer<Integer> visit) {
        ArrayList<Boolean> marked = Helper.newArray(nv(), () -> false);
        DFS(s, marked, visit);
    }

    private void DFS(int i, ArrayList<Boolean> marked, Consumer<Integer> visit) {
        marked.set(i, true);
        var nbrs = neighbors(i);
        for (var nbr : nbrs) {
            if (!marked.get(nbr)) {
                visit.accept(nbr);
                DFS(nbr, marked, visit);
            }
        }
    }
}
