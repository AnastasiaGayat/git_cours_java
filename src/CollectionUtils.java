import java.util.ArrayList;
import java.util.Random;

public class CollectionUtils {

    public static void main(String[] args) {
        ArrayList<EleveBean2> list = new ArrayList<>();
        fillList(list, 10);
        list.add(new EleveBean2("anas", 10000));
        printList(list);
        System.out.println(getMax(list).getNom() + " " + getMax(list).getNote());
        supInfMoyenne(list);
        printList(list);
    }


    /**
     * Remplis la liste d’eleve leur donnant des noms et note aléatoire
     */
    public static void fillList(ArrayList<EleveBean2> eleveArrayList, int nbEleve) {
        for (int i = 0; i < nbEleve; i++) {
            EleveBean2 eleve = new EleveBean2(getRandomName(), 1);
            eleveArrayList.add(eleve);
        }

    }

    /**
     * Affiche la liste dans la console.
     * Vous pouvez essayé d'utiliser la surchage de toString d'EleveBean
     */
    public static void printList(ArrayList<EleveBean2> eleveArrayList) {
        for (int i = 0; i < eleveArrayList.size(); i++) {
            System.out.println("Nom: " + eleveArrayList.get(i).getNom() + " Note: " + eleveArrayList.get(i).getNote());
        }
    }

    /**
     * Affiche et retourne le 1er élève avec la meilleur note
     */
    public static EleveBean2 getMax(ArrayList<EleveBean2> eleveArrayList) {
        EleveBean2 meilleur = eleveArrayList.get(0);
        for (int i = 0; i < eleveArrayList.size(); i++) {
            if (eleveArrayList.get(i).getNote() > meilleur.getNote()) {
                meilleur = eleveArrayList.get(i);
            }
        }
        return meilleur;
    }

    /**
     * Retire les éléves n’ayant pas la moyenne de la classe
     */
    public static void supInfMoyenne(ArrayList<EleveBean2> eleveArrayList) {
        int sum = 0;
        for (int i = 0; i < eleveArrayList.size(); i++) {
            sum += eleveArrayList.get(i).getNote();
        }
        int moyenne = sum / eleveArrayList.size();
        System.out.println("Moyenne=" + moyenne);
        
        for (int i = 0; i < eleveArrayList.size(); i++) {
            if (eleveArrayList.get(i).getNote() < moyenne) {
                eleveArrayList.remove(i);
            }
        }
    }

    /**
     * Retourne un prénom aléatoire
     */
    public static String getRandomName() {
        String[] name = new String[]{"Toto", "Tata", "Titi", "Bob", "Alfred"};
        return name[new Random().nextInt(name.length)];
    }

}