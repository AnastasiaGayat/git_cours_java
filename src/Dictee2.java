public class Dictee2 {

    public static void main(String[] args) {

        String res = m3() + m4(3, 4);
        System.out.println("res=" + res);
    }

    public static String m3() {
        return "Hello World";
    }

    public static int m4(int p1, int p2) {
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        System.out.println("p1+p2=" + (p1 + p2));
        return p1 + p2;
    }


}
