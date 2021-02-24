public class Slide67 {

    public static void main(String[] args) {

        //  System.out.println(sansE_1("MEmebebenene hehehE"));
        // System.out.println(nb_a("Anastasia"));
        // System.out.println(inverse("ANASTASIA"));
        //System.out.println(nb_maj("ANAstasIA"));
        // System.out.println(sans_voy("BLABLABLA"));
        // System.out.println(sans_maj("BLAcoucocuBLABLAblablabla"));
        // System.out.println(max("hello world"));
        // System.out.println(replace(" toto en vacances"));
        //System.out.println(replace_first_esp("   toto en vacances"));
        // System.out.println(replace_first_esp2("   toto en vacances"));

        // String str = "anastasia";
        // System.out.println(str.substring(1));
        // time();


        // System.out.println(without_space("    toto en vacances    "));
        //System.out.println(isPalindrome("kayak"));
        // System.out.println(isPalindrome("anastasia"));
        //System.out.println(ascii_moy("aaabbb"));
        //mult47();
        System.out.println(exo());


    }

    public static void time() {
        long debut = System.currentTimeMillis();
        for (long i = 0; i < 10000000; i++) {
            String str = replace_first_esp("   toto en vacances");
            //System.out.println("remplacerEspace=" + remplacerEspace);
        }
        System.out.println("terminer en " + (System.currentTimeMillis() - debut));

        debut = System.currentTimeMillis();
        for (long i = 0; i < 10000000; i++) {
            String str = replace_first_esp2("   toto en vacances");
        }
        System.out.println("terminer en " + (System.currentTimeMillis() - debut));

    }

    public static String sansE_1(String avec) {

        String sans = avec.replace("e", "");
        sans = sans.replace("E", "");
        return sans;
    }

    public static String sansE_2(String avec) {
        String sortie = "";
        for (int i = 0; i < avec.length(); i++) {
            char c = avec.charAt(i);
            //j'applique la transformation
            if (c != 'e' && c != 'E') {
                sortie += c; //Ajoute
            }
        }

        return sortie;
    }

    public static int nb_a(String str) {
        int nb_a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                nb_a++;
            }

        }
        return nb_a;
    }

    public static String inverse(String str) {
        String inverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inverse = inverse + str.charAt(i);
        }
        return inverse;
    }

    public static int nb_maj(String str) {
        int nb_maj = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                nb_maj++;
            }
        }

        return nb_maj;
    }

    public static String sans_voy(String avec_voy) {
        String voyelles = "AEIOUY";

        String sans_voy = "";

        for (int i = 0; i < avec_voy.length(); i++) {
            if (!(voyelles.indexOf(Character.toUpperCase(avec_voy.charAt(i))) >= 0)) {
                sans_voy = sans_voy + avec_voy.charAt(i);
            }
        }
        return sans_voy;

    }

    public static String sans_maj(String str) {

        String sans_maj = "";
        for (int i = 0; i < str.length(); i++) {

            if (!(Character.isUpperCase(str.charAt(i)))) {
                sans_maj = sans_maj + str.charAt(i);
            }
        }
        return sans_maj;
    }

    public static char max(String str) {
        char res = 'a';

        for (int i = 0; i < str.length(); i++) {

            if ((int) str.charAt(i) > (int) res) {
                res = str.charAt(i);
            }
        }

        return res;

    }

    public static String replace(String str) {

        String res = str.replace(" ", "_");

        return res;
    }


    public static String replace_first_esp(String str) {

        boolean on_a_rencontre_des_lettres = true;
        String res = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(str.charAt(i) == 32 && on_a_rencontre_des_lettres)) {
                res = res + str.charAt(i);
                on_a_rencontre_des_lettres = false;
            }
        }
        return res;
    }

    public static String replace_first_esp2(String str) {

        boolean lettres_pas_trouve = true;

        int i = 0;
        while (lettres_pas_trouve && i < str.length()) {

            if (str.charAt(i) != 32) {
                lettres_pas_trouve = false;
            }
            i++;
        }
        return str.substring(i - 1);
    }

    public static String without_space(String str) {
        return str.trim();
    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static int ascii_moy(String str) {

        int sum = 0;
        int nb = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
            nb++;
        }

        return sum / nb;
    }

    public static void mult47() {
        for (int i = 1; i <= 10000; i++) {
            if (i % 47 == 0) {
                System.out.println(i);
            }

        }
    }

    public static int exo() {
        int res = 0;
        boolean isNotFound = true;

        int prec = 1;
        int i = 2;
        while (isNotFound) {
            if (i % 5 == 0 && i % 11 == 0 && i % 7 == 0 && (i + prec) % 36 == 1) {
                isNotFound = false;
                res = i;
            } else {
                prec = i;
                i++;
            }
        }

        return res;
    }
}
