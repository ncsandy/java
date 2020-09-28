package leapyear;

import java.util.*;


public class calculator {

	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter year");
	
	int year = sc.nextInt();
	
	if(year % 4 != 0) {
		System.out.println("common year");
	
	}	
	 else if(year % 100 != 0) {
			System.out.println("leap year");
	 }
	 else if (year % 400 != 0) {
		 System.out.println("common year");
	 }
		
	else {
		System.out.println("leap year");
	}

	}

}
