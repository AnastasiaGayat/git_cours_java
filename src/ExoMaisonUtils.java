import java.util.Random;

public class ExoMaisonUtils {

    public static void main(String[] args) {
        //MaisonBean mamaison = new MaisonBean();
        //  printMaison(mamaison);

        // MaisonBean[] tab = new MaisonBean[5];
        // MaisonBean[] tabNull = null;
        //  MaisonBean[] tabAvecNull = new MaisonBean[5];
        // createMaisons(tabAvecNull);
        // tabAvecNull[2] = null;
        // tabAvecNull[4] = null;
        // createMaisons(tab);
        // printMaisons(tab);
        //printMaisons(tabNull);
        // printMaisons(tabAvecNull);

        MaisonBean m = new MaisonBean();
        m.setLongueur(10);
        m.setLargeur(20);
        System.out.println("Surface: " + m.getSurface());

    }


    public static void printMaison(MaisonBean m) {
        System.out.println(m.getLongueur() + "x" + m.getLargeur());
    }

    public static void doubleMaison(MaisonBean m) {
        System.out.println(m.getLongueur() * 2 + "x" + m.getLargeur() * 2);
    }

    public static MaisonBean bigMaison(MaisonBean m1, MaisonBean m2) {

        if (m1.getLargeur() * m1.getLongueur() > m2.getLargeur() * m2.getLongueur()) {
            return m1;
        } else if (m1.getLargeur() * m1.getLongueur() < m2.getLargeur() * m2.getLongueur()) {
            return m2;
        } else {
            return null;
        }
    }

    public static void createMaisons(MaisonBean[] tab) {

        if (tab != null) {

            for (int i = 0; i < tab.length; i++) {
                tab[i] = new MaisonBean();
                tab[i].setLargeur(new Random().nextInt(100));
                tab[i].setLongueur(new Random().nextInt(100));

            }
        }
    }

    public static void printMaisons(MaisonBean[] tab) {

        if (tab == null) {
            System.out.println("Pas de maisons dans la liste");
        } else {

            for (int i = 0; i < tab.length; i++) {

                if (tab[i] == null) {
                    System.out.println("Maison " + (i + 1) + " n'existe pas");
                } else {
                    System.out.println("Maison " + (i + 1) + ": " + tab[i].getLongueur() + "x" + tab[i].getLargeur());
                }

            }
        }

    }

    public static MaisonBean bigMaison(MaisonBean[] tab) {
        return new MaisonBean();
    }

}
