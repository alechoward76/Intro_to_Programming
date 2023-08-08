/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   StringDigits.java
 Classes:     StringDigits
 Description: 
*/
 
import java.util.Scanner;
 
public class StringDigits // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  
  String userInput = scnr.nextLine();
  int i=0;
  String justNums = "";
  String justWords = "";
 
  while(i <= userInput.length()-1) {
	  if (Character.isDigit(userInput.charAt(i))) {
		  justNums += userInput.charAt(i);
		  i++;
		  
		  
	  }
	  
	 else {
		 justWords += userInput.charAt(i);
		 i++;
		 
		  
	  }
	  
	  
  }
  System.out.println(justNums);
  System.out.println(justWords);
  
  
  // char someChar = ' ';
  
   
 /* for (int i = 0; i < userInput.length(); i++) {
      if (userInput.charAt(i) == someChar) {
          count++;
      }
  }
  
 /* int numWords = count+1;
  
  int j=1;
  
  int nOne = userInput.indexOf(" ",0);
  String stringOne = (userInput.substring(0,nOne));
  System.out.println(stringOne);
  while(j<=numWords) {
	  //create substring
	  int s2 = count-(count-1);
	  int nX = userInput.indexOf(count,count+1);
	  String stringX = (userInput.substring(count,count+1));
	  System.out.println(stringX);
	  count--;
	  

  }
   
 /* int nTwo = userInput.indexOf(" ",userInput.indexOf(" ",0)+1);
  
 
  String middleName = (nameOne.substring(nOne,nTwo));
  String lastName = (nameOne.substring(nTwo));
  
  /*if (count==2) {
  
	  */
	  
  
  
  
  
  
   }
}
