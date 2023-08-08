import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Lab2CoinsTemplate {  
	   
   public static void main( String[] args ) {
		   
	   final double PENNY_VALUE = 0.01;
	   
	   	   NumberFormat formatter
	         = NumberFormat.getCurrencyInstance(Locale.US);

      double total = PENNY_VALUE;
      
	   System.out.println( "Total value = " + formatter.format(total) );
	   console.close();

   } // end main
}    // end class