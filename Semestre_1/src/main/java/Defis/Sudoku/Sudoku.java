package Defis.Sudoku;

public class Sudoku {

    private static int [][] sudoku;

    public static void main(String[] args) {
        //int[][] sudoku = new int[9][9];

        sudoku = consuireTableau();

        imprimerTableau();

        for(int i= 0; i < 9; i++) {
            ramplissageCase(i) ;
        }

        for (int colonne = 0; colonne < 9; colonne+=3) {
            for (int ligne = 0; ligne < 9; ligne+=3) {
                controleCarre(ligne, colonne);

            }
        }

        imprimerTableau();
    }
    private static int [][] consuireTableau (){
        int [][] sudoku = {
                {8,5,3,2,0,4,1,6,7},
                {6,7,0,1,3,5,4,0,8},
                {4,1,2,7,8,0,3,9,5},
                {7,2,0,9,4,8,5,3,1},
                {5,8,1,6,7,3,0,4,2},
                {3,9,4,5,1,2,0,8,6},
                {2,4,0,3,6,1,8,5,9},
                {1,3,5,8,0,9,6,7,4},
                {9,6,0,4,5,7,2,1,3},
        };
        return sudoku;
    }

    private static void imprimerTableau(){
        for (int colonne = 0; colonne < 9; colonne++) {
            for (int ligne = 0; ligne < 9; ligne++) {
                System.out.print(sudoku[colonne][ligne] + " ");
            }
            System.out.println();
        }
    }

    private static void ramplissageCase(int numeroLigne){
        int nombreZero =0;
        int positionZero = 0;
        int sommeLinge = 45;
        for(int ligne =0; ligne < 9; ligne++){
            sommeLinge = sommeLinge - sudoku [numeroLigne][ligne];
            if (sudoku [numeroLigne][ligne] == 0) {
                nombreZero++;
                positionZero = ligne;
                //System.out.println("Znalezlismy 0 na pozycji" + numeroLigne + "w kolumnie" + ligne);
            }
        }

        if(nombreZero == 1){

            sudoku[numeroLigne][positionZero] = sommeLinge;
        }

        //System.out.println("W tym rzedzie " + numeroLigne + " znalezlismy " + nombreZero + " zer");
    }
    private static void controleCarre (int numeroLigne, int numeroColonne){
        int nombreZero =0;
        int positionZeroColonne = 0;
        int positionZeroLigne = 0;
        int sommeLinge = 45;
        for(int colonne = numeroColonne; colonne < numeroColonne+3; colonne++) {
            for (int ligne = numeroLigne; ligne < numeroLigne+3; ligne++) {
                sommeLinge = sommeLinge - sudoku[colonne][ligne];
                //System.out.println( ligne + "w kolumnie" + colonne);
                if (sudoku[colonne][ligne] == 0) {
                    nombreZero++;
                    positionZeroLigne = ligne;
                    positionZeroColonne = colonne;

                }
            }
        }
        if(nombreZero == 1){

            sudoku[positionZeroColonne][positionZeroLigne] = sommeLinge;
        }

        System.out.println("W tym rzedzie " + numeroLigne + " znalezlismy " + nombreZero + " zer");

    }
}

/*
        sudoku[0][0] = 8;
        sudoku[0][1] = 5;
        sudoku[0][2] = 0;
        sudoku[0][3] = 0;
        sudoku[0][4] = 0;
        sudoku[0][5] = 0;
        sudoku[0][6] = 0;
        sudoku[0][7] = 0;
        sudoku[0][8] = 0;
        sudoku[1][0] = 0;
        sudoku[1][1] = 0;
        sudoku[1][2] = 0;
        sudoku[1][3] = 1;
        sudoku[1][4] = 3;
        sudoku[1][5] = 0;
        sudoku[1][6] = 0;
        sudoku[1][7] = 0;
        sudoku[1][8] = 0;
        sudoku[2][0] = 4;
        sudoku[2][1] = 0;
        sudoku[2][2] = 0;
        sudoku[2][3] = 0;
        sudoku[2][4] = 0;
        sudoku[2][5] = 0;
        sudoku[2][6] = 0;
        sudoku[2][7] = 9;
        sudoku[2][8] = 5;
        sudoku[3][0] = 0;
        sudoku[3][1] = 2;
        sudoku[3][2] = 0;
        sudoku[3][3] = 9;
        sudoku[3][4] = 0;
        sudoku[3][5] = 8;
        sudoku[3][6] = 0;
        sudoku[3][7] = 0;
        sudoku[3][8] = 0;
        sudoku[4][0] = 5;
        sudoku[4][1] = 8;
        sudoku[4][2] = 1;
        sudoku[4][3] = 0;
        sudoku[4][4] = 0;
        sudoku[4][5] = 0;
        sudoku[4][6] = 0;
        sudoku[4][7] = 0;
        sudoku[4][8] = 0;
        sudoku[5][0] = 0;
        sudoku[5][1] = 0;
        sudoku[5][2] = 0;
        sudoku[5][3] = 0;
        sudoku[5][4] = 0;
        sudoku[5][5] = 0;
        sudoku[5][6] = 7;
        sudoku[5][7] = 0;
        sudoku[5][8] = 6;
        sudoku[6][0] = 0;
        sudoku[6][1] = 0;
        sudoku[6][2] = 7;
        sudoku[6][3] = 0;
        sudoku[6][4] = 0;
        sudoku[6][5] = 1;
        sudoku[6][6] = 8;
        sudoku[6][7] = 0;
        sudoku[6][8] = 0;
        sudoku[7][0] = 0;
        sudoku[7][1] = 0;
        sudoku[7][2] = 0;
        sudoku[7][3] = 8;
        sudoku[7][4] = 0;
        sudoku[7][5] = 9;
        sudoku[7][6] = 0;
        sudoku[7][7] = 0;
        sudoku[7][8] = 0;
        sudoku[8][0] = 0;
        sudoku[8][1] = 0;
        sudoku[8][2] = 0;
        sudoku[8][3] = 0;
        sudoku[8][4] = 0;
        sudoku[8][5] = 0;
        sudoku[8][6] = 2;
        sudoku[8][7] = 1;
        sudoku[8][8] = 3;*/

// Chercher dans les colonnes et lignes
        /*for (int colonne = 0; colonne < 9; colonne++) {

            for (int ligne = 0; ligne < 9; ligne++) {
                //Détecter une case vide
                if(sudoku[colonne][ligne]==0) {
                    byte [] possibilite;
                    possibilite = new byte[9];
                    possibilite = {1,2,3,4,5,6,7,8,9};
                }
            }


        //}

        //boolean checkLinePossible(int ligne, int valeur) {

            //}

        //}

        */