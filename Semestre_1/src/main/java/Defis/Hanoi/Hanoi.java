package Defis.Hanoi;

public class Hanoi {
    public static void main(String []arg){
        int nombreDisques = 3;
        creeHanoi(nombreDisques, 'A', 'B', 'C');
    }

    public static void creeHanoi(int topN, char from,
                                char inter, char to) {
        if (topN == 1){
            System.out.println("Disk 1 from "
                    + from + " to " + to);
        }else {
            creeHanoi(topN - 1, from, to, inter);
            for(int i=0; i<topN; i++) System.out.print("  ");
            System.out.println("Disk "
                    + topN + " from " + from + " to " + to);

            creeHanoi(topN - 1, inter, from, to);
        }
    }

}
