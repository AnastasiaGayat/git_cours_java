import java.util.Arrays;
import java.util.Random;

public class Tableaux {
    public static void main(String[] args) {
        //  exo1();
        //int[] t1 = new int[]{2, 5, 8, 12, 20};
        //  int a = 10;
        //  exo2(a, tableau);
        // System.out.println(a);
        //  System.out.println(Arrays.toString(tableau));
        //int[] t2 = new int[]{30, 5, 3, 5, 20, 5, 7, 3, 3, 20, 1, 6, 8, 20, 4};
        // fillTab(tableau);
        //  System.out.println(Arrays.toString(tableau));
        // System.out.println(getMoy(tableau));
        // printSupMoy(tableau);
        // System.out.println(nbMax(t));
        //  System.out.println(nbMax2(t));
        // System.out.println(Arrays.toString(fusion(t1, t2)));
        // System.out.println(0 % 4);
        //  exo5();
        // Exo.exo5();
    }

    public static void exo5() {
        System.out.println("coco ");

    }

    public static class Exo {
        public static void exo5() {
            System.out.println("Rico");
        }
    }

    public static double exo() {
        int i = 10;
        int j = 4;
        return i / j;
    }

    public static void exo1() {
        int[] tableau = new int[]{2, 5, 8, 12, 20};
        System.out.println(tableau[3]);
        //tableau[2] = 12;
        System.out.println(tableau.length);
        System.out.println(Arrays.toString(tableau));


        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = tableau[i] + 1;

        }
        System.out.println(Arrays.toString(tableau));


        for (int i = 1; i < tableau.length; i++) {
            tableau[i] = tableau[i - 1] + 1;
        }
        System.out.println(Arrays.toString(tableau));

        int nb_pair = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                nb_pair++;
            }
        }
        System.out.println(nb_pair);

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = 1;
        }
        System.out.println(Arrays.toString(tableau));

    }

    public static void exo2(int n, int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i]++;
        }

        n = n + 1;
    }

    public static void fillTab(int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Random().nextInt(100);
        }
    }

    public static void printTab(int[] t) {
        System.out.println(Arrays.toString(t));
    }

    public static int getMax(int[] t) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }

    public static void permute(int[] tab, int i, int j) {

        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    public static int getSum(int[] t) {

        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public static int getMoy(int[] t) {

        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum / t.length;
    }

    public static void printSupMoy(int[] t) {

        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        int moy = sum / t.length;

        for (int i = 0; i < t.length; i++) {
            if (t[i] > moy) {
                System.out.print(t[i] + ", ");
            }
        }
    }

    // O(n)  
    public static int nbMax(int[] t) {
        int max = 0;
        int nbMax = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
                nbMax = 1;
            } else if (t[i] == max) {
                nbMax++;
            }
        }
        return nbMax;
    }

    //O(2n)
    public static int nbMax2(int[] t) {
        int max = 0;
        int nbMax = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }

        for (int i = 0; i < t.length; i++) {
            if (t[i] == max) {
                nbMax++;
            }
        }

        return nbMax;
    }

    public static int[] fusion(int[] t1, int[] t2) {

        int f_length = t1.length + t2.length;
        int[] fusion = new int[f_length];

        for (int i = 0; i < t1.length; i++) {
            fusion[i] = t1[i];
        }

        for (int i = 0; i < t2.length; i++) {
            fusion[t1.length + i] = t2[i];
        }
        return fusion;

    }

    public static int exo3(int val, int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                return i;
            }

        }
        return -1;
    }
}
