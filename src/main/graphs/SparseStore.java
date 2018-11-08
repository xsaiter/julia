package graphs;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SparseStore extends Store {
    final Map<Integer, LinkedList<Integer>> _buffer = new HashMap<>();

    @Override
    public Collection<Integer> neighbors(int v) {
        return _buffer.get(v);
    }

    @Override
    public void addVertex(int a, int b) {
        if (!_buffer.containsKey(a)) {
            var list = new LinkedList<Integer>();
            list.add(b);
            _buffer.put(a, list);
        } else {
            _buffer.get(a).add(b);
        }
    }
}
