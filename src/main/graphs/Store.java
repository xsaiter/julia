package graphs;

import java.util.Collection;

public abstract class Store {
    public abstract Collection<Integer> neighbors(int v);

    public abstract void addVertex(int a, int b);

    public static Store forSparse() {
        return new SparseStore();
    }

    public static Store forDense() {
        return new DenseStore();
    }

    public static Store forIndex(int capacity) {
        return new IndexStore(capacity);
    }
}
