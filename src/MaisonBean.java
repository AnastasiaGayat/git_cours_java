public class MaisonBean {
    private int largeur;
    private int longueur;


    public MaisonBean() {

    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getSurface() {
        return longueur * largeur;
    }

    public static int getSurface2(int longueur, int largeur) {
        return longueur * largeur;
    }

}
