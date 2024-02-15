package projava;

public class MethodSample {
    public static void main(String[] args) {
        var result = twice(3);
        System.out.println(result);
    }

    static int twice(int n) {
        return n * 2;
    }
}