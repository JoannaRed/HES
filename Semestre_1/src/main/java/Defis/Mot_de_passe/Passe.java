package Defis.Mot_de_passe;
import java.util.Scanner;

public class Passe {
    public static void main(String[] arg) {

        System.out.println("Prenom: ");
        String name = getString();

        System.out.println("Nom de famille: ");
        String lastName = getString();

        System.out.println("Annee de nassance: ");
        int date = getInt();

        System.out.println("Mot de passe: ");
        String passe = getString();

        //Verification mot de passe. Quelle motode? While/if?

        boolean isPasswordOK = chekPassword(name, lastName, date, passe);

        if(isPasswordOK)
        {
            System.out.println("Password is all good ! ");
        }
        else {
            System.out.println("Password has not the good format");
        }

    }

    /**
     *
     * @param name
     * @param lastName
     * @param date
     * @param passe
     * @return
     */
    private static boolean chekPassword(String name, String lastName, int date, String passe) {

        //la dernire lettre du nom du client, en respectant la casse.
        String dernierLettre = String.valueOf(lastName.charAt(lastName.length() - 1));

        boolean lastLetter;
        if (passe.contains(dernierLettre)) {
            lastLetter = true;
        } else {
            return lastLetter = false;
        }

        //   les chiffres de l'anne de naissance.  TRUE/FALSE
        boolean anneNaissance;
        String naissance = String.valueOf(date);

        if (passe.contains(naissance)) {
            anneNaissance = true;
        } else {
            return anneNaissance = false;
        }

        // les 3 dernires lettres du nom en majuscules (ex: Roger : GER).

        String dernier3Lettres;
        dernier3Lettres = name.substring(name.length()-3);
        dernier3Lettres.toUpperCase();
        boolean maj;
        if (passe.contains(dernier3Lettres)) {
            maj = true;
        } else {
           return  maj = false;
        }

        // un nombre alatoire entre 100 et 999.
        boolean nombre;
        //String passNoDate = passe.substring(passe.contains(naissance));
        int value;  // tets entre 100 et 999 apres

        String valueOfPasse= "";

        for (int i = 0; i < passe.length(); i++) {
            char letter = passe.charAt(i);
            if (letter >= 48 && letter <=57){   // si ASCI value est entre 0 et 9 on la garde dans le String
                valueOfPasse = valueOfPasse + letter;
            }
        }
        if(valueOfPasse.equals("")){
            System.out.println("Il n'y a pas de chiffre ");
        }
        else {
            value = Integer.parseInt(valueOfPasse);
            if(value >100 && value < 999){
                nombre = true;
                }
            else {
                return nombre = false;
            }
        }

        if(nombre && anneNaissance && ...)
        {
            return true;
        }
        return false;





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
