

/*
 Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     Template
 Description: 
*/
 
import java.util.Scanner;
 
public class SeatsNroom // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );


  int room = scnr.nextInt();
  int seats = 0;

  if ( room < 101 || room > 116 ) 
	  System.out.println( "Invalid room number, zero seats." );
  		
  
   
  else { 
	  switch ( room ) {
		case 110: case 101: case 116:
			seats = 50;
			break;
		case 111: case 113:
			seats = 45;
			break;
		case 112: case 114:
			seats = 35;
			break;
		default:
			seats = 40;
		
				
		}
	  System.out.printf("Room number %d has %d seats.\n", room, seats );
	}
         // change the if-control block to a switch
		/*if ( room == 110 || room == 101 || room == 116 )
			   seats = 50;
		else if ( room == 111 || room == 113 )
			   seats = 45;
		else if ( room == 112 || room == 114 )
			   seats = 35;
		else
			   seats = 40;*/
	   	
	
	scnr.close();
   }   	// end main
}		// end class
