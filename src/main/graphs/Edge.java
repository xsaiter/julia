package graphs;

public class Edge<V> implements AbstractEdge<V> {
    final V _a, _b;

    public Edge(V a, V b) {
        _a = a;
        _b = b;
    }

    public V a() {
        return _a;
    }

    public V b() {
        return _b;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + _a.hashCode();
        result = 31 * result + _b.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        var e = (Edge<V>) obj;
        return _a.equals(e._a) && _b.equals(e._b);
    }
}
