package RelationOperator;

import java.util.Scanner;

public class RelationProgram2 {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner (System.in);
			System.out.println("Enter the first number");
			int a=scan.nextInt();
			System.out.println("Enter the second number");
			int b=scan.nextInt();
			
			System.out.println(a==b);
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a!=b);
			
	}

}
