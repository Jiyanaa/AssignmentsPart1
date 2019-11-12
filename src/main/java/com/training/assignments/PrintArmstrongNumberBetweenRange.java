package com.training.assignments;


public class PrintArmstrongNumberBetweenRange {
	public static int[] calculate() {
		
		int armstrongNoArray[] = new int[5];
		int i=0;
		for(int number=100;number<=999;number++) {
			int originalNo = number;
			int rem=0,result=0;
				
			while(originalNo!=0) {
				rem = originalNo % 10;
				result += (rem*rem*rem);
				originalNo/=10;
			}
			if(number==result) {
				armstrongNoArray[i]=number;
				i=i+1;
			}

		}
		
		return armstrongNoArray;		
	
	}
	
}
