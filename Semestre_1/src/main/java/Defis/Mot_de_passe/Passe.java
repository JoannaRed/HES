package Defis.Mot_de_passe;
import java.util.Scanner;

public class Passe {
    public static void main(String[] arg) {

        System.out.println("Prenom: ");
        String name = getString();

        System.out.println("Nom de famille: ");
        String lastName = getString();

        System.out.println("Date de nassance: ");
        String date = getString();

        System.out.println("Mot de passe: ");
        String passe = getString();

        //Verification mot de passe. Quelle motode? While/if?


        //la dernire lettre du nom du client, en respectant la casse.
        char dernierLettre = lastName.charAt(lastName.length() - 1);

        boolean test = false;
        if (paase.contains(dernierLettre)) {
            test = true;
        } else {
            test = false;
        }

        //   les chiffres de l'anne de naissance.  TRUE/FALSE
        boolean test2 = false;
        if (passe.contains(date)) {
            test2 = true;
        } else {
            test2 = false;
        }

        // les 3 dernires lettres du nom en majuscules (ex: Roger : GER).

        String dernier3Lettres;
        dernier3Lettres = name.substring(name.length()-3);
        dernier3Lettres.toUpperCase();
        boolean test3 = false;
        if (passe.contains(dernier3Lettres)) {
            test3 = true;
        } else {
            test3 = false;
        }

        // un nombre alatoire entre 100 et 999.




        // Faire un tableau avec les mots de passe
        //String [] motsPasse = new String[];

        // Metre les mots de passe dans les tableau

        String[] motsPasse = {"Joanna834ANN", "nicOLA<70199", "RED200255"};

        // Prendre un mot de passe et la comparer avec les autres
        for (int i = 0; i <= motsPasse.length;i++){
            passe.equals(motsPasse);
        }
        // If true break, if false OK ?

    }
    public static int getInt () {
        return new Scanner(System.in).nextInt();
    }
    public static String getString () {
        return new Scanner(System.in).next();
    }
}
