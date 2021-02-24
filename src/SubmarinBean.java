public class SubmarinBean {
    private String nom;
    private int deep;

    public void plonger() {
        deep -= 50;
    }

    public void remonter() {

        if ((deep + 50) <= 0) {
            deep += 50;
        } else {
            System.out.println("Attention c'est un sous marin, pas un avion");
        }
    }

    public int getDeep() {
        return deep;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
