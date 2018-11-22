package graphs;

public class WeightedEdge<V> extends Edge<V> {
    private final double _weight;

    public WeightedEdge(V a, V b, double weight) {
        super(a, b);
        _weight = weight;
    }

    public double weight() {
        return _weight;
    }
}
