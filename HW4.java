/**
 * Java. Level 1. Lesson 4. Tic-tac-toe in console
 *
 * @author Alexey G. Ivanov
 * @version dated Dec 05, 2017
 * @link https://github.com/iag0910
 */

import java.util.*;

class TicTacToe {

    final int SIZE = 4; //  A Lite version of the game: game-field 4x4;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    TicTacToe() {
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }

        }
        System.out.println("GAME OVER.");
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }

    boolean checkWin(char dot) {

    // There was presented only a lite version of the game: game-field 4x4;

    //  Four arrays create (for checking win-dots from horizontal, vertical, couple of diagonals)

        int ndot_v[] = new int[SIZE];
        int ndot_h[] = new int[SIZE];

        int diag_one[]=new int[SIZE];
        int diag_two[]=new int[SIZE];

        int sum_v=0;
        int sum_h=0;

        int sum_diag_one=0;
        int sum_diag_two=0;

    // Paired diagonal checking;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot)
                diag_one[i] = 1;
        }
        for (int d : diag_one) sum_diag_one = sum_diag_one+d;

    // Not - Paired diagonal checking;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE-i-1] == dot)
                diag_two[i] = 1;
        }
        for (int d : diag_two) sum_diag_two = sum_diag_two+d;

    // Horizontals checking;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot)
                 ndot_h[j] = 1;
            }
        }
        for (int h : ndot_h) sum_h=sum_h+h;

    // Verticals checking;

        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][j] == dot)
                ndot_v[i] = 1;
            }
        }
        for (int v : ndot_v) sum_v=sum_v+v;

    // Control checking of directions of the game-field;

        if (sum_h == SIZE || sum_v== SIZE || sum_diag_one==SIZE|| sum_diag_two==SIZE) {
            return true;
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        if (map[x][y] == DOT_EMPTY)
            return true;
        return false;
    }
}
