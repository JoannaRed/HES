package ExercisesDaniel.Debut;
import java.util.Scanner;

public class PetleFor {
    public static void main (String[] arg){

        System.out.println("Ilosc gwiazdek:");
        int iloscGwiazdek = getInt();
        int gwiazdka = 1;

        for(int j =0; j <= iloscGwiazdek; j++) {

            for (int i = 0; i < j; i++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }
    public static int getInt () {
        return new Scanner(System.in).nextInt();
    }

}
