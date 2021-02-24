import deExo.PartieBean;

import java.util.Scanner;

public class Controler {

    private PartieBean partie;

    public Controler() {

    }


    public void lancer() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Tour " + (i + 1));

            partie.getjCourant().lancer();
            printResult();

            if (partie.getjCourant().getGobelet().getScoreDes() > 7) {
                partie.getjCourant().ajouter1pt();
            }

            partie.changerJoueurCourant();

            partie.getjCourant().lancer();
            printResult();

            if (partie.getjCourant().getGobelet().getScoreDes() > 7) {
                partie.getjCourant().ajouter1pt();
            }
            partie.changerJoueurCourant();

            partie.ajouter1tour();

            System.out.println("-----------------------------------");

        }
    }

    public void demanderNom() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nom joueur 1: ");
        String nom1 = sc.nextLine();
        System.out.println("Nom joueur 2: ");
        String nom2 = sc.nextLine();

        partie = new PartieBean(nom1, nom2);
    }

    public void afficherScore() {
        System.out.println("Score est:");
        System.out.println(partie.getJ1().getNom() + " " + partie.getJ1().getScore());
        System.out.println(partie.getJ2().getNom() + " " + partie.getJ2().getScore());

    }

    private void printResult() {
        System.out.print(partie.getjCourant().getNom());
        System.out.print(" d1: " + partie.getjCourant().getGobelet().getD1().getValue());
        System.out.print(" d2: " + partie.getjCourant().getGobelet().getD2().getValue());
        System.out.println(" Gobelet score: " + partie.getjCourant().getGobelet().getScoreDes());
    }

    public void printGagnant() {
        if (getPartie().getJ1().getScore() > getPartie().getJ2().getScore()) {
            System.out.println("Le gagnat est " + getPartie().getJ1().getNom());
        } else if (getPartie().getJ1().getScore() < getPartie().getJ2().getScore()) {
            System.out.println("Le gagnat est " + getPartie().getJ2().getNom());
        } else {
            System.out.println("Egalité");
        }
    }

    public PartieBean getPartie() {
        return partie;
    }
}
