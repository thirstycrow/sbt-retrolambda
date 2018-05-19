import java.util.function.Function;

interface Test {
    default void run() {}
}

class TestImpl implements Test {
    int f(Function<String, Integer> g) {
        return g.apply("ignore");
    }

    int g() {
        return f(ignore -> 100);
    }
}