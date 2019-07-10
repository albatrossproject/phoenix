package com.phoenix.solution.ex1;

import java.time.LocalDate;

public class FileUtils {

	public static void main(String[] args) {
		FileUtils  classUtils = new FileUtils() ; 
		classUtils.printDate();
	}
	public void printDate ()
	{
		LocalDate date = LocalDate.now() ;
		System.out.println(date);
		
	}
}
