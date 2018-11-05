package graphs;

import org.junit.Assert;
import org.junit.Test;

public class GraphTest {

    @Test
    public void addEdge() {
        var g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(3,4);

        Assert.assertEquals(3, g.ne());
        Assert.assertEquals(5,g.nv());
    }

    @Test
    public void neighbors() {
        var g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(3,4);

        var res = g.neighbors(1);

        Assert.assertEquals(3, res.size());
    }

    @Test
    public void traversalBFS() {
    }

    @Test
    public void traversalDFS() {
    }
}