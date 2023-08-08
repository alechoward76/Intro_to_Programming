/*
 Author:       Alec Howard
 Date:         9/9/2020
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Lab3WeeklyPay
 Description: 
*/
 
import java.util.Scanner;
 
public class Lab3WeeklyPay // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  double xTotal;
  double yTotal;
  
  System.out.println("Enter the wage and hours worked per week:");
  double hourlyWage = scnr.nextDouble();
  double hoursWorked = scnr.nextDouble();
  
  
  
  if (hoursWorked > 40.0) {
  	xTotal = (40.0 * hourlyWage) + ((hoursWorked - 40.0)*(hourlyWage*1.5));
  	System.out.printf("Worker pay is $%.2f", xTotal);
  }
  else {
  	yTotal = hourlyWage * hoursWorked;
  	System.out.printf(" Worker pay is $%.2f", yTotal);
  }	
  
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

