/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     RemoveGray.java
 Description: 
*/
 
import java.util.Scanner;
 
public class RemoveGray // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  
  int red;
  int green;
  int blue;
  int minColor;
  
  red=scnr.nextInt();
  blue = scnr.nextInt();
  green = scnr.nextInt();
  
  
  if (red >= 0 && green>=0 && blue >=0 && red<=255 && green<=255 && blue <=255) {
	  
	  if (red < green && red < blue) {
		  minColor = red;
	  }
	  else if (green < red && green < blue) {
		  minColor = green;
	  }
	  else  {
		  minColor = blue;
	  }
	  
	  red = red - minColor;
	  green = green - minColor;
	  blue = blue-minColor;
	  
	  System.out.println(red+", "+blue+", "+green);
  }
  else {
	  System.out.print("Invalid input: color values are from 0 to 255.");
  }
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

