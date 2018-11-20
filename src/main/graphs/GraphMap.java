package graphs;

import java.util.HashMap;

public class GraphMap<V> {
    private final HashMap<V, Integer> _index = new HashMap<>();
    private final HashMap<Integer, V> _reverseIndex = new HashMap<>();
    private int _idx = 0;

    public void addVertex(V v) {
        if (!_index.containsKey(v)) {
            _index.put(v, _idx);
            if (!_reverseIndex.containsKey(_idx)) {
                _reverseIndex.put(_idx, v);
            }
            ++_idx;
        }
    }

    public DirectedGraph buildGraph(){
        var g = new DirectedGraph(_idx);
        for(var pair : _index.entrySet()){

        }
        return g;
    }

    public void addEdge(V a, V b) {
        addVertex(a);
        addVertex(b);
    }

    public Integer indexByVertex(V v) {
        return _index.get(v);
    }

    public V vertexByIndex(int i) {
        return _reverseIndex.get(i);
    }
}