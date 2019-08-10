package com.fundamentals.java;

public class Main {
    //patterned after page 4 example
    static void AddThemUP() {       //defining a method to add 2 numbers
        int a = 4;
        int b = 5;

        System.out.println("The numbers add up to " + (a + b));
    }

    public static void main(String[] args) {


        AddThemUP();   //Calling the method to add the numbers in the main calling program - page 4
        AddWithParameters(2, 5);  // page 5 - being able to pass values to method makes it more dynamic

        //pages 5 & 6; using a return statement to return the sum to the main calling program
        System.out.println("The method that has a return type adds the numbers to " + ReturnType(9, 10));

        //pages 6 - 7 recursive method
        System.out.println("The factorial of 7 is " + matterOfFactorial(7));

    }

    //example page 5
    static void AddWithParameters(int c, int d) {
        System.out.println("The numbers for the parameterized method add up to " + (c + d));
    }

    //example pages 5 & 6
    static int ReturnType(int e, int f) {
        return (e + f);     //return statementm
    } // end of the method

    /*
    *pages 6 - 7
    *recursive method  which calls itself iteratively
    * example is the implemntation of a factorial series
    * */
    static int matterOfFactorial(int fa) {
        int outcome;
        if(fa == 1) {
            return 1;
        }
        else {
            outcome = matterOfFactorial(fa - 1) * fa;
            return outcome;
        }
    }  // end of the method

} // end of the class

