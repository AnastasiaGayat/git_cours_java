import deExo.JoueurBean;

public class PartieBean {
    private int tour = 0;
    private JoueurBean j1;
    private JoueurBean j2;
    private JoueurBean jCourant;

    public PartieBean(String nomJ1, String nomJ2) {
        j1 = new JoueurBean(nomJ1);
        j2 = new JoueurBean(nomJ2);
        jCourant = j1;
    }

    public boolean terminer() {

        return tour == 10;
    }

    public void ajouter1tour() {
        tour++;
    }

    public void changerJoueurCourant() {
        if (jCourant == j1) {
            jCourant = j2;
        } else {
            jCourant = j1;
        }
    }

    public JoueurBean getjCourant() {
        return jCourant;
    }

    public JoueurBean getJ1() {
        return j1;
    }

    public JoueurBean getJ2() {
        return j2;
    }

    public int getTour() {
        return tour;
    }
}
