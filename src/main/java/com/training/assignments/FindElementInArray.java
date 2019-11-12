package com.training.assignments;

public class FindElementInArray {

	public static boolean checkNoIsPresentInArrayOrNot(int number) {
		int[] array =   {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		/*for(int i=0;i<array.length-1;i++){
		       for(int j=i+1;j<array.length;j++){
		           if(array[i]>array[j]){
		               int temp = array[i];
		               array[i]=array[j];
		               array[j] = temp;
		           }
		       }
		}*/
		
		//it check each element into array with number if its equals to array element return true otherwise return false
		for(int i=0;i<array.length;i++) {
			if(array[i]==number) {	
				return true;
			}
			
		}
		return false;
	}

}
