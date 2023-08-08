/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   QuizScores.java
 Classes:     QuizScores
 Description: 
*/
 
import java.util.Scanner;
 
public class QuizScores // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  double max = 0;
  double min = 1000;
  double total = 0;
  double value;
  String testScore = "0";
  double count= 0.0;

  
  
  
  	do { 
		  value=Integer.parseInt(testScore);
		  total += value;
		  System.out.println("Enter a score or enter 'stop' to exit: ");
		  
		 
		  count +=1.0;
		  if (value > max) {
			  max = value;
		  }
		  if (value < min && value!=0) {
			  min = value;
		  }
		  else {
			  
		  }
		  testScore=scnr.next();
  	}
	 while(!(testScore.equalsIgnoreCase("stop") || testScore.equalsIgnoreCase("exit") ));
  		
  	if(min == 1000) {
  			
  	}
  	else {
  		  System.out.printf("Sum of quiz scores: %.1f\n", total);
  		  System.out.printf("Number of quiz scores: %.0f\n", count-1);
  		  System.out.printf("Average quiz score: %.1f\n",(total/(count-1)));
  		  System.out.printf("Maximum quiz score: %.1f\n", max);
  		  System.out.printf("Minimum quiz score: %.1f\n", min);

  	}
	  
	  
  	scnr.close();
  
  
  
  
  
   }
}
