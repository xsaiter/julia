package graphs;

public class UndirectedGraph extends Graph {
    @Override
    public void addEdge(int a, int b) {
        insertEdge(a, b);
        insertEdge(b, a);
    }

    @Override
    public boolean isDirected() {
        return false;
    }
}