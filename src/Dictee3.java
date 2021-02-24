public class Dictee3 {

    public static void main(String[] args) {

        System.out.println(m5("hello", 3, 4));
        System.out.println(m6(12, 3));
    }

    public static String m5(String p1, int p2, double p3) {
        return p1 + (p2 + p3);
    }

    public static int m6(int p1, int p2) {
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        return p1 % p2;
    }


}
