/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   IPPS.java
 Classes:     BinaryConv.java
 Description: 
*/
 
import java.util.Scanner;
 
public class BinaryConv // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  int a;
  int remain = 0;
  String binary;
  String initialBinary = "";
  String finalBinary = "";
  
  
  binary = scnr.next();
  a = Integer.parseInt(binary);
  
  if (a < 0)
                System.exit(0);
  if (a == 0)
                System.out.print(0);
  
  while (a > 0) {
                remain = a % 2;
                initialBinary = initialBinary + remain;
                a = a / 2;
  }
  
 
   
  for (int i = initialBinary.length() - 1; i >= 0; i--) {
                finalBinary = finalBinary + initialBinary.charAt(i);
  }
  
  int actualFinalBinary;
  actualFinalBinary = Integer.parseInt(finalBinary);
  
  System.out.println(actualFinalBinary);
  
 
 scnr.close();

  
  
   }
}
