package projava;

import java.util.ArrayList;
import java.util.List;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("yamamopto", "kis", "sugiyama");

        var result = (int) data.stream().filter(s -> s.length() >= 5).count();

        System.out.println(result);
    }
}
