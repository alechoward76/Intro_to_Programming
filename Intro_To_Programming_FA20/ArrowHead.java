/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   ArrowHead.java
 Classes:     ArrowHead
 Description: 
*/
 
import java.util.Scanner;
 
public class ArrowHead // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
int nRows = scnr.nextInt();
  
  int nColumns = 1;
  int nSpaces = nRows-nColumns;
  int ic, ir, ib;
  
  if (nRows > 10) {
	  
  }
  
  else {
	  for(ir = 1; ir<=nRows; ir++) {
		  
		  for(ib = 1; ib <= nSpaces; ib++) {
			  System.out.print(' ');
		  }
			  
		//********************************	  
		  for (ic = 1;ic<=nColumns; ic++) {
		  		
		  		System.out.print('*');
		  		
		  		
		  	}
		  System.out.println();
		  	nColumns+=2;
		  	nSpaces--;
		  
		  
	  }
  
  }
  
  scnr.close();
  
  
   }
}
