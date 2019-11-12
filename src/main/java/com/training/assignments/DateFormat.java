package com.training.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import com.training.assignments.exception.InvalidDateFormatException;

public class DateFormat {

	public static String convertDateToSpecifiedFormat(String dateString) throws ParseException {
		String dateInputPattern = "dd,MM,yyyy"; //here the pattern of input date is (day,month,year-ex:09,12,1200)
		String dateTargetPattern = "dd/MMMM/yyyy"; // for Full month name

		//simpleDateFormat is used to format string in particular date format
		SimpleDateFormat sdf = new SimpleDateFormat( dateInputPattern );
		
		//parse method is used to parse string from starting index to the lase index
		Date date = sdf.parse( dateString );
		
		//here all results are printed
		System.out.println( "Date Pattern: " + dateInputPattern );
		System.out.println( "Date String : " + dateString );
		System.out.println( "Date Value  : " + date );
		
		//here we convert input parsed string to targeted pattern
		sdf.applyPattern( dateTargetPattern );
		System.out.println( "Target Pattern: " + dateTargetPattern );
		
		//format string into date 
		String result = sdf.format(date);
		
		System.out.println( "Pattern based Date Value: " + result );
		return result;
	}
	
}
