/*
 Author:       Alec Howard
 Date:         9/1/2020
 Course:      CS 1043
 Section      
 File Name:   IPPS.java
 Classes:     Lab1CalorieBurn
 Description: Calculate the calorie burn in women/men
*/
 
import java.util.Scanner;
 
public class Lab1CalorieBurn // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
   
  Double ageYears = scnr.nextDouble();
  Double weightPounds = scnr.nextDouble();
  Double heartRate = scnr.nextDouble();
  Double timeMinutes = scnr.nextDouble();
  
  Double womenCalories = ((ageYears * .074)-(weightPounds*.05741)+(heartRate*.4472)-20.4022)*timeMinutes/4.184;
  Double menCalories = ((ageYears * .2017)+(weightPounds*.09036)+(heartRate*.6309)-55.0969)*timeMinutes/4.184;
  
  System.out.printf("Women: %.2f", womenCalories);
  System.out.print(" calories");
  System.out.println(" ");
  System.out.printf("Men: %.2f", menCalories);
  System.out.print(" calories");






 
   } // end main **********************************************
   
} //end Template Class ************************************
