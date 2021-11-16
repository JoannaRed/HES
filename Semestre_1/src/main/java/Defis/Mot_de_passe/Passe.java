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

        //Verification mot de passe. Avec une methode qui a comme parametres dennées de client
        // Il utilise function chekPassword
        boolean isPasswordOK = chekPassword(name, lastName, date, passe);

        if(isPasswordOK)
        {
            System.out.println("Password is all good ! ");
        }
        else {
            System.out.println("Password has not the good format");
        }

    }

    //Methode pour tester le mot de passe
    // Comme parametres il a des strings et int indiques pas le client
    private static boolean chekPassword(String name, String lastName, int date, String passe) {

        //la dernire lettre du nom du client, en respectant la casse.

        //On regarde la dernier lettre du nom
        String dernierLettre = String.valueOf(lastName.charAt(lastName.length() - 1));

        //On regarde si le mot de passe contient la lettre selectione
        boolean lastLetter;
        if (passe.contains(dernierLettre)) {
            lastLetter = true;
        } else {
            return false;
        }

        //   les chiffres de l'anne de naissance.  TRUE/FALSE
        boolean anneNaissance;

        //On cree un string sur la base de un int
        String naissance = String.valueOf(date);

        if (passe.contains(naissance)) {
            anneNaissance = true;
        } else {
            return false;
        }

        // les 3 dernires lettres du nom en majuscules (ex: Roger : GER).

        String dernier3Lettres;

        // On coupe les derniers trois lettres du nom et on les change en majuscules
        dernier3Lettres = name.substring(name.length()-3);
        dernier3Lettres.toUpperCase();
        boolean maj;
        if (passe.contains(dernier3Lettres)) {
            maj = true;
        } else {
           return false;
        }

        // un nombre alatoire entre 100 et 999.
        boolean nombre = false;
        //String passNoDate = passe.substring(passe.contains(naissance));
        int value;  // test entre 100 et 999 apres

        // On cree un string vide pour garder les chiffres trouve
        String valueOfPasse= "";

        for (int i = 0; i < passe.length(); i++) {
            // On controle chaque lettre du mot de passe pour voir si elle est un chiffre
            char letter = passe.charAt(i);
            if (letter >= 48 && letter <=57){   // si ASCI value est entre 0 et 9 on la garde dans le String
                valueOfPasse = valueOfPasse + letter;
            }
        }
        if(valueOfPasse.equals("")){
            System.out.println("Il n'y a pas de chiffre ");
        }
        // On controle si le chiffre est plus grande que 100 et plus petit que 999
        else {
            value = Integer.parseInt(valueOfPasse);  //
            if(value >100 && value < 999){
                nombre = true;
                }
            else {
                return false;
            }
        }

        if(anneNaissance && lastLetter && maj && nombre)
        {
            return true;
        }
        return false;

    }

    public static int getInt () {
        return new Scanner(System.in).nextInt();
    }
    public static String getString () {
        return new Scanner(System.in).next();
    }
}
