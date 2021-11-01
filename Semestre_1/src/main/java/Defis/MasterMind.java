package Defis;
import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class MasterMind {
    public static void main(String[] args) {


        LinkedList m = new LinkedList();
        Random generator = new Random();

        for (int i = 0; i <=3; i++) {
            m.add(generator.nextInt(8)+1);
        }
        System.out.println(m);
    }   // comment definir que le chiffre ne peux pas se repeter?
}
/*4
        int choixChiffres []  = {};
        Random generator = new Random();

        for(int i=0; i<8; i++) {

            choixChiffres.add(generator.nextInt());

        }

        System.out.println(choixChiffres);*/
        /*// Cree un tableau
        int [] choixChiffres = {1,2,3,4,5,6,7,8};

        // Definir les choix des chiffres

        // definir 4 chiffres differentes

        for(int i = 0; i <= choixChiffres.length; i++ ){
            if()
        }
    }
} */

