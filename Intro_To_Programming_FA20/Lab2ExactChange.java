/*
 Author:       Alec Howard
 Date:         September 5, 2020
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Lab2ExactChange.java
 Description: 
*/
 
import java.util.Scanner;
 
public class Lab2ExactChange // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  final int PENNY_VALUE = 1;
  final int NICKEL_VALUE = 5;
  final int DIME_VALUE = 10;
  final int QUARTER_VALUE = 25;
  final int HALF_DOLLAR_VALUE = 50;
  final int DOLLAR_COIN_VALUE = 100;
  
  System.out.println("Enter the amount in cents:");
  int numCents = scnr.nextInt();
  
  int numDollarCoins = numCents / DOLLAR_COIN_VALUE;
  int numCents2 = numCents % DOLLAR_COIN_VALUE;
  
  int numHalfDollars = numCents2 / HALF_DOLLAR_VALUE;
  int numCents3 = numCents2 % HALF_DOLLAR_VALUE;
  
  int numQuarters = numCents3 / QUARTER_VALUE;
  int numCents4 = numCents3 % QUARTER_VALUE;
  
  int numDimes = numCents4 / DIME_VALUE;
  int numCents5 = numCents4 % DIME_VALUE;
  
  int numNickels = numCents5 / NICKEL_VALUE;
  int numCents6 = numCents5 % NICKEL_VALUE;
  
  int numPennies = numCents6 / PENNY_VALUE;
  
  
  System.out.println("The change for " + numCents + " cents is:");
  System.out.println("Dollars = " + numDollarCoins);
  System.out.println("Half-Dollars = " + numHalfDollars);
  System.out.println("Quarters = " + numQuarters);
  System.out.println("Dimes = " + numDimes);
  System.out.println("Nickels = " + numNickels);
  System.out.println("Pennies = " + numPennies);
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

