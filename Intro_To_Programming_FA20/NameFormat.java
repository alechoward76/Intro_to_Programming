/*
 Author:       Alec Howard
 Date:         9/9/20
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     NameFormat.java
 Description: 
*/
 
import java.util.Scanner;


 
public class NameFormat // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  String nameOne;
 
  nameOne = scnr.nextLine();
  
  char someChar = ' ';
  int count = 0;
   
  for (int i = 0; i < nameOne.length(); i++) {
      if (nameOne.charAt(i) == someChar) {
          count++;
      }
  }
  
  if (count==2) {
  
	  int nOne = nameOne.indexOf(" ",0);
	  int nTwo = nameOne.indexOf(" ",nameOne.indexOf(" ",0)+1);
	  
	  
	  
	  String firstName = (nameOne.substring(0,nOne));
	  String middleName = (nameOne.substring(nOne,nTwo));
	  String lastName = (nameOne.substring(nTwo));
	  String lastName1 = lastName.replace(" ","");
	  
	  String firstLetter = Character.toString(middleName.charAt(1));
	  System.out.print(lastName1+", ");
	  System.out.print(firstName+" ");
	  System.out.print(firstLetter+"."); 
	   
  }
  
  else {
	  int nUno = nameOne.indexOf(" ",0);
	  
	  String firstName = (nameOne.substring(0,nUno));
	  String lastName = (nameOne.substring(nUno));
	  //String lastName1 = lastName.replace(" ","");
	  System.out.print(lastName+", ");
	  System.out.print(firstName);
	  
  }
 
   } // end main **********************************************
   
} //end Template Class ************************************

