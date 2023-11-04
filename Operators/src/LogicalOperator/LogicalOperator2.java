package LogicalOperator;

import java.util.Scanner;

public class LogicalOperator2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the first number");
		boolean a=scan.nextBoolean();
		System.out.println("Enter the second number");
		boolean b=scan.nextBoolean();


		System.out.println(a&&a);
		System.out.println(a&&b);
		System.out.println(b&&a);
		System.out.println(b&&b);
		System.out.println(a||a);
		System.out.println(a||b);
		System.out.println(b||a);
		System.out.println(b||b);
	}

}
