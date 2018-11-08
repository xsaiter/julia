package graphs;

import common.Helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class IndexStore extends Store {
    final ArrayList<LinkedList<Integer>> _buffer;

    public IndexStore(int capacity){
        _buffer = Helper.allocateArray(capacity, () -> new LinkedList<>());
    }

    @Override
    public Collection<Integer> neighbors(int v) {
        return _buffer.get(v);
    }

    @Override
    public void addVertex(int a, int b) {
        _buffer.get(a).add(b);
    }
}
