package common;

import java.util.Set;
import java.util.TreeSet;

public class UF<T extends Comparable<T>> {
    final Set<Entry> _entries = new TreeSet<>();

    public void add(T data) {
        _entries.add(new Entry(data));
    }

    public void union(T a, T b) {
        Entry ae = findEntry(a);
        Entry be = findEntry(b);
        if (ae != null && be != null) {
            if (ae.compareTo(be) != 0) {
                if (ae.rank > be.rank) {
                    be.parent = ae;
                    ae.rank++;
                } else {
                    ae.parent = be;
                    be.rank++;
                }
            }
        }
    }

    private Entry findEntry(T t) {
        return _entries.stream().filter(x -> t.compareTo(x.data) == 0).findFirst().get();
    }

    class Entry implements Comparable<Entry> {
        public T data;
        public int rank;
        public Entry parent;

        public Entry(T data) {
            this.data = data;
            this.rank = 0;
        }

        @Override
        public int compareTo(Entry o) {
            return data.compareTo(o.data);
        }
    }
}