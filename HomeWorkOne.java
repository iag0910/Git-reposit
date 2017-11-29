//package com.company;

/**
 * JAVA1. HOMEWORK 1
 * @ AUTHOR ALEXEY G. IVANOV
 * @ 21/11/2017
 * $ mailto iag0910@gmail.com
 */
public class HomeWorkOne {

    public static void checkyear(int start, int end){                        //Task 8
        if (start==0)  {System.out.println("The start was taken as 1!"); 
            start=start+1;}
        for ( int i=start; i <= end; ) {
            if (i % 4 == 0) {    
                if (i%400==0 || i%100 != 0 )   
                    System.out.println("Leap years are:  " + i);
                i = i + 1;
            } else {
                i = i + 1;       

            }
        }
    }

    public static void retname(String strname){             // Task №7
        if ( strname=="" ) System.out.print("Task 7. The name was not definded!");
        else System.out.print("Task 7. Returned value is: Hello, Mr."+ strname);

    }

    static public boolean retbool(int f) {                   // TAsk №6
        if (f < 0) return true;
        else return false;
    }

    static public boolean retval(int f) {                 // Task №5
        if (f >= 0) return true;
        else return false;
    }

    static public boolean mycheck(int a1, int d1) {         // Task №4
        if ((a1 + d1) >= 10 && (a1 + d1) <= 20) return true;
        else return false;
    }

    static public int F1(int a, int b, int c, int d) {    // Task №3
        return a * (b + (c / d));
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 656;
        int a = 10;
        int b = 20;
        int c = 150;
        int d = 7;
        double db;
        float f = -10.0f;
        long l;
        byte by;
        char ch;
        String Str;
        boolean boo;

        System.out.print("Task 3. Returned value is: " + F1(a, b, c, d)); // Task №3
        System.out.println();
								// Task №4
        System.out.print(("Task 4." + "Defined figures were:" + a + "  " + d + " Returned value is: " + mycheck(a, d))); 
        System.out.println();

        if (retval((int) f)) System.out.print("Task 5. Returned value is: + ");  // Task №5
        else System.out.print("Task 5. Returned value is: -");
        System.out.println();

        if (retbool((int) f)) System.out.print("Task 6. Returned value is:" + retbool((int) f));  // Task №6
        else System.out.print("Task 6.Positive figure was defined, there's nothing to be returned ");

        System.out.println();                                                               //Task №7
        //Str="";
        Str="JFK";
        retname(Str);


        System.out.println();
        System.out.println("The start was taken as, year:   "+ start);                      //Task №8 
        System.out.println("The finish was taken as, year:   "+ end);
        checkyear(start, end);


    }

}