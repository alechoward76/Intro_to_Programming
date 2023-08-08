/*
 Author:       Alec Howard
 Date:         9/15/2020
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Lab3Coins.java
 Description: Exact change lab
*/
 
import java.util.Scanner;
 
public class Lab3Coins // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
   
 int numCents=scnr.nextInt();
 
 final int PENNY_VALUE=1;
 final int NICKEL_VALUE=5;
 final int DIME_VALUE=10;
 final int QUARTER_VALUE=25;
 final int HALF_DOLLAR_VALUE=50;
 final int DOLLAR_COIN_VALUE=100;
 
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
 
 if (numCents==0) {
	 System.out.println("no change");
	
 }
 else {
	 if (numDollarCoins > 1) {
		 System.out.println(numDollarCoins+ " dollars");
	 }
	 else if (numDollarCoins <1) {
		 
	 }
	 else {
		 System.out.println(numDollarCoins+ " dollar");
	 }
	 if (numHalfDollars > 0) {
		 System.out.println(numHalfDollars+ " half-dollar");
	 }
	 else {
		 
	 }
	 
	 if (numQuarters >0) {
		 System.out.println(numQuarters+" quarter" );
	 }
	 else {
		 
	 }
	 
	 if (numDimes > 1) {
		 System.out.println(numDimes+" dimes");
		 
	 }
	 else if (numDimes <1) {
		 
	 }
	 else {
		 System.out.println(numDimes+" dime");
	
	 }
	 if (numNickels >0) {
		 System.out.println(numNickels+" nickel" );
	 }
	 else {
		 
	 }
	 if (numPennies >1) {
		 System.out.println(numPennies+" pennies");
	 }
	 else if (numPennies <1) {
		 
	 }
	 else {
		 System.out.println(numPennies+" penny");
	 }
	
	 }
 
   } // end main **********************************************
   
} //end Template Class ************************************

