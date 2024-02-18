package projava;

import java.util.stream.IntStream;

public class MethodSample {
    public static void main(String[] args) {
        IntStream.range(0, 3)
                .map(MethodSample::twice)
            .forEach(System.out::println);
    }

    static int twice(int n) {
        return n * 2;
    }
}