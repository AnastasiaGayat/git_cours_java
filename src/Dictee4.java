public class Dictee4 {

    public static void main(String[] args) {
        System.out.println(m8(12, 12));
    }

    public static int m8(double a, double b) {
        System.out.println("a=" + a + " b=" + b);
        if (a > b) {
            return (int) b;
        } else {
            if (a < b) {
                return (int) a;
            } else if (a == 0) {
                return 100;
            } else {
                return 0;
            }

        }

    }
}

