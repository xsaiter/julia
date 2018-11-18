package graphs;

import java.util.HashMap;
import java.util.HashSet;

public final class VertexEdgesMap<V> {
    private final HashMap<V, HashSet<Edge<V>>> _adj = new HashMap<>();
}
