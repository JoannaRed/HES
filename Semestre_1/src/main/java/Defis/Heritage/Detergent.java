package Defis.Heritage;

public class Detergent extends Cleanse{
    public void foam(){
        System.out.println("Foam()");
    }

    @Override
    public void scrub(){
        System.out.println("Detergent.scrub()");

        super.scrub();
        super.scrub();
    }
    @Override
    public String toString(){
        return "je suis un detergent";
    }

}
