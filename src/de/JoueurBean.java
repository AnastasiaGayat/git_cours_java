import deExo.GobeletBean;

public class JoueurBean {

    private String nom;
    private GobeletBean gobelet;
    private int score = 0;

    public JoueurBean(String nom) {
        this.nom = nom;
        gobelet = new GobeletBean();
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


}
