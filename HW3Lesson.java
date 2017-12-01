/**
 * Java. Level 1. Lesson 3. 
 *
 * @author Alexey G. Ivanov
 * @version dated Dec 01, 2017
 */
import java.util.Scanner;

public class HW3Lesson {

    static Scanner key_input = new Scanner(System.in);

    public static void main(String [] args) {

        int nattempts = 0;
        int nparam=0;
        int retval;
        int guessnum=0;

         // The start of the random-values generator;

        int nnumber = (int) (Math.random() * 10);
        while (true) {
            retval = 0;

        // Call the checkpoint of input values (no any letters, more 0 and less 9);

            retval = chk_val(nparam);

         // Reflected input and return value;

            System.out.println();
            System.out.println("You input:" + retval);

        // All previous checking was okay and then
        // Calling of "the core of the game";

            guessnum = my_guess(nnumber, retval, nattempts);
            nattempts = nattempts + Math.abs(guessnum);
            System.out.println("Total attempts:" + nattempts);

        // "if the gamer won";

                if (guessnum == -1) {

        // The gamer should select between to continue (value - "1")
        // or to leave the game(value - "0" ;

                    System.out.println();
                    System.out.println("Please make your next choice:");
                    retval = chk_continue(nparam);

        // There was chosen "to leave the game";

                   if (retval == 0) {
                        break;
                   } else {

        // There was chosen "to start again";

                        nparam = 0;
                        nattempts = 0;
                        nnumber = (int) (Math.random() * 10);
                   }

        // Setting of the range of attempts to guess number and
        // the offer to choice "to out or to play again";

        // All attempts (value = 3) were run out. The offer to choice to stop or try to play again;

                } else if (nattempts > 2) {
                    System.out.println();
                    System.out.println("All of your attempts" + "  " + nattempts +"  "+ "were run out:" );
                    System.out.println();
                    System.out.println("The number was :  " + nnumber);
                    System.out.println("Sorry but you've lost...");
                    System.out.println();
                    System.out.println("Please make your next choice:  ");

                    retval = chk_continue(nparam);

        // "to leave the game";

                        if (retval == 0) {
                            key_input.close();
                            break;
                        } else {

        // "to start again";

                            nparam = 0;
                            nattempts = 0;
                            nnumber = (int) (Math.random() * 10);
                        }
                }

        }
    }
       // The core of the game

    public static int my_guess(int nnumber, int retval, int nattempts){

      // The number == to inputted number;

        if (nnumber == retval) {
            System.out.println();
            System.out.println("Bingo! You win !!");
            System.out.println();
            nattempts=-1;

      // The number > than inputted number

        } else if (nnumber > retval) {
            System.out.println();
            System.out.println("The number is greater than  " +retval );
            System.out.println();
            nattempts=1;

      // The number < than inputted number;

        } else {
            System.out.println();
            System.out.println("The number is less than " + retval);
            System.out.println();
            nattempts=1;
        }
            return nattempts;
        }

      // Checking of inputted values (no any letters, more 0 and less 9);

        public static int chk_val(int nparam){

        boolean rightcode = false;

      //Scanner key_input = new Scanner(System.in);

            do {
                System.out.println();
                System.out.print("Please input only integer value between '0' and '9' :");
                System.out.println();
                String nvalstr = key_input.next();

            try {
                int nvalnum = Integer.parseInt(nvalstr);

                if (nvalnum >= 0 && nvalnum <= 9) {
                    rightcode = true;

      // Saving of checked value;

                    nparam = nvalnum;
                } else {
                    rightcode = false;
                }
            } catch(NumberFormatException e){
                    System.out.println();
                    System.out.println("You should input integer values only!");
                }
            } while (!rightcode) ;
        return nparam;
        }

       // Checking of inputted values (no any letters, only 0 or 1);

    public static int chk_continue(int nparam){

        boolean rightcode = false;

      // Scanner key_input = new Scanner(System.in);

        do {
                System.out.print("Please input only integer value between '0' and '1' !");
                System.out.println();
                System.out.print("'0' - to leave the game, '1' - new start of the game:   ");
                String nvalstr = key_input.next();

            try {
                int nvalnum = Integer.parseInt(nvalstr);

      // Right value, it could be taken;

                if (nvalnum == 0 || nvalnum == 1) {
                    rightcode = true;

      // Saving of checked value;

                    nparam = nvalnum;

      // All others, they should be rejected;

                } else {
                    rightcode = false;
                }
            } catch(NumberFormatException e){
                  System.out.println();
                  System.out.println("You should select integer values only! 0 or 1! ");
            }
        } while (!rightcode) ;
        return nparam;
    }
}
