public class MatchBean {

    private EquipeBean equipe1, equipe2;

    public EquipeBean gagnant() {
        if (equipe1.getScore() > equipe2.getScore()) {
            return equipe1;
        } else if (equipe1.getScore() < equipe2.getScore()) {
            return equipe2;
        } else {
            return null;
        }
    }

    //GETTER SETTER

    public EquipeBean getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(EquipeBean equipe1) {
        this.equipe1 = equipe1;
    }

    public EquipeBean getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(EquipeBean equipe2) {
        this.equipe2 = equipe2;
    }


}