package projava;

public class InstanceMethodSample {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (englishScore + mathScore) / 2;
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
        var a = kis.average();
        System.out.println("平均点は%d点です".formatted(a));
    }

    static int average(Student student) {
        return (student.englishScore + student.mathScore) / 2;
    }
}
