/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     ExampleDoWhile.java
 Description: 
*/
 
import java.util.Scanner;
 
public class ExampleDoWhile // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  int total = 0;
  int value;
  String input = "0";
  
  do { 
	  value=Integer.parseInt(input);
	  total += value;
	  System.out.print("Enter an integer or stop to exit: ");
	  input=scnr.next();
  }while(!input.equalsIgnoreCase("stop") );
  
  System.out.printf("Sum Total = %d\n", total);
  
  scnr.close();
  
  
   }
}
