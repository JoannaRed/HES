package Defis.Sudoku;

public class SudokuV2
{
    private static final int GRID_SIZE = 9;

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        // 1) créer le tableau d'exercice

        int [][] myBoard =  {
                {7, 5, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 8, 5},
                {0, 2, 0, 0, 0, 8, 0, 0, 0},
                {6, 8, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 7, 0, 6},
                {0, 0, 7, 0, 0, 0, 8, 0, 0},
                {0, 0, 0, 8, 0, 9, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 2, 1, 3}
        };

        // 2) Afficher le tableau de départ
        afficheBoard( myBoard );
        System.out.println();


        // 3) résoudre l'exercice
        if ( solveBoard(myBoard) )
        {
            System.out.println("SUDOKU TERMINE CORRECTEMENT !!");

            // 4) Afficher la solution
            System.out.println();
            afficheBoard( myBoard );
        }
        else
        {
            System.out.println("SOUDOKU IMPOSSIBLE A RESOUDRE");
        }

        System.out.println("Execution time: " + (System.currentTimeMillis()-start) );
    }


    // V E R I F I C A T I O N S


    private static boolean isNumberInLigne (int[][] board, int number, int ligne)
    {
        for (int i = 0; i < GRID_SIZE; i++)
        {
            if (board [ligne][i] == number)
            {
                return true;
            }
        }
        return false;
    }


    private static boolean isNumberInColonne (int[][] board, int number, int colonne)
    {
        for (int i = 0; i < GRID_SIZE; i++)
        {
            if (board [i][colonne] == number)
            {
                return true;
            }
        }
        return false;
    }


    private static boolean isNumberInBloc (int[][] board, int number, int ligne, int colonne)
    {
        int localBlocLigne   = ligne   - ligne   % 3;
        int localBlocColonne = colonne - colonne % 3;

        for (int i = localBlocLigne ; i < localBlocLigne + 3 ; i++)
        {
            for (int j = localBlocColonne; j < localBlocColonne + 3 ; j++)
            {
                if (board[i][j] == number)
                {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean isValidPlacement (int[][] board, int number, int ligne, int colonne)
    {

        if (
                ( isNumberInLigne  (board, number, ligne)        == false )  &&
                        ( isNumberInColonne(board, number, colonne)      == false )  &&
                        ( isNumberInBloc(board, number, ligne, colonne)  == false )
        )
        {
            return true;
        }
        else
        {
            return false;
        }

    }



    // B A C K - T R A C K I N G   A L G O R I T H M E


    private static boolean solveBoard (int[][] board)
    {
        // On traverse toutes les LIGNES du BOARD-GAME
        for (int ligne = 0; ligne < GRID_SIZE; ligne++)
        {
            // On traverse toutes les COLONNES de la LIGNE actuelle du BOARD-GAME
            for (int colonne = 0; colonne < GRID_SIZE; colonne++)
            {
                // Si la valeur n'a pas encore été placé : ...
                if (board[ligne][colonne] == 0)
                {
                    //... On va essayer de placer la valeur de 1 à 9 !
                    for (int numberToTry = 1; numberToTry <= 9; numberToTry++)
                    {
                        // Vérification des voisin (Bloc / Ligne / colonne)
                        if (isValidPlacement(board,numberToTry,ligne,colonne))
                        {
                            board [ligne][colonne] = numberToTry;       // Affectation de la valeur à la position!

                            // RECURSION --> BackTracking

                            if ( solveBoard(board) )
                            {
                                return true; //Quand tout le sudoku de ce niveau recursif a été rempli correctement, cette valeur sera TRUE
                            }
                            else
                            {
                                board [ligne][colonne] = 0; // Try to solve the rest of the board with the value of "numberToTry", but don't suceed

                            }
                        }
                    }
                    return false;

                }

            }

        }
        return true; //Quand tout le sudoku a été rempli correctement, cette valeur sera TRUE, et sudoku terminé
    }



    // A F F I C H A G E

    private static void afficheBoard (int[][] board)
    {
        for (int ligne = 0; ligne < GRID_SIZE; ligne++)
        {
            if (ligne % 3 == 0 && ligne != 0)
            {
                System.out.println("-----------");
            }
            for (int colonne = 0; colonne < GRID_SIZE; colonne++)
            {
                if (colonne % 3 == 0 && colonne != 0)
                {
                    System.out.print("|");
                }

                System.out.print( board[ligne][colonne] );

            }

            System.out.println();
        }
    }
}