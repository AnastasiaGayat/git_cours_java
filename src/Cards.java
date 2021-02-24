import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Cards {

    public static void exo_cards() {
        int current_chiffre = 0;
        int current_length = 0;

        int max_chiffre = 0;
        int max_length = 0;

        try {
            File f = new File("src/data2/input3.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));


            int readLine;
            int nbTirages = Integer.parseInt(b.readLine());

            for (int i = 0; i < nbTirages; i++) {
                readLine = Integer.parseInt(b.readLine());

                if (readLine == current_chiffre) {
                    current_length++;
                    if (current_length > max_length) {
                        max_chiffre = current_chiffre;
                        max_length = current_length;
                    }
                } else {
                    current_chiffre = readLine;
                    current_length = 1;
                    if (current_length > max_length) {
                        max_chiffre = current_chiffre;
                        max_length = current_length;
                    }
                }
            }

            System.out.println("Nombre Chanceux est : " + max_chiffre);
            System.out.println("La longueur de sa plus grande serie est : " + max_length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /////////////////////////////////////////////////////////////////////////

    public static void exo_cards2() {
        ArrayList<Serie> series_list = new ArrayList();

        Serie current_serie = new Serie();

        int max_chiffre = 0;
        int max_length = 0;

        try {
            File f = new File("src/data2/input3.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));


            int readLine;
            int nbTirages = Integer.parseInt(b.readLine());

            for (int i = 0; i < nbTirages; i++) {
                readLine = Integer.parseInt(b.readLine());

                if (readLine == current_serie.getChiffre()) {
                    current_serie.setLength(current_serie.getLength() + 1);
                } else {
                    Serie serie = new Serie();
                    serie.setChiffre(readLine);
                    serie.setLength(1);
                    series_list.add(serie);
                    current_serie = serie;
                }
            }

            for (int i = 0; i < series_list.size(); i++) {
                if (series_list.get(i).getLength() > max_length) {
                    max_length = series_list.get(i).getLength();
                    max_chiffre = series_list.get(i).getChiffre();
                }
            }

            System.out.println("Nombre Chanceux est : " + max_chiffre);
            System.out.println("La longueur de sa plus grande serie est : " + max_length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////

    public static void exo_cards3() {
        ArrayList<Serie> series_list = new ArrayList();

        Serie current_serie = new Serie();
        Serie serie_chanceuse = new Serie();

        try {
            File f = new File("src/data2/input3.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));

            int readLine;
            int nbTirages = Integer.parseInt(b.readLine());

            for (int i = 0; i < nbTirages; i++) {
                readLine = Integer.parseInt(b.readLine());

                if (readLine == current_serie.getChiffre()) {
                    current_serie.setLength(current_serie.getLength() + 1);
                } else {
                    Serie serie = new Serie();
                    serie.setChiffre(readLine);
                    serie.setLength(1);
                    series_list.add(serie);
                    current_serie = serie;
                }
            }

            for (int i = 0; i < series_list.size(); i++) {
                if (series_list.get(i).getLength() > serie_chanceuse.getLength()) {
                    serie_chanceuse.setLength(series_list.get(i).getLength());
                    serie_chanceuse.setChiffre(series_list.get(i).getChiffre());
                }
            }

            System.out.println("Nombre Chanceux est : " + serie_chanceuse.getChiffre());
            System.out.println("La longueur de sa plus grande serie est : " + serie_chanceuse.getLength());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
