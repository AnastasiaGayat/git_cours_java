public class Couleur {

    int votes;
    String nom;

    public Couleur() {
        this.votes = 1;
        this.nom = "";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}