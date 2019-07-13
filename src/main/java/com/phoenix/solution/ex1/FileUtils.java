package com.phoenix.solution.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileUtils {

	public static void main(String[] args) {
		FileUtils  classUtils = new FileUtils() ; 
		classUtils.printDate();
	}
	public void printDate ()
	{
		/*
		 * solution 
		 */
		LocalDate date = LocalDate.now() ;
		System.out.println(date);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy") ; 
		var formatttedDate = formatter.format(date); 
		System.out.println(formatttedDate);
		
		
	}
}
