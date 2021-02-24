import java.util.ArrayList;
import java.util.Scanner;

public class Algo {


    public static int somme(int a, int b) {

        return a + b;

    }

    public static int ex1() {
        int i = 1;
        int j = i + 8;
        i = 8;
        return i + j;
    }

    public static void ex2() {
        int i = 7;
        int j = 12;
        int w = i + j;
        i = 11;
        w = j - i;
        System.out.println(i);
        System.out.println(j);
        System.out.println(w);
    }

    public static void ex4(int a, int b) {

        int i = a;
        int j = b;
        int temp = i;
        i = j;
        j = temp;
        System.out.println(i);
        System.out.println(j);

    }

    public static void ex5(int i, int j, int w) {

        int a = i;
        int b = j;
        int c = w;
        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println(a + " " + b + " " + c);

    }

    public static void ex6() {

        String i = "423";
        String j = "12";
        String w = i + j;
        System.out.println(w);
    }

    public static void ex7() {

        String i = "423";
        String j = "12";
        String w = i + (j + j);
        System.out.println(w);
    }

    public static int exScan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre: ");
        int nombre = scanner.nextInt();
        scanner.nextLine();
        return nombre;
    }

    public static int exScanEx3() {
        int res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre 1: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez entrer un nombre 2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez entrer un nombre 3: ");
        int n3 = scanner.nextInt();
        scanner.nextLine();
        return res = (n1 + n2 + n3) / 3;
    }

    public static int exScanEx4() {
        int total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer prix HT: ");
        int prixHT = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez entrer la quantité: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez entrer le taux TVA: ");
        int TVA = scanner.nextInt();
        scanner.nextLine();
        return total = (prixHT + prixHT * TVA / 100) * n;
    }

    public static void exCondEx1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre 1: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Veuillez entrer un nombre 2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) {
            System.out.println("Produit est negatif");
        } else {
            System.out.println("Produit est positif");
        }

    }


    public static void heure(int seconde) {

        int h = 0;
        int m = seconde / 60;
        int sec = seconde % 60;


        if (m >= 60) {
            h = m / 60;
            m = m % 60;
        }


        System.out.println(h + "h " + m + "m " + sec + "s ");

    }


    public static void examen() {
        int sum = 0;
        int nb = 0;
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrer un nombre : " + (i + 1));


            int n = -1;

            while (n < 0 || n > 20) {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n < 0 || n > 20) {
                    System.out.println("Veuillez entrer un nombre  entre 0 et 20: ");
                }
            }

            list.add(n);
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(list.get(i));
        }

    }

}




