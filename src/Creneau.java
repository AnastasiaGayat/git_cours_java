import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;

public class Creneau {

    public static void func()
    {
        ArrayList<ArrayList<Boolean>>  jours = new ArrayList<>();

        boolean isFound = false;

        // Remplissage de chaque jour de la liste "jours" (5 jours)
        // avec la liste de tous les minutes de la journée de 8:00 a 17:59 avec valeur true (disponible) par defaut

        for (int i=0; i<5;i++)
        {
            jours.add(new ArrayList<Boolean>());

            for (int j = 0; j < 600; j++)
            {
                    jours.get(i).add(true);
            }

            System.out.println("Jour " + (i+1) + " " + jours.get(i));
        }

        try
        {
            File f = new File("src/data3/input5.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";

            int nb_creneau = Integer.parseInt(b.readLine());

            //Ajout dans la liste de minutes de la journée de nouveau creneau "non disponible" (false)

            for (int i=0; i<nb_creneau; i++)
            {
                readLine = b.readLine();

                System.out.println("////////////////////////////////////////////////////////////////////////:");
                System.out.println("Nouveu creneau a ajouter: " + readLine);

                int j_start = calc_i_debut(readLine);
                int j_end = calc_i_fin(readLine);


                System.out.println("Jour AVANT ajout de nouveau creneau " + jours.get(getJour(readLine)-1));

                for (int j = j_start; j<j_end+1; j++)
                {
                    // pour bien faire ne pas oublier d ajouter verification si deja false ou pas
                    jours.get(getJour(readLine)-1).set(j, false);
                }

                System.out.println("Jour APRES ajout de nouveau creneau " + jours.get(getJour(readLine)-1));

            }

            for (int i = 0; i<jours.size(); i++)
            {
               if  ( seach_libre_creneau(jours.get(i))==true)
               {
                  isFound = true;
                  System.out.println("Le jour de la reunion est: " + (i+1));
                  break;
               }

            }
        }


        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

// Recherche dans une journée donnée  d'un creneau de 60 min disponible

    public static boolean seach_libre_creneau(ArrayList<Boolean> jour_list)
    {
         boolean isFound = false;
         boolean precedent= false;
         int i_debut=0;
         int countMinDispo=0;

             for (int i=0; i<jour_list.size(); i++)
             {
                if (countMinDispo==59)
                 {
                     System.out.println("Trouvé");
                     isFound=true;
                     break;
                 }
                else
                 {
                     if (jour_list.get(i) == true)
                      {

                        if (precedent==false) // donc ouverture de nouveau creneau
                         {
                           i_debut=i;
                           countMinDispo++;
                           precedent =true;
                         }
                       else
                         {
                           countMinDispo++;
                         }
                      }
                      else
                        {
                          precedent =false;
                          countMinDispo=0;
                        }
                 }
             }

         System.out.println("Creneau commence: " + i_debut + " " + countMinDispo);
         calc_time_start_meeting(i_debut);
         calc_time_finish_meeting(i_debut + countMinDispo);
         return isFound;
    }


////////////////////////////////////////////////////////////////////////////////////////////////
// Parsing of input String

    public static int getJour(String str)
    {
        int jour= Integer.parseInt(String.valueOf(str.subSequence(0,1)));
        return jour;
    }

    public static int get_h_debut(String str)
    {
        int h_debut = Integer.parseInt(String.valueOf(str.subSequence(2,4)));
        return h_debut;
    }

    public static int get_min_debut(String str)
    {
        int min_debut = Integer.parseInt(String.valueOf(str.subSequence(2,4)));
        return min_debut;
    }

    public static int get_h_fin(String str)
    {
        int h_fin= Integer.parseInt(String.valueOf(str.subSequence(2,4)));
        return h_fin;
    }

    public static int get_min_fin(String str)
    {
        int min_fin= Integer.parseInt(String.valueOf(str.subSequence(2,4)));
        return min_fin;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////

// Calc minute de debut du creneau donné (entre 0 et 599 cad entre 8:00 et 17:59)

    public static int calc_i_debut(String str)
    {
        int h_debut = Integer.parseInt(String.valueOf(str.subSequence(2,4)));
        int min_debut = Integer.parseInt(String.valueOf(str.subSequence(5,7)));

        int i_h_debut;

        if (h_debut ==8)
        {
            i_h_debut = min_debut;
        }
        else
        {
            i_h_debut = (h_debut-8)*60+min_debut;
        }
        System.out.println(i_h_debut);
        return  i_h_debut;

    }

// Calc minute de fin du creneau donné (entre 0 et 599 cad entre 8:00 et 17:59)

    public static int calc_i_fin(String str)
    {
        int h_fin;
        int min_fin;

        h_fin = Integer.parseInt(String.valueOf(str.subSequence(8,10)));
        min_fin= Integer.parseInt(String.valueOf(str.subSequence(11,13)));

        int i_h_fin;

        if (h_fin ==8)
        {
            i_h_fin= min_fin;
        }
        else
        {
            i_h_fin = (h_fin-8)*60+min_fin;
        }
        System.out.println(i_h_fin);
        return  i_h_fin;
    }

 //Calc and print l'heure du debut du meeting a partir de la minute donnée

    public static void calc_time_start_meeting(int m)
    {
        int heure = 8 + m/60;
        int min = m % 60; // si > 60 --> heure +1

        System.out.println("Debut de la reunion à " + heure +":"+min);

    }

//Calc and print l'heure de fin du meeting a partir de la minute donnée

    public static void calc_time_finish_meeting (int m)
    {
        int heure = 8 + m/60;
        int min= m%60; //  si > 60 --> heure +1

        System.out.println("La reunion se termine à " + heure +":"+min);

    }


    public static void decomposition ()
    {
        String date ="1 12:23-16:27";

        int jour;
        int  h_debut;
        int min_debut;
        int h_fin;
        int min_fin;

        jour = Integer.parseInt(String.valueOf(date.subSequence(0,1)));
        System.out.println(jour);
        h_debut = Integer.parseInt(String.valueOf(date.subSequence(2,4)));
        System.out.println(h_debut);
        min_debut = Integer.parseInt(String.valueOf(date.subSequence(5,7)));
        System.out.println(min_debut);
        h_fin = Integer.parseInt(String.valueOf(date.subSequence(8,10)));
        System.out.println(h_fin);
        min_fin= Integer.parseInt(String.valueOf(date.subSequence(11,13)));
        System.out.println(min_fin);

    }

}


