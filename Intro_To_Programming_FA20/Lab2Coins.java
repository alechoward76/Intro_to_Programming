import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
public class Lab2Coins {  
	   
   public static void main( String[] args ) {
   Scanner scnr=new Scanner(System.in);
		   
	   final double PENNY_VALUE = 0.01;
	   final double NICKEL_VALUE = 0.05;
	   final double DIME_VALUE = 0.10;
	   final double QUARTER_VALUE = 0.25;
	   final double HALF_DOLLAR_VALUE = 0.50;
	   final double DOLLAR_COIN_VALUE = 1.00;
	   
	   	   NumberFormat formatter
	         = NumberFormat.getCurrencyInstance(Locale.US);
	   	   
	  System.out.println("How many pennies do you have?");
	  int numPennies = scnr.nextInt();
	  System.out.println("How many nickels do you have?");
	  int numNickels = scnr.nextInt();
	  System.out.println("How many dimes do you have?");
	  int numDimes = scnr.nextInt();
	  System.out.println("How many quarters do you have?");
	  int numQuarters = scnr.nextInt();
	  System.out.println("How many half-dollars do you have?");
	  int numHalfDollars = scnr.nextInt();
	  System.out.println("How many dollar coins do you have?");
	  int numDollarCoins = scnr.nextInt();
	 
      
	  double total = (PENNY_VALUE * numPennies)+(NICKEL_VALUE * numNickels)+(DIME_VALUE * numDimes)+(QUARTER_VALUE * numQuarters)+(HALF_DOLLAR_VALUE * numHalfDollars)+(DOLLAR_COIN_VALUE * numDollarCoins);;
      
	   System.out.println( "Total value = " + formatter.format(total) );
	  // console.close();

   } // end main
}    // end class