package graphs;

public class DirectedGraph extends Graph {
    public DirectedGraph(int nv) {
        super(nv);
    }

    @Override
    public void addEdge(int a, int b) {
        _adj.get(a).add(b);
    }
}
