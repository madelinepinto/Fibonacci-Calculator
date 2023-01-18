/*@Author:    Madeline Pinto       @Date: October 15 2022
 * 
 * This program uses a recursive function to find the value of
 * the nth Fibonacci number. Recall that the Fibonacci numbers
 * are listed as follows: 1, 1, 2, 3, 5, 8, 13, 21, 34... */
import java.util.Scanner;

class FibonacciCalculator{
 public static void main (String args[]){ 
   Scanner in = new Scanner(System.in);
   //output
   System.out.println("The first nine fibonacci numbers are listed as follows:\n"
                         +"1, 1, 2, 3, 5, 8, 13, 21, 34...\n"
                         +"What fibonacci term would you like to see?");
   //user input
   int n = in.nextInt();   
   //result output
   System.out.println("The "+n+"th Fibonacci number is "+fib(n)); 
    } 
 /*@Author:    Madeline Pinto       @Date: October 15 2020
 * 
 * This method uses a recursive function to find the value of
 * the nth Fibonacci number. 
 * Param: int     Return: int*/
 public static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    }
}