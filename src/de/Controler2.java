import deExo.PartieBean;

import java.util.Scanner;

public class Controler2 {

    private PartieBean partie;


    public Controler2() {

    }

    public Controler2(String nom1, String nom2) {

    }


    public void lancer() {

        int countJ1 = 0;
        int countJ2 = 0;

        System.out.println("Joueur courant: " + partie.getjCourant().getNom());
        while (countJ1 < 3) {
            // System.out.print("Lancé " + (partie.getjCourant().getScore() + 1) + " ");

            partie.getjCourant().lancer();
            partie.getjCourant().ajouter1pt();
            //   printResult();

            if (partie.getjCourant().getGobelet().getScoreDes() == 7) {
                countJ1++;
            } else {
                countJ1 = 0;
            }
        }

        partie.changerJoueurCourant();
        //  System.out.println("-----------------------------------");

        // System.out.println("Joueur courant: " + partie.getjCourant().getNom());
        while (countJ2 < 3) {


            //  System.out.print("Lancé " + (partie.getjCourant().getScore() + 1) + " ");

            partie.getjCourant().lancer();
            partie.getjCourant().ajouter1pt();
            //  printResult();

            if (partie.getjCourant().getGobelet().getScoreDes() == 7) {
                countJ2++;
            } else {
                countJ2 = 0;
            }
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
        //  System.out.print(partie.getjCourant().getNom());
        System.out.print(" d1: " + partie.getjCourant().getGobelet().getD1().getValue());
        System.out.print(" d2: " + partie.getjCourant().getGobelet().getD2().getValue());
        System.out.println(" Gobelet score: " + partie.getjCourant().getGobelet().getScoreDes());
    }

    public void printGagnant() {
        if (getPartie().getJ1().getScore() < getPartie().getJ2().getScore()) {
            System.out.println("Le gagnat est " + getPartie().getJ1().getNom());
        } else if (getPartie().getJ1().getScore() > getPartie().getJ2().getScore()) {
            System.out.println("Le gagnat est " + getPartie().getJ2().getNom());
        } else {
            System.out.println("Egalité");
        }
    }

    public PartieBean getPartie() {
        return partie;
    }

    public void setPartie(PartieBean partie) {
        this.partie = partie;
    }
}
