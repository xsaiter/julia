package common;

@FunctionalInterface
public interface TripleFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}
