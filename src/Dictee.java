public class Dictee {

    public static void main(String[] args) {
        m1();
        int res = m2(4) + m2(5.5);
        System.out.println("res = " + res);
    }

    public static void m1() {
        System.out.println("m1");
    }

    public static int m2(double p1) {
        System.out.println("m2 " + p1);
        return (int) p1;
    }
}
