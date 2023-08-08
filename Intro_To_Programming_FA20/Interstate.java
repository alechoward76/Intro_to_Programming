/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Interstate.java
 Description: 
*/
 
import java.util.Scanner;
 
public class Interstate // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  String sHighway = scnr.nextLine();
  String direction;
  int highwayNum= Integer.parseInt(sHighway);
  
  if (highwayNum >= 1 && highwayNum <=99) {
	  //System.out.println("Primary");
	  if (highwayNum % 2 !=0) {
		  direction = "north/south";
	  }
	  else {
		  direction = "east/west";
	  }
	  System.out.println("The "+ highwayNum + " is primary, going "+direction+".");
  }
  else if (highwayNum >=100 && highwayNum<=999) {
	  //System.out.print("Auxiliary");
	  String aHighway = sHighway.substring(1,sHighway.length());
	  if (Integer.parseInt(aHighway) % 2 !=0) {
		  direction="north/south";
		  
	  }
	  else {
		  direction="east/west";
	  }
	  
	  System.out.println("The "+sHighway+" is auxiliary, serving the "+aHighway+", going "+direction+".");
  }
  
  else {
	  System.out.println(highwayNum+" is not a valid interstate highway number.");
  }
   
 
 
   } // end main **********************************************
   
} //end Template Class ************************************

