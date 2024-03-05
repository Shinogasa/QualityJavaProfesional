package projava;


public class RunLengthCompression {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabccccccccccccddd";

        var count = COUNTER_BASE;
        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (prev == ch) {
                count++;
                if (count == 9) {
                    builder.append('9');
                    count = COUNTER_BASE;
                    prev = 0;
                }
            } else {
                if(count >= 0) {
                    builder.append((char) ('0' + count));
                    count = COUNTER_BASE;
                }
                builder.append(ch);
                prev = ch;
            }
        }
        if(count >= 0) {
            builder.append((char) ('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);

        System.out.println("---Practice1---");
        practice1();
        System.out.println("---Practice2---");
        practice2();
    }

    static void practice1() {
       var data = "aa0bcd1efg1gg0abc";

        var builder = new StringBuilder();
        var uppercase_flag = 0;
        for(var ch : data.toCharArray()) {
            if(ch == '0') {
                uppercase_flag = 1;
            } else if(ch == '1') {
                uppercase_flag = 0;
            } else {
                if(uppercase_flag == 0) {
                    builder.append(ch);
                } else {
                    builder.append(Character.toUpperCase(ch));
                }
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }

    static void practice2() {
        var data = "ab0c1ba2bc9cd1";

        var builder = new StringBuilder();
        char prev = 0;
        for (var ch : data.toCharArray()) {
            if (Character.toString(ch).matches("[0-9]")) {
                builder.append(String.valueOf(prev).repeat(Math.max(0, Integer.parseInt(Character.toString(ch)) + 1)));
            } else {
                prev = ch;
                builder.append(ch);
            }
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
