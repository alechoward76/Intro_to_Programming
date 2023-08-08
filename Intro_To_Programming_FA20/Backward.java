/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Backward.java
 Description: 
*/
 
import java.util.Scanner;
 
public class Backward // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  String userInput=scnr.nextLine();
  char c1[] = userInput.toCharArray();
  String x = "";
  
  for (int i=c1.length-1;i>=0;i--){
	  x+=c1[i];
	  
	  
  }

  System.out.println(x);
  
  
  
   }
   
}