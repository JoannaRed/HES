package Defis.Potegowanie;

import java.math.BigDecimal;

public class Potegi {
    public static void main (String[]arg) {

        int a = 67;
        int b = 5;
        int resultat = 1;

        while (b > 0) {
            resultat = resultat * a;
            b = b - 1;
        }

        System.out.println(resultat);
    }

}
/*static int showNumers(int... numbers)
    {

        int result = 1;


        for (int i = 1; i < numbers.length ; i++)
        {
            //result *= numbers[i];
            result = numbers[i] * numbers[i];
            System.out.println("Current result: " + result);
        }
        return result;
    }*/