/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      
 File Name:   IPPS.java
 Classes:     MathMethods
 Description: Copy and use this template to start every Java Program
                Changing above comment and class name
*/
 
import java.util.Scanner;
 
public class MathMethods // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  double x = scnr.nextDouble();
  double y = scnr.nextDouble();
  double z = scnr.nextDouble();
  
  double numOne = Math.pow(x, z);
  double numTwo = Math.pow(x, (Math.pow(y, z)));
  double numThree = Math.abs(y);
  double numFour = Math.sqrt((Math.pow((x*y), z)));
  
  System.out.print(numOne);
  System.out.print(" "+numTwo);
  System.out.print(" "+numThree);
  System.out.print(" "+numFour);
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************
