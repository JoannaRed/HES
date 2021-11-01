package ExercisesDaniel.Debut;

import java.util.Scanner;

public class ExerciseZmienne {
    public static void main(String[] arg) {
        int kwotaZlotowki = 200;
        int kursDolara = kwotaZlotowki * 4;
        double kursEuro = kwotaZlotowki * 4.5;


        System.out.println(kwotaZlotowki + " zlotych to: " + kursDolara +
                " dolarow i " + kursEuro + " euro.");


        System.out.println("Jak masz na imie?");
        String imie = getString();

        System.out.println("Jak masz na nazwisko?");
        String nazwisko = getString();

        System.out.println("Ile masz lat?");
        int wiek = getInt();

        if (wiek > 100 || wiek < 0) {
            System.out.println("To niemozliwe!!");
            return;
        }

        String kategoriaWiekowa;
        if (wiek <= 15) {
            kategoriaWiekowa = " dziecko";
        } else if (wiek < 20) {
            kategoriaWiekowa = " nastolatkiem";
        } else {
            kategoriaWiekowa = " doroslym";
        }
        System.out.println("Dziendobry " + imie + " " + nazwisko +
                kategoriaWiekowa + ".");
    }


    private static String getString() {
        return new Scanner(System.in).next();
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
