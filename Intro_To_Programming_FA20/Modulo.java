/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Modulo
 Description: 
*/
 
import java.util.Scanner;
 
public class Modulo // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  System.out.println("Enter the dividend then divisor:");
  int myDividend = scnr.nextInt();
  int myDivisor = scnr.nextInt();
  
  int myQuotient = myDividend / myDivisor;
  int myRemainder = myDividend % myDivisor;
  
  System.out.println("Quotient = " + myQuotient);
  System.out.println("Remainder = " + myRemainder);
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

