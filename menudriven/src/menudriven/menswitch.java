package menudriven;


import java.util.*;

public class menswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Menu");
	System.out.println("**********");
	System.out.println("Add");
	System.out.println("Subtract");
	System.out.println("Multiply");
	System.out.println("Divide");
	
	System.out.println("");
	
	System.out.println("Enter 2 numbers");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	
	System.out.println("Enter operation");
	sc.nextLine();
	String uinput = sc.nextLine();
	

	
	
	switch (uinput) {
	
	case "Add": System.out.println(num1+num2);
		break;
	case "Subtract": System.out.println(num1-num2);
	 	break;
	case "Multiply": System.out.println(num1*num2);
		break;
	case "Divide": System.out.println(num1/num2);
		break; 	
	default : System.out.println("Invalid input");
		break;
	
	}
	
	
	
	}

}
