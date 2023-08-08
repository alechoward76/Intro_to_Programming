//Alec Howard
//Intro Prog Prob Slvng
//Exact Change
//September 5, 2020, 12:17 AM


import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;


public class Lab2PaneCoins {  
	   
   public static void main( String[] args ) {
   
		   
	   final double PENNY_VALUE = 0.01;
	   final double NICKEL_VALUE = 0.05;
	   final double DIME_VALUE = 0.10;
	   final double QUARTER_VALUE = 0.25;
	   final double HALF_DOLLAR_VALUE = 0.50;
	   final double DOLLAR_COIN_VALUE = 1.00;
	   String input = null;
	   
	   	   NumberFormat formatter
	         = NumberFormat.getCurrencyInstance(Locale.US);
	   	   
	  input = JOptionPane.showInputDialog("How many penneys do you have?");
	  int numPennies = Integer.parseInt( input );
	  input = JOptionPane.showInputDialog("How many nickels do you have?");
	  int numNickels = Integer.parseInt( input );
	  input = JOptionPane.showInputDialog("How many dimes do you have?");
	  int numDimes = Integer.parseInt( input );
	  input = JOptionPane.showInputDialog("How many quarters do you have?");
	  int numQuarters = Integer.parseInt( input );
	  input = JOptionPane.showInputDialog("How many half-dollars do you have?");
	  int numHalfDollars = Integer.parseInt( input );
	  input = JOptionPane.showInputDialog("How many dollar coins do you have?");
	  int numDollarCoins = Integer.parseInt( input );
	 
      
	  double total = (PENNY_VALUE * numPennies)+(NICKEL_VALUE * numNickels)+(DIME_VALUE * numDimes)+(QUARTER_VALUE * numQuarters)+(HALF_DOLLAR_VALUE * numHalfDollars)+(DOLLAR_COIN_VALUE * numDollarCoins);;
      
	   //System.out.println( "Total value = " + formatter.format(total) );
	   JOptionPane.showMessageDialog(null, formatter.format(total));
	   // console.close();

   } // end main
}    // end class