package Defis.Heritage;

public class CleanseDemo {
    public static void main(String[] args) {
            Cleanse c = new Cleanse();
        System.out.println(c.toString());
        c.dilute();
        c.apply();
        c.scrub();


        Detergent d = new Detergent();
        System.out.println(d.toString());
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        }

}
