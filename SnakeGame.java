public class SnakeGame {

    //Elements
    private bool[][] game;
    private int[] headPosition; // Make it equal to 2 in constructor
    private static int exhaustiveChecks;
    private static int recursiveChecks;


    //Constructor 1, Default test size 1x1

    //Constructor 2 hggku
    //findTailExhaustive Method
    /*
    Return an array of 3 integers (tail at x, tail at y, length)

    findTailExhaustive
    Start at first cell (0, 0)
    Part of snake? length++
        exhaustiveChecks++
        No: move to next cell
        Yes: how many neighors are in snake?
       --> 1: Either at head or tail
       |         Break up the for loops
       |   +2: Move to next cell
       |__ Return tail (x, y)
    [X][][][x]
    [_][][][x]
    [][][s][x]
    [_][][][_]

     */
    public int[] neighbors( int r, int c ) {
        int neigh = 0;
        if (((r - 1 >= 0) && (r - 1 <= game.length)) && ((c - 1 >= 0) && (c - 1 <= game.length))) {
            if (game[r - 1][c - 1] == 1) {
                neigh++;
            }
        }
        if (((r - 1 >= 0) && (r - 1 <= game.length)) && ((c - 1 >= 0) && (c - 1 <= game.length))) {
            if (game[r - 1][c] == 1 && (((r - 1 >= 0) && (c - 1 <= game.length - 1)) && ((r >= 0) && (c <= game.length - 1)))) {
                neigh++;
            }
        }
        if ((((r >= 0) && (r <= game.length - 1)) && ((c - 1 >= 0) && (c - 1 <= game.length - 1)))) {
            if (game[r][c - 1] == 1) {
                neigh++;
            }
        }
        if ((((r + 1 >= 0) && (r + 1 <= game.length - 1)) && ((c + 1 >= 0) && (c + 1 <= game.length - 1)))) {
            if (game[r + 1][c + 1] == 1) {
                neigh++;
            }
        }
        if ((((r + 1 >= 0) && (r + 1 <= game.length - 1)) && ((c >= 0) && (c <= game.length - 1)))) {
            if (game[r + 1][c] == 1) {
                neigh++;
            }
        }
        if ((((r >= 0) && (r <= game.length - 1)) && ((c + 1 >= 0) && (c + 1 <= game.length - 1)))) {
            if (game[r][c + 1] == 1) {
                neigh++;
            }
        }
        if ((((r - 1 >= 0) && (r - 1 <= game.length - 1)) && ((c + 1 >= 0) && (c + 1 <= game.length - 1)))) {
            if (game[r - 1][c + 1] == 1) {
                neigh++;
            }
        }
        if ((((r + 1 >= 0) && (r + 1 <= game.length - 1)) && (c - 1 >= 0) && (c - 1 <= game.length - 1))) {
            if (game[r + 1][c - 1] == 1) {
                neigh++;
            }
        }

        //Create the array
        int[][] A = new int[3][3];
        return neigh;

    }
    //findTailExhaustive Method
    //Somehow use neighbors
    public int[] findTailExhaustive() {
        /*

         */
    }

    //findTailRecursive Method
    public int findTailRecursive( int r, int c ) {
        /*

         */
    }

    private int[] findTailRecursive( int[] currentPosition, int[] previousPosition ) {
        /*

         */

    }

    //Reset Counters Method
    private void resetCounters(){
        /*

         */

    }

    //Recursive Checks Method
    private static int getRecursiveChecks(){
        /*

         */

    }

    //Get Exhasutive Checks Method
    private static int getExhaustiveChecks(){
        /*

         */
    }

}//Class

/*
Lab4
	1. Find the tail
	Nested Loops
	(Cells checked)
	2. Recursion
	Stop: find tail
	1st constructor Default
	2nd constructor will have a 2D Array, it's going to be your "game method"
	2 integers (x, y), where the head of the snake is gonna be
	Boolean method
	Private
 */