public class EquipeBean {

    private String nom;
    private int score;


    public void add1Pts() {
        score++;
    }

    //GETTER SETTER


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}