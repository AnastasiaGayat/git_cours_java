package deExo;

public class JoueurBean {

    private String nom;
    private GobeletBean gobelet;
    private int score = 0;
    private boolean tricheur;

    public JoueurBean(String nom) {
        this.nom = nom;

        gobelet = new GobeletBean(tricheur);
        tricheur = false;
    }

    public void lancer() {
        gobelet.lancer();
    }

    public void ajouter1pt() {
        score++;
    }

    public String getNom() {
        return nom;
    }

    public GobeletBean getGobelet() {
        return gobelet;
    }

    public int getScore() {
        return score;
    }

    public boolean isTricheur() {
        return tricheur;
    }

    public void setTricheur(boolean tricheur) {
        this.tricheur = tricheur;
        gobelet = new GobeletBean(tricheur);
    }

    public void setGobelet(GobeletBean gobelet) {
        this.gobelet = gobelet;
    }
}
