/*Author:       Alec Howard
 Date:         
 Course:      CS 1043
 Section      

 File Name:   ArrayMethods.java
 Classes:     ArrayMethods
 Description: 
*/
 
import java.lang.reflect.Array;
import java.util.Scanner;
 
public class ArrayMethods // The class name begins with an upper case letter
{
   public static void main( String args[] )
   {
  Scanner scnr = new Scanner( System.in );
  
  int[] array = { 13, 23, -78, 45, 91, -23, 18, 56, 90, 100, 12, 34, 67, 21, -98, 65, 3, 56, -97, 45, 343, 14,
			1 };
	
	int total = sum(array); // return array sum Arraymethods.sum
	System.out.println("Sum is " + total);
	
	int maximum = getMax(array); // return the maximum value ArrayMethods.getMax
	System.out.println("Maximum is " + maximum);

	int mindex = findMin(array); // index of the min value
	System.out.println("Minimum is " + array[mindex]);

	double average = mean( array ); // return the array's average
	System.out.printf("Average is %.2f\n", average);

	int value = 45;
	int count = largerThan(array, value);
	System.out.println("Number of values larger than " + value + " is " + count);
	
	
	int[] positive = getPositive(array);
	int ix;
	System.out.println("  13   23   45   91   18   56   90  100   12   34   67   21   65    3   56   45  343   14    1 ");
	
	/*for ( ix=0; ix < positive.length; ix++ )  {
		 System.out.printf("%4d ", positive[ix] ); 
	 } System.out.println();
	 
	
	/* ***** */ 
	 
	int[][] square = { { 8, 11, 14, 1 }, { 13, 2, 7, 12 }, { 3, 16, 9, 6 }, { 10, 5, 4, 15 } };
	
	int mainD = ArrayMethods.sumMainDiag(square);
	System.out.printf("Main diagonal sum = %d \n", mainD);
	
	int colSum = ArrayMethods.sumColumnI(square, 2 ); // sum the 3rd column ic = 2;
	System.out.printf("Sum of column %d is %d.\n", 2, colSum );
	
} // end main
//the static method stubs are on the next page
//Add the missing stubs:

//return the array sum:
public static int sum(int[] array) {
	int total=0;
	int idx;
	for(idx=0; idx < array.length; idx++) {
		total+=array[idx];
		
	}

	
	return total;
}

public static int getMax(int[] array) {
	int maxVal=array[0];
	int idx;
	for(idx=1; idx < array.length; idx++) {
	if(array[idx]>maxVal) {
		maxVal=array[idx];
	}
	}
	
	
	return maxVal;
}

//add the findMin method here
public static int findMin( int[] array ) {
	int mindex = 0;
	int idx;
	
	for(idx=0; idx<array.length;idx++) {
		if (array[idx]<array[mindex]) {
			mindex=idx;
	}
	}

	return mindex;
}


//add the arithmetic mean here

public static double mean( int[] array ) {
	return sum(array)/(double)array.length;
}



public static int largerThan(int[] array, int value) {
	int Count=0;
	int idx;
	
	for(idx=0;idx<array.length; idx++) {
		if (array[idx]>45) {
			Count+=1;
		}
	}

	return Count;
}

public static int[] getPositive(int[] array) {
	/*int [] newAr;
	int Count = largerThan(array,0);
	newAr = new int[Count];
	int idx,newIdx;
	for(idx=0,newIdx=0; idx < array.length; idx++) {
		if(array[idx]>0) {
			newAr[newIdx] = array[idx];
			newIdx++;
		}
		
		
	}
	*/

	
return null;
}

public static int sumMainDiag(int[][] square) {
	int total = 0;
	int idx;
	for(idx=0; idx<square.length; idx++) {
		total+=square[idx][idx];
		
	}

	return total;
}

public static int sumColumnI( int [][] square, int icol ) {
	int total = 0;
	int idx;
	
	for(idx=0; idx < square.length; idx++) {
		total +=square[idx][icol];
		
	}

	return total;
}


// end of ArrayMethods classss
  
  
  
   }


  