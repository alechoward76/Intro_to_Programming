/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     MusicalNotes
 Description: Copy and use this template to start every Java Program
                Changing above comment and class name
*/
 
import java.util.Scanner;
 
public class MusicalNotes // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  double r = Math.pow(2, (1.0/12.0));
  double initialKey = scnr.nextDouble();
  
  double keyTwo = initialKey * (Math.pow(r, 1));
  double keyThree = initialKey * (Math.pow(r, 2));
  double keyFour = initialKey * (Math.pow(r, 3));
  double keyFive = initialKey * (Math.pow(r, 4));
  
  System.out.printf("%.2f", initialKey);
  System.out.printf(" %.2f", keyTwo);
  System.out.printf(" %.2f", keyThree);
  System.out.printf(" %.2f", keyFour);
  System.out.printf(" %.2f", keyFive);
  
  
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

