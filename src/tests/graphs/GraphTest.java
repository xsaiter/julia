package graphs;

import org.junit.Test;

public class GraphTest {
    @Test
    public void createDirectedGraph() {
        var g = new DirectedGraph<String>();
        g.addEdge(new Edge<>("a", "b"));
        g.addEdge(new Edge<>("c", "d"));
        g.addEdge(new Edge<>("a", "f"));
        var t = g;
    }
}