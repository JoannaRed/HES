package ExercisesDaniel.Debut;

import java.util.Random;


public class warunkowe {
    public static void main(String[] arg) {


        Random liczba = new Random();

        int a = liczba.nextInt(300)-75;  //jak poprawic zakres ? Liczby ujemne
        int b = liczba.nextInt(150);  // dodatkowe petle czy dorzucic do istniejacych?


        System.out.println(a);

        if (a < 0) {
            System.out.println("Liczba mniejsza od zera " + a);
        } else if (a > 0) {
            System.out.println("Liczba wieksza od zera " + a);
        } else {
            System.out.println("Liczba rowna zero " + a);
        }

        if (a % 2 == 0) {
            System.out.println("Liczba parzysta " + a);
        } else {
            System.out.println("Liczba nieparzysta " + a);
        }
    }
}
