package Defis.Heritage;

public class Cleanse {

    public void scrub(){
        System.out.println("Scrub()");
    }
    public void dilute(){
        System.out.println("Dilute()");
    }
    public void apply(){System.out.println("Apply()");}

    @Override
    public String toString(){
        return "je suis un cleanser";
    }
}
