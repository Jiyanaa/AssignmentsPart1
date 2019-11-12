package com.training.assignments;

public class TotalAndAverageMarkCalculator {
	
	
	public static void findTotalAndAverageMark(int[][] array) {
		int[][] studentmark = new int[2][3];
		
		int totalmark=0,average=0;
		///this code is to print each student average and total marks individually
		int count=0;
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				totalmark += array[i][j];
				average = totalmark/3;
			}
			count+=1;
			System.out.println("Student "+count+" total mark:"+totalmark);
			System.out.println("Student "+count+" average mark:"+average);
		}
		count = 0;
		System.out.println("-------------------------------------------------------------------");
		//this code is to calculate each subject total mark and average marks
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				totalmark += array[j][i];
				average = totalmark/3;
			}
			
			count+=1;
			System.out.println("subject "+count+" total mark:"+totalmark);
			System.out.println("subject "+count+" average mark:"+average);
		}
		
	}
	
}
