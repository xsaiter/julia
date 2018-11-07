package common;

import java.util.Set;
import java.util.TreeSet;

public class UF<T extends Comparable<T>> {
    final Set<Entry> _entries = new TreeSet<>();

    public void add(T data) {
        _entries.add(new Entry(data));
    }

    public void union(T a, T b) {
        Entry ae = new Entry(a);
        Entry be = new Entry(b);
        if (_entries.contains(ae) && _entries.contains(be)) {
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

    T find(T data) {
        Entry e = new Entry(data);
        if (!_entries.contains(e)) {
            throw new RuntimeException("not found");
        }
        if (e.parent == null) {
            return e.data;
        }
        var x = find(e.parent.data);
        e.parent = new Entry(x);
        return x;
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