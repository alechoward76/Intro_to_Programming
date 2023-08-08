/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Commission.java
 Description: 
*/
 
import java.util.Scanner;
 
public class Commission // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  int monthSales = scnr.nextInt();
  double monthReturn = scnr.nextDouble();
  double monthTotal;
  
  final int MONTHLY_SALARY = 2500;
  double netSales = monthSales-monthReturn;
  if (netSales < 0) {
	  netSales = 0;
  }
  if (monthSales <0) {
	  System.out.println("Invalid");
  }
  else if (monthSales <= 1000) {
	  monthTotal = (.01 * (monthSales-monthReturn)) + 2500.0;
	  System.out.printf("Total monthly pay = $%,.2f",monthTotal);  
	  System.out.printf(" based on net sales of $%,.2f",(netSales));
  }
  
  else {
	  monthTotal = ((monthSales-1000-monthReturn)*.03) + +2510.0;
	  System.out.printf("Total monthly pay = $%,.2f",monthTotal);  
	  System.out.printf(" based on net sales of $%,.2f",(netSales));
  }
  
  
  
  
  
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

