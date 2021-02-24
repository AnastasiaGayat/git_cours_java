import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Yaourt {

    public static void yaourt(int n) {

        ArrayList<String> couleurs = new ArrayList<>();
        HashMap<String, Integer> coul_list = new HashMap<String, Integer>();

        try {
            File f = new File("src/data/input2.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                /* readLine est la ligne actuel */
                couleurs.add(readLine);
            }
            System.out.println(couleurs);

            int nbVotes = Integer.parseInt(couleurs.get(0));
            couleurs.remove(0);
            System.out.println(couleurs);

            for (int i=0; i<couleurs.size(); i++)
            {
                if (coul_list.containsKey(couleurs.get(i)))
                {
                    coul_list.replace(couleurs.get(i),coul_list.get(couleurs.get(i))+1);

                }
                else
                {
                    coul_list.put(couleurs.get(i),1);
                }
            }
            System.out.println(coul_list);

            String coul_top_1=null;
            int votes_coul_top_1=0;
            String coul_top_2=null;
            int votes_coul_top_2=0;

            for (String i : coul_list.keySet())
            {
                if (coul_list.get(i) > votes_coul_top_1 )
                {
                    votes_coul_top_1 = coul_list.get(i);
                    coul_top_1 = i;
                }

                else

                if (coul_list.get(i) > votes_coul_top_2 )
                {
                    votes_coul_top_2 = coul_list.get(i);
                    coul_top_2 = i;
                }
            }

            System.out.println(coul_top_1);
            System.out.println(votes_coul_top_1);
            System.out.println(coul_top_2);
            System.out.println(votes_coul_top_2);


            f = new File("src/data/output2.txt");
            b = new BufferedReader(new FileReader(f));
            readLine = "";
            readLine = b.readLine();

            // comparez readLine avec ton result

            if (readLine.equals(coul_top_1 + " " + coul_top_2))
            {
                System.out.println("Comparaison OK");
            }

            else {
                System.out.println("Comparaison failled");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    ////////////////////////////////////////////////////////////////////////////////////////

    public static void yaourt2() {


        ArrayList<String> couleurs = new ArrayList<>();
        ArrayList<Couleur> couleurs_excl = new ArrayList<>();

        try {
            File f = new File("src/data/input2.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";

            int nbVotes = Integer.parseInt(b.readLine());

            for (int i=0; i<nbVotes; i++)
            {
                readLine = b.readLine();
                couleurs.add(readLine);
            }

            for (int i=0; i< couleurs.size(); i++)
            {

                System.out.println(couleurs.get(i));
            }

            System.out.println("//////////////////////////////////////::");

            for (int i=0; i< couleurs.size(); i++)
            {

                if (couleurs_excl.isEmpty())
                {
                    Couleur new_coul = new Couleur();
                    new_coul.setNom(couleurs.get(i));
                    couleurs_excl.add(new_coul);
                }
                else
                {

                    boolean state = false;

                    for (int j=0; j < couleurs_excl.size(); j++)
                    {
                        if (couleurs_excl.get(j).getNom().equals(couleurs.get(i)))
                        {
                            state=true;
                            couleurs_excl.get(j).setVotes(couleurs_excl.get(j).getVotes()+1);

                        }

                    }
                    if (!state)
                    {

                        Couleur new_coul = new Couleur();
                        new_coul.setNom(couleurs.get(i));
                        couleurs_excl.add(new_coul);

                    }
                }

            }

            System.out.println("SECOND LIST");

            Couleur coul_top_1= new Couleur();
            Couleur coul_top_2 =new Couleur();

            for (int i=0; i< couleurs_excl.size(); i++)
            {
                System.out.println(couleurs_excl.get(i).getNom() + " " + couleurs_excl.get(i).getVotes());

                if (couleurs_excl.get(i).getVotes() > coul_top_1.getVotes())
                {
                    coul_top_1 = couleurs_excl.get(i);
                }
                else
                {
                    if (couleurs_excl.get(i).getVotes() > coul_top_2.getVotes())
                    {
                        coul_top_2 = couleurs_excl.get(i);
                    }
                }
            }
            System.out.println("//////////////////////////////////////");

            System.out.println (coul_top_1.getNom() + " " + coul_top_1.getVotes());
            System.out.println (coul_top_2.getNom() + " " + coul_top_2.getVotes());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void yaourt3()
    {
        ArrayList<Couleur> couleurs_excl = new ArrayList<>();
        try {
            File f = new File("src/data/input2.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";

            int nbValue = Integer.parseInt(b.readLine());

            for (int i=0; i< nbValue; i++)
            {
                readLine=b.readLine();

                if (couleurs_excl.isEmpty()) {
                    Couleur new_coul = new Couleur();
                    new_coul.setNom(readLine);
                    couleurs_excl.add(new_coul);
                }
                else
                {
                    boolean color_found = false;

                    for (int j = 0; j < couleurs_excl.size(); j++)
                    {
                        if (couleurs_excl.get(j).getNom().equals(readLine))
                        {
                            color_found = true;
                            couleurs_excl.get(j).setVotes(couleurs_excl.get(j).getVotes() + 1);
                            break;
                        }
                    }

                    if (!color_found)

                    {
                        Couleur new_coul = new Couleur();
                        new_coul.setNom(readLine);
                        couleurs_excl.add(new_coul);
                    }
                }


            }

            System.out.println("LIST COULEURS");
            for (int i=0; i< couleurs_excl.size(); i++)
            {
                System.out.println(couleurs_excl.get(i).getNom() + " " + couleurs_excl.get(i).getVotes());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
