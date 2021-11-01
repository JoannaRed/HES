package Defis.Mots;
import java.util.Scanner;

public class Mots {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);    // Class qui appelle le system

        //Prendre un mot
        System.out.println("Tapez un mot: ");
        String motInput = scan.nextLine();

        String [] notreProposition = proposition(motInput);

    }

    public static String[] proposition (String mot) {
        String[] dictionnaire = {"eduqué", "effronté", "enivré", "enfoiré", "enneigé", "entêté",
                "embêté", "emmené", "empêtré", "foireux", "joie", "joli", "joue", "jour",
                "journal", "journalier", "journée"};

        String [] resultats = new String[5];

        int nbrPropr =0;
        System.out.println("Voici les propositions: ");
        for(int i = 0; i < dictionnaire.length; i++){

            boolean containsWord = dictionnaire[i].contains(mot);
                if(containsWord == true){   // Si contient mettre dans le tableau des propositions
                    resultats [nbrPropr] = dictionnaire[i];
                    System.out.println(dictionnaire[i]);
                    nbrPropr++;
                    if(nbrPropr == resultats.length ){
                        break;
                    }
                }

        }
        if(nbrPropr == 0) {
            System.out.println(" Il n'y a pas des propositions. ");
        }
        return resultats ;
    }
}
