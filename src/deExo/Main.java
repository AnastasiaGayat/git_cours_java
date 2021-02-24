package deExo;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Controler2 c = new Controler2();

        int sumScore = 0;
        int n = 10000;

        for (int i = 0; i < (n / 2); i++) {

            //c.demanderNom();
            c.setPartie(new PartieBean("adam", "anas"));
            c.lancer();
            //c.afficherScore();
            //c.printGagnant();

            sumScore += c.getPartie().getJ1().getScore() + c.getPartie().getJ2().getScore();
        }

        System.out.println("Nombre Moyenne de lancés a faire pour gagner: " + (sumScore / n));


        // deExo.DeBean de = new deExo.DeBean(9);


//        PaysBean fr = new PaysBean();
//        fr.setNom("France");
//        fr.setPopulation(66990000);
//        fr.setSurface(643801);
//
//        System.out.println("Population actuelle : " + fr.getPopulation() + " Densité actuelle: " + fr.getDensite() + " hab/km2");
//
//
//        for (int i = 0; i < 10; i++) {
//            fr.setPopulation((int) (fr.getPopulation() * 1.01));
//
//            System.out.println("Population dans " + (i + 1) + " ans: " + fr.getPopulation() + " Densité: " + fr.getDensite());
//        }

        //SubmarinBean s = new SubmarinBean();
        //   s.setNom("Squall");
        // s.plonger();
        // s.plonger();
        // s.remonter();
        // s.remonter();
        // s.remonter();
        //  System.out.println("Nom: " + s.getNom());
        // System.out.println("Profondeur: " + s.getDeep());


        //Algo algo = new Algo();
        // algo.heure(432124);

        // deExo.DeBean de = new deExo.DeBean();
        // System.out.println("Valeur avant: " + de.getValeur());

        // for (int i = 0; i < 100; i++) {

        // de.lancer();
        //  System.out.println("Valeur apres: " + de.getValeur());
        //  }

    }


    public static void crepe2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de crepes? ");
        int nb = scanner.nextInt();
        scanner.nextLine();
        crepe(nb);

    }


    public static void crepe(int nb) {

        double far = 18.75;
        double oeuf = 0.13;
        System.out.println("Farine: " + (far * nb));
        System.out.println("Oeufs: " + (oeuf * nb));

    }


    public static void boul2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de croissants? ");
        int nbCr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Combien de baguettes? ");
        int nbBag = scanner.nextInt();
        scanner.nextLine();

        boul(nbCr, nbBag);

    }


    public static void boul(int nbCr, int nbBag) {

        double cr = 1.10;
        double bag = 0.9;
        System.out.println("Total: " + (cr * nbCr + bag * nbBag));

    }

    public static int readIntFromConsole() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre ");
        int nb = scanner.nextInt();
        scanner.nextLine();
        return nb;
    }

    public static int multFromConsole() {

        int a = readIntFromConsole();
        int b = readIntFromConsole();

        return a * b;
    }


    public static void met() {
        int i = 5;
        int j = afficherPlus1(i, 3) + afficherPlus1(i, i + 1);
        j += afficherPlus1(i, j);
        System.out.println("i=" + i + " j=" + j);
    }

    public static int afficherPlus1(int i, int k) {
        if (i > k) {
            i = i % k;
        } else {
            i += k;
        }
        System.out.println("i=" + i + " k=" + k);
        return i;
    }


}


// Algo algo_lundi = new Algo();
// Yaourt yaourt_exo = new Yaourt();
// Cards cards = new Cards();
// Creneau creneau = new Creneau();
// System.out.println(algo_lundi.somme(5,3));
// System.out.println(algo_lundi.ex1());
// algo_lundi.ex2();
// algo_lundi.ex4(4,2);
// algo_lundi.ex6();
// algo_lundi.ex7();
// algo_lundi.ex5(1,2,3);
// System.out.println(algo_lundi.exScan());
// System.out.println("La moyenne est " + algo_lundi.exScanEx3());
// System.out.println("Prix total: " + algo_lundi.exScanEx4());
// algo_lundi.exCondEx1();
// algo_lundi.examen();

// yaourt_exo.yaourt();
// yaourt_exo.yaourt2();
// yaourt_exo.yaourt3();
// cards.exo_cards();
// cards.exo_cards2();
// cards.exo_cards3();

// creneau.create_creneau_list();
// creneau.decomposition();
// creneau.func();
// creneau.calc_i_debut("1 08:00-17:59");
// creneau.calc_i_fin("1 08:00-17:59");