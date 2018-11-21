package graphs;

import org.junit.Test;

public class GraphForwardTest {
    @Test
    public void createDirectedGraph() {
        var forward = new GraphForward<Integer>(Directions.Directed);
        forward.addEdge(10, 20);
        forward.addEdge(10, 30);
        forward.addEdge(10, 20);

        var g = forward.getGraph();
        var tmp = g;
    }
}