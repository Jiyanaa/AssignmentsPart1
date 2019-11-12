package com.training.assignments;

public class BubbleSort {

	public static int[] sortArrayUsingBubbleSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++){
		       for(int j=i+1;j<array.length;j++){
		    	   /*
		    	    * to check coincide elements if first element value is greater than second
		    	    * element value then swap two element
		    	   */
		           if(array[i]>array[j]){
		               int temp = array[i];	//here temp is temporary variable to store first element value
		               array[i]=array[j];
		               array[j] = temp;
		           }
		       }
		}
		
		return array;		
	}

}
