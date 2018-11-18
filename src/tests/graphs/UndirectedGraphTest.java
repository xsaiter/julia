package graphs;

import org.junit.Test;

public class UndirectedGraphTest {
    @Test
    public void addEdge() {
        var g = new UndirectedGraph<Integer>();
        g.addEdge(10, 20);
        g.addEdge(10, 30);
        g.addEdge(10, 20);
        g.neighbors(10);
    }
}