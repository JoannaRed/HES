package ExercisesDaniel.Debut;
import java.util.Scanner;

public class Deszcz {
    public static void main (String[] arg){

        System.out.println("Czy swieci slonce? (t/n)");
        String swieci = getString();


        System.out.println("Czy pada deszcz? (t/n)");
        String pada = getString();

        boolean czyPadaDeszcz = pada.equals("t");
        boolean swieciSlonce = swieci.equals("t");

        if (czyPadaDeszcz && swieciSlonce){
            System.out.println("Tecza!");
        }
        else if (!czyPadaDeszcz && swieciSlonce){
            System.out.println("Jest pogodnie!");
        }
        else if (czyPadaDeszcz ){
            System.out.println("Pada deszcz!!!!");
        }
        else{
            System.out.println("Jest pochmurnie!");
        }
        /*
        if(swieci.equals("t") && pada.equals("n")){
            czyPadaDeszcz = false;
            swieciSlonce = true;
            if (czyPadaDeszcz ==  true && swieciSlonce == true){
                System.out.println("Tecza!");
            }
            else if (czyPadaDeszcz ==  false && swieciSlonce == true){
                System.out.println("Jest pogodnie!");
            }
            else if (czyPadaDeszcz ==  true && swieciSlonce == false){
                System.out.println("Pada deszcz!!!!");
            }
            else{
                System.out.println("Jest pochmurnie!");
            }

        }
        else if (swieci.equals("t") && pada.equals("t")) {
            czyPadaDeszcz = true;
            swieciSlonce = true;
            if (czyPadaDeszcz ==  true && swieciSlonce == true){
                System.out.println("Tecza!");
            }
            else if (czyPadaDeszcz ==  false && swieciSlonce == true){
                System.out.println("Jest pogodnie!");
            }
            else if (czyPadaDeszcz ==  true && swieciSlonce == false){
                System.out.println("Pada deszcz!");
            }
            else{
                System.out.println("Jest pochmurnie!");
            }

        }
        else if (swieci.equals("n") && pada.equals("t")) {
            czyPadaDeszcz = true;
            swieciSlonce = false;
            if (czyPadaDeszcz ==  true && swieciSlonce == true){
                System.out.println("Tecza!");
            }
            else if (czyPadaDeszcz ==  false && swieciSlonce == true){
                System.out.println("Jest pogodnie!");
            }
            else if (czyPadaDeszcz ==  true && swieciSlonce == false){
                System.out.println("Pada deszcz!");
            }
            else{
                System.out.println("Jest pochmurnie!");
            }

        }
        else{
            czyPadaDeszcz = false;
            swieciSlonce = false;
            if (czyPadaDeszcz ==  true && swieciSlonce == true){
                System.out.println("Tecza!");
            }
            else if (czyPadaDeszcz ==  false && swieciSlonce == true){
                System.out.println("Jest pogodnie!");
            }
            else if (czyPadaDeszcz ==  true && swieciSlonce == false){
                System.out.println("Pada deszcz!");
            }
            else{
                System.out.println("Jest pochmurnie!");
            }

        }
        */

    }



    public static String getString() {
        return new Scanner(System.in).next();
}
}