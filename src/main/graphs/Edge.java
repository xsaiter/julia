package graphs;

public class Edge {
    final int _a, _b;
    final double _w;

    public Edge(int a, int b, double w) {
        _a = a;
        _b = b;
        _w = w;
    }

    public int A() {
        return _a;
    }

    public int B() {
        return _b;
    }

    public double W() {
        return _w;
    }
}
