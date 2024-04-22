package projava;

import java.util.regex.Pattern;

public class CheckFloat {
    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO, LAST_ZERO, MINUS
    }

//    static boolean check(String data) {
//        var state = FloatState.START;
//        var num = '0';
//        for(char ch : data.toCharArray()) {
//            switch (state) {
//                case START -> { //開始
//                    if (ch == '0') {
//                        state = FloatState.ZERO;
//                    } else if (ch >= '1' && ch <= '9') {
//                        state = FloatState.INT;
//                    } else if ( ch =='-') {
//                        state = FloatState.MINUS;
//                    } else {
//                        return false;
//                    }
//                }
//                case MINUS -> { //マイナス
//                    if (ch == '0') {
//                        state = FloatState.ZERO;
//                    } else if (ch >= '1' && ch <= '9') {
//                        state = FloatState.INT;
//                    } else {
//                        return false;
//                    }
//                }
//                case ZERO -> { // 頭のゼロ
//                    if (ch == '.') {
//                        state = FloatState.FRAC_START;
//                    } else {
//                        return false;
//                    }
//                }
//                case INT -> { // 整数部
//                    if (ch >= '0' && ch <= '9') {
//                        state = FloatState.INT;
//                    } else if (ch == '.') {
//                        state = FloatState.FRAC_START;
//                    } else {
//                        return false;
//                    }
//                }
//                case FRAC_START, FRAC -> { // 小数部開始
//                    if (ch >= '0' && ch <= '9') {
//                        state = FloatState.FRAC;
//                    } else {
//                        return false;
//                    }
//                }
//            }
//            num = ch;
//        }
//        if(num == '0' && state != FloatState.ZERO) {
//            state = FloatState.LAST_ZERO;
//        }
//
//        return switch (state) {
//            case ZERO, FRAC, INT-> true;
//            default -> false;
//        };
    static Pattern pat = Pattern.compile("(0|([1-9][0-9]*))(\\.[0-9]+)?");
    static boolean check(String data) {
        return pat.matcher(data).matches();
    }
    public static void main(String[] args) {
        System.out.println(check(""));
        System.out.println(check("012"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
    }
}
