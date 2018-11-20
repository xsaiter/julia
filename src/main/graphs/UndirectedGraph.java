package graphs;

public class UndirectedGraph extends Graph {

    public UndirectedGraph(int nv) {
        super(nv);
    }

    @Override
    public void addEdge(int a, int b) {
        _adj.get(a).add(b);
        _adj.get(b).add(a);
    }
}