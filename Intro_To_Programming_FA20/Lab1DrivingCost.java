/*
 Author:      Alec Howard
 Date:        August 31, 2020
 Course:      CS 1043
 Section      
 File Name:   Labs_IPPS
 Classes:     Lab1DrivingCost
 Description: Compute gas milage and costs
*/
 
import java.util.Scanner;
 
public class Lab1DrivingCost // The class name begins with an upper case letter
{
   public static void main( String args[] )
  {
  Scanner scnr = new Scanner( System.in );
  
  
  Double milesPerGallon = scnr.nextDouble();
  
  Double dollarsPerGallon = scnr.nextDouble();
  
  double priceTwenty = (20/milesPerGallon)*dollarsPerGallon;
  double priceSeventyfive = (75/milesPerGallon)*dollarsPerGallon;
  double priceFivehundred = (500/milesPerGallon)*dollarsPerGallon;
  
  System.out.printf("%.2f", priceTwenty);
  System.out.printf(" %.2f", priceSeventyfive);
  System.out.printf(" %.2f", priceFivehundred);






  
  
   
  
  
  
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************
