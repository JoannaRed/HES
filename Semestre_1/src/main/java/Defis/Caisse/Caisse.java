package Defis.Caisse;
import java.util.Scanner;

public class Caisse {
    public static void main(String[] arg) {
        double facture;
        double montant;
        double reste;

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Inserer le montant de la facture: ");
        facture = input1.nextDouble();
        System.out.println("Inserer la montant: ");
        montant = input2.nextDouble();

        reste = facture - montant;

        System.out.println("Reste pour vous c'est: " + reste);

        int nb_cent = 0, nb_cinquante = 0, nb_vingt = 0, nb_dix = 0, nb_cinq = 0, nb_deux = 0, nb_un = 0;
        int aDonner = (int) reste;

        while (aDonner >= 100) {
            nb_cent += 1;
            aDonner = aDonner - 100;
        }
        while (aDonner >= 50) {
            nb_cinquante += 1;
            aDonner = aDonner - 50;
        }
        while (aDonner >= 20) {
            nb_vingt += 1;
            aDonner = aDonner - 20;
        }
        while (aDonner >= 10) {
            nb_dix += 1;
            aDonner = aDonner - 10;
        }
        while (aDonner >= 5) {
            nb_cinq += 1;
            aDonner = aDonner - 5;
        }
        while (aDonner >= 2) {
            nb_deux += 1;
            aDonner = aDonner - 2;
        }
        while (aDonner >= 1) {
            nb_un += 1;
            aDonner = aDonner - 1;
        }

        System.out.println("Je vous doit: " + nb_cent + " de cent. " + nb_cinquante + " de cinquante, " + nb_vingt + " de vingt " + nb_dix + " de dix, " + nb_cinq + " de cinq, " + nb_deux + " de deux, " + nb_un + " de un.");


    }

}
