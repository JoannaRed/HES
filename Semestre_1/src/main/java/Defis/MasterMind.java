package Defis;

import java.util.Scanner;

public class MasterMind {
    public static void main(String[] args) {

        // générer aléatoirement un tableau de 4 entiers tous différents, choisis parmi les chiffres de 1 à 8 y.c.
        int[] secret = genererLesChiffres();

        // demander à l’utilisateur de saisir au clavier un tableau de 4 entiers.


        int[] userInput;

        // Game loop, User doit faire des Guess, tant que il trouve aps la bonne solution
        // On testera si ces 4 entiers tous différents, choisis parmi les chiffres de 1 à 8 y.c.
        do {
            // a chaque tour de jeu, on redemande les userInput, et on re-compare !
            userInput = userGuess();

        } while (compare(secret, userInput) == false);

        System.out.println("game Over ! You won !");

    }

    private static boolean compare(int[] secret, int[] userInput) {
        boolean secretFound = false; //Le user a trouve la SOLUTION
        int rouge = 0;
        int blanc = 0;

        // 1) compter tous les rouges
        // on avance simultanement des deux tableaux
        for (int i = 0; i < secret.length; i++) {
            if (secret[i] == userInput[i]) {
                rouge++;
            }
        }

        // 2) compter tous les blancs
        // chaque position i compare avec tous les j
        for (int i = 0; i < secret.length; i++) {
            for (int j = 0; j < userInput.length; j++) {
                if (secret[i] == userInput[j]) {
                    blanc++;
                }
            }
        }
        //Eviter de recompter les valeurs blanches
        blanc = blanc - rouge;
        System.out.println();
        System.out.println("Nb des rouges: " + rouge);
        System.out.println("Nb des blanc: " + blanc);

        if (rouge == 4) {
            secretFound = true;   // Si user a trouvé les quatres valeurs c'est fini alors true
        }
        return secretFound;
    }

    private static int[] userGuess() {
        Scanner inputScanner = new Scanner(System.in);

        int[] votreChoix = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Proposez un chiffre:");

            votreChoix[i] = inputScanner.nextInt();

        }
        afficheTableau(votreChoix);
        return votreChoix;

    }

    public static int[] genererLesChiffres() {
        int[] array = new int[4];
        int maxValue = 8;  // valeur max pour l'example

        //Methode 1 FOR
        for (int i = 0; i <= 3; ) //Incerement sur demande!
        {
            int random = (int) (Math.random() * maxValue) + 1;
            boolean alreadyExist = true;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == random) {
                    //ça ne va pas, refaire le random
                    alreadyExist = true;
                    break; //sauvegrade l'état du flag
                } else {
                    // la valeur random est unique
                    alreadyExist = false;

                }

            }

            if (alreadyExist == false) {
                array[i] = random;
                i++;
            }
        }

        // Methode 2 : Do While
   /*     int index = 0;
        do
        {
            int random = (int)(Math.random() * maxValue) +1;

            // Verifie si valeur random déja existante
            for (int j = 0; j < array.length; j++)
            {
                if(array[j] == random)
                {
                    //ça ne va pas, refaire le random
                    break;
                }

                // la valeur random est unique
                array[index] = random;
                index++;
                break;

            }


        }while (index < 4);
*/


        //System.out.print("Notre proposition: " + array.toString());// comment definir que le chiffre ne peux pas se repeter?
        System.out.println("Generated is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        return array;
    }

    public static void afficheTableau(int[] arrayToShow) {
        for (int i = 0; i < arrayToShow.length; i++) {
            System.out.print(arrayToShow[i] + " ");
        }
    }


}