package graphs;

public class DirectedGraph extends Graph {
    @Override
    public void addEdge(int a, int b) {
        insertEdge(a, b);
    }

    @Override
    public boolean isDirected() {
        return true;
    }
}
